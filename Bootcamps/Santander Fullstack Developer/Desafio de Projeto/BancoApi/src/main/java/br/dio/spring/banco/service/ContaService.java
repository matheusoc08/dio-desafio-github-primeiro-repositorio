package br.dio.spring.banco.service;

import br.dio.spring.banco.model.Conta;
import br.dio.spring.banco.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContaService {

    @Autowired
    ContaRepository contaRepository;

    public List<Conta> contaFindAll(){
        return contaRepository.findAll();
    }

    public Conta contaFindById(Long id){
        Optional<Conta> conta = contaRepository.findById(id);
        return conta.get();
    }

    public void contaSave(Conta conta){
        contaRepository.save(conta);
    }

    public void contaUpdate(Long id, Conta conta){
        Optional<Conta> buscaConta = contaRepository.findById(id);
        if(buscaConta.isPresent())
            contaRepository.save(conta);
    }

    public void contaDeactivate(Long id){
        contaRepository.deleteById(id);
    }

}
