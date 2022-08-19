package com.dio.heroes;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

import com.dio.heroes.controller.HeroController;
import com.dio.heroes.model.Hero;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;


@Component
public
class HeroModelAssembler implements RepresentationModelAssembler<Hero, EntityModel<Hero>> {
    @Override
    public EntityModel<Hero> toModel(Hero hero) {

        return EntityModel.of(hero, //
                linkTo(methodOn(HeroController.class).one(hero.getId())).withSelfRel(),
                linkTo(methodOn(HeroController.class).all()).withRel("heroes"));
    }
}