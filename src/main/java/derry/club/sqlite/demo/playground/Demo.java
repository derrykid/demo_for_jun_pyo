package derry.club.sqlite.demo.playground;

import derry.club.sqlite.demo.playground.entity.Student;
import derry.club.sqlite.demo.playground.entity.StudentMark;
import derry.club.sqlite.demo.playground.entity.StudentMarkId;
import derry.club.sqlite.demo.playground.entity.Subject;
import derry.club.sqlite.demo.playground.repository.StudentMarkRepository;
import derry.club.sqlite.demo.playground.repository.StudentRepository;
import derry.club.sqlite.demo.playground.repository.SubjectRepository;
import derry.club.sqlite.demo.playground.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class Demo {

    public static void main(String[] args) {
        SpringApplication.run(Demo.class, args);
    }


    @Bean
    public CommandLineRunner run(StudentRepository studentRepository,
                                 SubjectRepository subjectRepository,
                                 StudentMarkRepository studentMarkRepository) {
        return args -> {

            Student jack = new Student();
            jack.setName("jack");
            jack.setGrade(1);

            studentRepository.save(jack);

            Subject english = new Subject();
            english.setName("English");

            subjectRepository.save(english);

            StudentMarkId id = new StudentMarkId();
            id.setStudent(jack);
            id.setSubject(english);

            StudentMark mark = new StudentMark();
            mark.setMark(75);
            mark.setMarkId(id);


            studentMarkRepository.save(mark);

        };
    }


}
