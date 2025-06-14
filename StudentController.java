package com.example.controller;

import com.example.entity.Student;
import com.example.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    public StudentController(StudentService studentService) {
    }

    @GetMapping
    public List<Student> getAll() {
        return StudentService.getAll();
    }

    @GetMapping("/startswith-a")
    public List<Student> getNameStartsWithA() {
        return StudentService.getNameStartsWithA();
    }

    @GetMapping("/startswith-a-kolkata")
    public List<Student> getNameStartsWithAInKolkata() {
        return StudentService.getNameStartsWithAInKolkata();
    }

    @GetMapping("/marks")
    public List<Set<Integer>> getAllMarks() {
        return StudentService.getAllMarks();
    }

    @GetMapping("/high-performers")
    public List<Student> getHighPerformers() {
        return StudentService.getMarksAbove80InAllSubjects();
    }

    @GetMapping("/name-length")
    public List<String> getStudentNamesWithLengthGT5() {
        return StudentService.getStudentNamesWithLengthGreaterThan5();
    }
}
