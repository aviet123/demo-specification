package com.example.demo.filter;

import lombok.Data;


import java.util.Arrays;
import java.util.List;

@Data
public class TeamFilter {
    private String isDelete;
    private List<String> queryList = Arrays.asList("name","leaderShip","isDelete","major");
}
