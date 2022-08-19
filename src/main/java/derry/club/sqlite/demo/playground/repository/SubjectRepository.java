package derry.club.sqlite.demo.playground.repository;

import derry.club.sqlite.demo.playground.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
