package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String leaderShip;
    private String major;
    private LocalDate foundedDate;
    private LocalDate endDate;
    private String isDelete;

    public Team(String name, String leaderShip, String major) {
        this.name = name;
        this.leaderShip = leaderShip;
        this.major = major;
    }

}
