package Repositories;

import Entitites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UsersRepository extends JpaRepository<User, UUID> {
}