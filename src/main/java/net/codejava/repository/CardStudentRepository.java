package net.codejava.repository;

import net.codejava.model.CardStudent;
import net.codejava.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CardStudentRepository extends CrudRepository<CardStudent, Integer> {
    List<CardStudent> findAllBy();
}
