package com.tiket.springbootmongodb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collation = "totos")
public class TodoTDO {
    @Id
    private String id;
    private String todo;
    private String desctiption;
    private Boolean completed;
    private Date createdAt;
    private Date updatedAt;
}
