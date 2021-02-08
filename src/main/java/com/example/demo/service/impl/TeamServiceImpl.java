package com.example.demo.service.impl;

import com.example.demo.model.Team;
import com.example.demo.repository.TeamRepository;
import com.example.demo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    TeamRepository teamRepository;

    @Override
    public Iterable<Team> findAll() {
        String currentDate = "2020-01-04";
        LocalDate localDate = LocalDate.parse(currentDate);
        Specification<Team> conditions = Specification.where((TeamSpecification.isCurrentTimeGreaterOrEqualsEndDate(localDate))
                                                        .and(TeamSpecification.isCurrentTimeLessThanOrEqualsFoundedDate(localDate))
                                                        .and(TeamSpecification.buildCombineQuerySpecification("du","name"))
                                                        .and(TeamSpecification.buildCombineQuerySpecification("N","isDelete")));
        return teamRepository.findAll(conditions);
    }

    @Override
    public Optional<Team> findUserById(Long id) {
        return teamRepository.findById(id);
    }

    @Override
    public Team save(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public boolean remove(Long id) {
        return false;
    }
}
