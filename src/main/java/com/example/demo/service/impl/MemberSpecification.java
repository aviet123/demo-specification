package com.example.demo.service.impl;

import com.example.demo.model.Member;
import com.example.demo.model.Member_;
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDate;

public class MemberSpecification {

    public static Specification<Member> hasAddress(String address){
        return ((root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get(Member_.ADDRESS),address));
    }
    public static Specification<Member> hasJobTitle(String job){
        return ((root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get(Member_.JOB_TITLE),job));
    }
}
