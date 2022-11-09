package ru.pp.crudspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pp.crudspringboot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
