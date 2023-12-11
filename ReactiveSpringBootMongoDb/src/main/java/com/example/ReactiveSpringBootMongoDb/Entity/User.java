package com.example.ReactiveSpringBootMongoDb.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "UserCollection")
public class User {

    private Integer id;
    private String name;
    private String address;

}
