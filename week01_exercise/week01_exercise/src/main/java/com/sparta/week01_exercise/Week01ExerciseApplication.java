package com.sparta.week01_exercise;

import com.sparta.week01_exercise.domain.Person;
import com.sparta.week01_exercise.domain.PersonRepository;
import com.sparta.week01_exercise.domain.PersonRequestDto;
import com.sparta.week01_exercise.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing
@SpringBootApplication
public class Week01ExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week01ExerciseApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PersonRepository personRepository, PersonService personService) {
		return (args) -> {
			personRepository.save(new Person("장현애", 22, "학생"));

			System.out.println("데이터 인쇄");
			List<Person> personList = personRepository.findAll();
			for (int i=0; i<personList.size(); i++) {
				Person person = personList.get(i);
				System.out.println(person.getId());
				System.out.println(person.getName());
				System.out.println(person.getAge()+"");
				System.out.println(person.getJob());
			}
		};
	}
}
