package com.example.demo;

import com.example.demo.model.Member;
import com.example.demo.model.Team;
import com.example.demo.service.MemberService;
import com.example.demo.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);;
    }

}
