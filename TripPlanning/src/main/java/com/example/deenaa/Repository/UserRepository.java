package com.example.deenaa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.deenaa.Model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
