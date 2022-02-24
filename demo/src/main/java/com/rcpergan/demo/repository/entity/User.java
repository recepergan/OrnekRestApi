package com.rcpergan.demo.repository.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Document
public class User {

    @Id
    String id;
    String name;
    String surname;
    int state;
}
