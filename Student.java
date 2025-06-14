package com.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
//@Builder
@Entity(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roll;

    private String name;
    private String address;
    private String email;

    @ElementCollection
    private Set<Integer> marks;
}
