package com.example.demo.service.impl;

import com.example.demo.model.Team;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.metamodel.SingularAttribute;

public class CommonSpecification {

    public static Specification<Team> buildLikeSpecification(String value, String field) {
        return (root, query, builder) -> builder.like(root.get(field), "%"+value+"%");
    }
    public static Specification<Team> buildEqualsSpecification(String value, String field) {
        return (root, query, builder) -> builder.equal(root.get(field), value);
    }
}
