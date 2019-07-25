package me.amir.controller;

import com.google.gson.JsonObject;
import me.amir.model.Message;
import me.amir.service.MessageService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {
    private MessageService service;

    public  MessageController(MessageService service) {
        this.service = service;
    }

    @PostMapping()
    public JsonObject addMessage(@RequestBody Message message) {
        this.service.addMessage(message);
        // Success message
        JsonObject result = new JsonObject();
        result.addProperty("success", true);

        return result;
    }

    @GetMapping()
    public List<Message> all() {
        return this.service.getAll();
    }
}
