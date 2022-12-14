package com.example.demo.repositories;

import com.example.demo.entitites.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UsersInfoRepository extends JpaRepository<UserInfo, UUID> {
}
