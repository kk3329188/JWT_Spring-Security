package com.example.jwt_practice;

import com.example.jwt_practice.domain.Role;
import com.example.jwt_practice.domain.User;
import com.example.jwt_practice.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class JwtPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtPracticeApplication.class, args);
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner run(UserService userService){
      return args -> {
          userService.saveRole(new Role(null,"ROLE_USER"));
          userService.saveRole(new Role(null,"ROLE_MANAGER"));
          userService.saveRole(new Role(null,"ROLE_ADMIN"));
          userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

          userService.saveUser(new User(null,"Jhon Travolta","john","1234",new ArrayList<>()));
          userService.saveUser(new User(null,"Kevin Gun","kevin","1234",new ArrayList<>()));
          userService.saveUser(new User(null,"Nancy Lu","nancy","1234",new ArrayList<>()));
          userService.saveUser(new User(null,"Lebron James","james","1234",new ArrayList<>()));


          userService.addRoleToUser("kevin","ROLE_USER");
          userService.addRoleToUser("kevin","ROLE_MANAGER");
          userService.addRoleToUser("kevin","ROLE_ADMIN");
          userService.addRoleToUser("james","ROLE_USER");
          userService.addRoleToUser("nancy","ROLE_USER");
          userService.addRoleToUser("nancy","ROLE_MANAGER");
          userService.addRoleToUser("john","ROLE_USER");



      };
    }
}


