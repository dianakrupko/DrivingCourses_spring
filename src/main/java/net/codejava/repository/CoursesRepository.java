package net.codejava.repository;

import net.codejava.model.Category;
import net.codejava.model.Courses;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CoursesRepository extends CrudRepository<Courses, Integer> {
        List<Courses> findAllBy();
}
