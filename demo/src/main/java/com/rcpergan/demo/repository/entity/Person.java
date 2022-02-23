package com.rcpergan.demo.repository.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Table(name = "tblperson")
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   // @SequenceGenerator(name = "sq_tblpersonid",sequenceName = "sq_tblpersonid",initialValue = 1,allocationSize = 1)
   // @GeneratedValue(generator = "sq_tblperson_id")
    long id;
    String name;
    long birthdate;
    String tckimlik;
    int state;
}
