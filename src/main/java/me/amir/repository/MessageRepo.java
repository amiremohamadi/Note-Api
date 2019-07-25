package me.amir.repository;

import me.amir.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface MessageRepo extends MongoRepository<Message, String> {
    ArrayList<Message> findByName(String name);
}
