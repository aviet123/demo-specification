package com.example.demo.controller;

import com.example.demo.model.Member;
import com.example.demo.model.Team;
import com.example.demo.service.MemberService;
import com.example.demo.service.TeamService;
import com.example.demo.service.impl.MemberSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/members")
public class Controller {
    @Autowired
    TeamService teamService;

    @Autowired
    MemberService memberService;

    @GetMapping("")
    public ResponseEntity<?> getAllOrg(){
        Iterable<Member> members = memberService.findAll();
        return new ResponseEntity<>(members, HttpStatus.OK);
    }

}
