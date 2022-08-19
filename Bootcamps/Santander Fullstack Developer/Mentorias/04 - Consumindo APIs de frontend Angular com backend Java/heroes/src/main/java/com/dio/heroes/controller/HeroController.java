package com.dio.heroes.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

import com.dio.heroes.HeroModelAssembler;
import com.dio.heroes.exceptions.HeroNotFoundException;
import com.dio.heroes.model.Hero;
import com.dio.heroes.repository.HeroRepository;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HeroController {

    private final HeroRepository repository;
    private final HeroModelAssembler assembler;

    HeroController(HeroRepository repository, HeroModelAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    @GetMapping("/heroes")
    public CollectionModel<EntityModel<Hero>> all() {

        List<EntityModel<Hero>> heroes = repository.findAll().stream()
                .map(assembler::toModel) //
                .collect(Collectors.toList());

        return CollectionModel.of(heroes, linkTo(methodOn(HeroController.class).all()).withSelfRel());
    }

    @PostMapping("/heroes")
    ResponseEntity<?> newHero(@RequestBody Hero newHero) {

        EntityModel<Hero> entityModel = assembler.toModel(repository.save(newHero));

        return ResponseEntity //
                .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri()) //
                .body(entityModel);
    }

    @GetMapping("/heroes/{id}")
    public EntityModel<Hero> one(@PathVariable Long id) {

        Hero heroes = repository.findById(id) //
                .orElseThrow(() -> new HeroNotFoundException(id));

        return assembler.toModel(heroes);
    }

    @PutMapping("/heroes/{id}")
    ResponseEntity<?> replaceHero(@RequestBody Hero newHero, @PathVariable Long id) {

        Hero updatedHero = repository.findById(id) //
                .map(hero -> {
                    hero.setName(newHero.getName());
                    hero.setDescription(newHero.getDescription());
                    return repository.save(hero);
                }) //
                .orElseGet(() -> {
                    newHero.setId(id);
                    return repository.save(newHero);
                });

        EntityModel<Hero> entityModel = assembler.toModel(updatedHero);

        return ResponseEntity //
                .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri()) //
                .body(entityModel);
    }

    @DeleteMapping("/heroes/{id}")
    ResponseEntity<?> deleteHero(@PathVariable Long id) {

        repository.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}