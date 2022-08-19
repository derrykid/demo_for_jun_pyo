package derry.club.sqlite.demo.playground.repository;

import derry.club.sqlite.demo.playground.entity.StudentMark;
import derry.club.sqlite.demo.playground.entity.StudentMarkId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentMarkRepository extends JpaRepository<StudentMark, StudentMarkId> {
}
