package net.codejava.repository;

import net.codejava.model.Instructor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InstructorRepository extends CrudRepository<Instructor, Integer> {
        List<Instructor> findAllBy();
}