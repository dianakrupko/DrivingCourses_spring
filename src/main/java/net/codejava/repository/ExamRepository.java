package net.codejava.repository;

import net.codejava.model.Courses;
import net.codejava.model.Exam;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExamRepository extends CrudRepository<Exam, Integer> {
    List<Exam> findAllBy();
}
