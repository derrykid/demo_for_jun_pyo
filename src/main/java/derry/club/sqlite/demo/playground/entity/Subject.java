package derry.club.sqlite.demo.playground.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "subject")
@Data
@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private Long id;

    private String name;
}
