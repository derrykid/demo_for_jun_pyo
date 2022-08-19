package derry.club.sqlite.demo.playground.service;

import derry.club.sqlite.demo.playground.entity.Student;
import derry.club.sqlite.demo.playground.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

}
