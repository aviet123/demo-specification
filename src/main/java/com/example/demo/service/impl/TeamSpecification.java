package com.example.demo.service.impl;

import com.example.demo.filter.TeamFilter;
import com.example.demo.model.Team;
import com.example.demo.model.Team_;
import org.springframework.data.jpa.domain.Specification;
import java.time.LocalDate;

public class TeamSpecification {
    private static final TeamFilter filter = new TeamFilter();


    public static Specification<Team> buildCombineQuerySpecification(String value, String fieldConditions){
        Specification<Team> conditions = Specification.where(null);
            if (fieldConditions.equals(filter.getQueryList().get(0)) || fieldConditions.equals(filter.getQueryList().get(1))) {
                conditions = CommonSpecification.buildLikeSpecification(
                        value, fieldConditions);
            }
            if (fieldConditions.equals(filter.getQueryList().get(2))){
                conditions = CommonSpecification.buildEqualsSpecification(
                        value, fieldConditions);
            }
        System.out.println(filter.getQueryList().get(1)+" "+filter.getQueryList().get(3));
        return conditions;
    }
    public static Specification<Team> isCurrentTimeLessThanOrEqualsFoundedDate(LocalDate activeDate){
        return ((root, criteriaQuery, criteriaBuilder)
                -> criteriaBuilder.lessThanOrEqualTo(root.get(Team_.FOUNDED_DATE).as(LocalDate.class),activeDate));
    }
    public static Specification<Team> isCurrentTimeGreaterOrEqualsEndDate(LocalDate activeDate){
        return ((root, criteriaQuery, criteriaBuilder)
                -> criteriaBuilder.greaterThanOrEqualTo(root.get(Team_.END_DATE).as(LocalDate.class),activeDate));
    }
}