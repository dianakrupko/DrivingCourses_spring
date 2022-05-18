package net.codejava.repository;

import net.codejava.model.Instructor;
import net.codejava.model.IntermediateTest;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IntermediateTestRepository extends CrudRepository<IntermediateTest, Integer> {
    List<IntermediateTest> findAllBy();
}