package com.myphotoshop.fotoapp.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myphotoshop.fotoapp.users.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Long>{

}
