package derry.club.sqlite.demo.playground.repository;

import derry.club.sqlite.demo.playground.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
