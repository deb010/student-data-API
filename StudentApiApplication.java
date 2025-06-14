package com.example;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class StudentApiApplication implements CommandLineRunner {
	private final StudentRepository studentRepository;
    public StudentApiApplication(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public static void main(String[] args) {
		SpringApplication.run(StudentApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Student> students = List.of(
					new Student(null, "Amitava", "Kolkata", "ankit@mail.com", Set.of(90, 85, 92, 88)),
					new Student(null, "Amit", "Delhi", "amit@mail.com", Set.of(80, 75, 89, 83)),
					new Student(null, "Arjun", "Kolkata", "arjun@mail.com", Set.of(91, 88, 85, 90)),
					new Student(null, "Bobby", "Mumbai", "bobby@mail.com", Set.of(72, 65, 70, 68)),
					new Student(null, "Chinmoy", "Chennai", "chin@mail.com", Set.of(95, 91, 94, 92)),
					new Student(null, "Arpan", "Kolkata", "ap@mail.com", Set.of(89, 92, 90, 87)),
					new Student(null, "Deb", "Pune", "dev@mail.com", Set.of(85, 78, 80, 79)),
					new Student(null, "Esha", "Kolkata", "esha@mail.com", Set.of(93, 94, 96, 91)),
					new Student(null, "Farhan", "Delhi", "farhan@mail.com", Set.of(84, 88, 82, 87)),
					new Student(null, "Gargge", "Goa", "gg@mail.com", Set.of(88, 90, 85, 86))
			);
			studentRepository.saveAll(students);
		System.out.println("All students saved");

	}

//	@Bean
//	public CommandLineRunner dataLoader(StudentRepository studentRepository) {
//		return args -> {
//			List<Student> students = List.of(
//					new Student(null, "Ankit", "Kolkata", "ankit@mail.com", Set.of(90, 85, 92, 88)),
//					new Student(null, "Amit", "Delhi", "amit@mail.com", Set.of(80, 75, 89, 83)),
//					new Student(null, "Arjun", "Kolkata", "arjun@mail.com", Set.of(91, 88, 85, 90)),
//					new Student(null, "Bobby", "Mumbai", "bobby@mail.com", Set.of(72, 65, 70, 68)),
//					new Student(null, "Chris", "Chennai", "chris@mail.com", Set.of(95, 91, 94, 92)),
//					new Student(null, "Alice", "Kolkata", "alice@mail.com", Set.of(89, 92, 90, 87)),
//					new Student(null, "David", "Pune", "david@mail.com", Set.of(85, 78, 80, 79)),
//					new Student(null, "Esha", "Kolkata", "esha@mail.com", Set.of(93, 94, 96, 91)),
//					new Student(null, "Farhan", "Delhi", "farhan@mail.com", Set.of(84, 88, 82, 87)),
//					new Student(null, "George", "Goa", "george@mail.com", Set.of(88, 90, 85, 86))
//			);
//			studentRepository.saveAll(students);
//			System.out.println("All Data Loaded Successfully");
//		};
//	}
}
