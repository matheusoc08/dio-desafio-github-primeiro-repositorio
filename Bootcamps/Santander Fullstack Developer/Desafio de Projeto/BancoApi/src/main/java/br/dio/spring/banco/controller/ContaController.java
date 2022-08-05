package br.dio.spring.banco.controller;

import br.dio.spring.banco.model.Conta;
import br.dio.spring.banco.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("conta")
public class ContaController {

    @Autowired
    ContaService contaService;

    @GetMapping
    public ResponseEntity<List<Conta>> buscarContas(){
        return ResponseEntity.ok(contaService.contaFindAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Conta> buscaPorId(@PathVariable Long id){
        return ResponseEntity.ok(contaService.contaFindById(id));
    }

    @PostMapping
    public ResponseEntity<Conta> cadastrarConta(@RequestBody Conta conta){
        contaService.contaSave(conta);
        return ResponseEntity.ok(conta);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Conta> atualizarConta(@PathVariable Long id, @RequestBody Conta conta){
        contaService.contaUpdate(id, conta);
        return ResponseEntity.ok(conta);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> desativarConta(@PathVariable Long id){
        contaService.contaDeactivate(id);
        return ResponseEntity.ok().build();
    }
}
