package net.codejava.repository;

import net.codejava.model.IntermediateTest;
import net.codejava.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer> {
    List<Student> findAllBy();
}
