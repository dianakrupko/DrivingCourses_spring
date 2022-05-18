package net.codejava.repository;

import net.codejava.model.Student;
import net.codejava.model.Transport;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransportRepository extends CrudRepository<Transport, Integer> {
    List<Transport> findAllBy();
}