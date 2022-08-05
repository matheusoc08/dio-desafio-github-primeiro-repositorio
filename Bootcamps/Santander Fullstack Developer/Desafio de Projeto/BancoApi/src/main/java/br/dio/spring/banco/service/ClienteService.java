package br.dio.spring.banco.service;

import br.dio.spring.banco.model.Cliente;
import br.dio.spring.banco.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> clienteFindAll(){
        return clienteRepository.findAll();
    }

    public Cliente clienteFindById(Long id){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    public void clienteSave(Cliente cliente){
        clienteRepository.save(cliente);
    }

    public void clienteUpdate(Long id, Cliente cliente){
        Optional<Cliente> buscaCliente = clienteRepository.findById(id);
        if(buscaCliente.isPresent())
            clienteRepository.save((cliente));
    }

    public void clienteDeactivate(Long id){
        clienteRepository.deleteById(id);
    }


}
