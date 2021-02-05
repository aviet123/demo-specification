package com.example.demo.service.impl;

import com.example.demo.model.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository memberRepository;

    @Override
    public List<Member> findAll() {
        Specification<Member> conditions = Specification.where(MemberSpecification.hasAddress("hd")
                                                .and(MemberSpecification.hasJobTitle("se")));
        List<Member> r = memberRepository.findAll(conditions);
        return r;
    }

    @Override
    public Optional<Member> findUserById(Long id) {
        return memberRepository.findById(id);
    }

    @Override
    public Member save(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public boolean remove(Long id) {
        return false;
    }
}
