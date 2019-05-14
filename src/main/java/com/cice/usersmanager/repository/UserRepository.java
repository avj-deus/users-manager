package com.cice.usersmanager.repository;

import com.cice.usersmanager.controller.dto.UserDTO;
import com.cice.usersmanager.repository.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query(value = "SELECT id FROM user WHERE user= :user AND password= :password", nativeQuery = true)
    Long searchUserByLogin(@Param(value = "user") String user,  @Param(value = "password") String password);

    @Query(value = "INSERT INTO user (`user`, `password`) VALUES(:user, :password)", nativeQuery = true)
    Long createNewUser(@Param(value = "user") String user, @Param(value = "password") String password);

}
