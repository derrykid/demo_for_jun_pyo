package derry.club.sqlite.demo.playground.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "student_marks")
public class StudentMark {

    @EmbeddedId
    private StudentMarkId markId;

    private int mark;

}
