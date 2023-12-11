package com.example.ReactiveSpringBootMongoDb.Service;

import com.example.ReactiveSpringBootMongoDb.Entity.User;
import com.example.ReactiveSpringBootMongoDb.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public Mono<User> getUserFromDbById(int id){
        return userRepo.findById(id);
    }

    public Flux<User> findAll(){
        return userRepo.findAll();
    }

    public Mono<User> update(int id, User user){

        return userRepo.findById(id).map(c ->{
            c.setName(user.getName());
            c.setAddress(user.getAddress());
            return c;
        } ).flatMap(c -> userRepo.save(c));
    }

    public Mono<User> insert(User user){
        return userRepo.save(user);
    }

    public Mono<Void> delete(int id){
        return userRepo.deleteById(id);
    }


}
