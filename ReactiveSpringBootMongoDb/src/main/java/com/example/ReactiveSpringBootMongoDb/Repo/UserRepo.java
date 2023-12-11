package com.example.ReactiveSpringBootMongoDb.Repo;

import com.example.ReactiveSpringBootMongoDb.Entity.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepo extends ReactiveMongoRepository<User,Integer> {

}
