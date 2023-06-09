package com.nisum.hackaton.repository;

import com.nisum.hackaton.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

    Optional<User> findByIdUser(String idUser);
}
