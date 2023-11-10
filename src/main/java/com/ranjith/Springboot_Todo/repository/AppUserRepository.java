package com.ranjith.Springboot_Todo.repository;

import com.ranjith.Springboot_Todo.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser,Integer> {

    @Query("FROM AppUser u WHERE u.username =:username AND u.password =:password")
    AppUser findUserByName(@Param("username")String  uname,@Param("password") String pwd);
}
