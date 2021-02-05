package com.example.demo.repository;

import com.example.demo.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface MemberRepository extends JpaRepository<Member, Long>, JpaSpecificationExecutor<Member> {
}