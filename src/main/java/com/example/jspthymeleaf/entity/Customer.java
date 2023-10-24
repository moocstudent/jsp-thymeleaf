package com.example.jspthymeleaf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author zhangqi
 * @date 2023/10/24
 * @time 13:39
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private Long id;
    private String name;

    private Integer age;

    private Integer gender;

    private String job;

    private List<String> families;

}
