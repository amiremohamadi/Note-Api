package me.amir.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Data
@Document(collection = "message")
public class Message {
    @Id
    private String id;
    private String name;
    private String message;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
}
