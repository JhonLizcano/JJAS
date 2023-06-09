package com.nisum.hackaton.repository;

import com.nisum.hackaton.model.Commerce;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommerceRepository extends CrudRepository<Commerce, String> {

    Commerce save(Commerce commerce);

    Optional<Commerce> findByName(String name);
}
