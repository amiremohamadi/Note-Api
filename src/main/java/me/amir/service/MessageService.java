package me.amir.service;

import me.amir.model.Message;
import me.amir.repository.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepo repository;

    public MessageService(MessageRepo repository) {
        this.repository = repository;
    }

    public void addMessage(Message message) {
        this.repository.save(message);
    }

    public List<Message> getAll() {
        return this.repository.findAll();
    }
}
