package com.example.service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StudentService {
    private static StudentRepository studentRepository ;

    public StudentService(StudentRepository studentRepository) {
        StudentService.studentRepository = studentRepository;
    }

//    @PostConstruct
//    public void init() {
//        List<Student> students = List.of(
//                new Student(null, "Ankit", "Kolkata", "ankit@mail.com", Set.of(90, 85, 92, 88)),
//                new Student(null, "Amit", "Delhi", "amit@mail.com", Set.of(80, 75, 89, 83)),
//                new Student(null, "Arjun", "Kolkata", "arjun@mail.com", Set.of(91, 88, 85, 90)),
//                new Student(null, "Bobby", "Mumbai", "bobby@mail.com", Set.of(72, 65, 70, 68)),
//                new Student(null, "Chris", "Chennai", "chris@mail.com", Set.of(95, 91, 94, 92)),
//                new Student(null, "Alice", "Kolkata", "alice@mail.com", Set.of(89, 92, 90, 87)),
//                new Student(null, "David", "Pune", "david@mail.com", Set.of(85, 78, 80, 79)),
//                new Student(null, "Esha", "Kolkata", "esha@mail.com", Set.of(93, 94, 96, 91)),
//                new Student(null, "Farhan", "Delhi", "farhan@mail.com", Set.of(84, 88, 82, 87)),
//                new Student(null, "George", "Goa", "george@mail.com", Set.of(88, 90, 85, 86))
//        );
//        studentRepository.saveAll(students);
//
//    }

    public static List<Student> getAll() {
        return studentRepository.findAll();
    }

    public static List<Student> getNameStartsWithA() {
        return studentRepository.findAll().stream().filter(student -> student.getName().startsWith("A")).toList();
    }

    public static List<Student> getNameStartsWithAInKolkata() {
        return studentRepository.findAll().stream()
                .filter(s -> s.getName().startsWith("A") && "Kolkata".equalsIgnoreCase(s.getAddress()))
                .toList();
    }

    public static List<Set<Integer>> getAllMarks() {
        return studentRepository.findAll().stream()
                .map(Student::getMarks)
                .toList();
    }

    public static List<Student> getMarksAbove80InAllSubjects() {
        return studentRepository.findAll().stream()
                .filter(s -> s.getMarks().stream().allMatch(m -> m >= 80))
                .toList();
    }

    public static List<String> getStudentNamesWithLengthGreaterThan5() {
        return studentRepository.findAll().stream()
                .map(Student::getName)
                .filter(name -> name.length() > 5)
                .toList();
    }
}
