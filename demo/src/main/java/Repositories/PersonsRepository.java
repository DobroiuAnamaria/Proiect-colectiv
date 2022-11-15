package Repositories;

import Entitites.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonsRepository extends JpaRepository<Person, UUID> {
}