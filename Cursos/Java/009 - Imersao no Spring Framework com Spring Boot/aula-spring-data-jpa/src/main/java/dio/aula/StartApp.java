package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {

//        List<User> users = repository.filtrarPorNome("Matheus"); //Query Override
        List<User> users = repository.findByNameContaining("Matheus"); //Query Method
        for(User u : users){
            System.out.println(u);
        }

        User u = repository.findByUsername("matheusc"); //Query Method
        System.out.println(u);

    }

    private void insertUser(){
        User user = new User();
        user.setName("Matheus");
        user.setUsername("matheusc");
        user.setPassword("dio123");

        repository.save(user);

        for(User u : repository.findAll()){
            System.out.println("Yay\n" + u);
        }

    }
}
