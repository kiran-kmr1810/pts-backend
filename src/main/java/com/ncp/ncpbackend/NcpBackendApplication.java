package com.ncp.ncpbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@SpringBootApplication
@RestController
public class NcpBackendApplication {

	@Autowired
	private announcementrepository repository;

	@PostMapping("/announcement")
	public announcement addAnnouncement(@RequestBody announcement announcement) {
		return repository.save(announcement);
	}

	@GetMapping("/announcement")
	public List<announcement> getAnnouncement() {
		return repository.findAll();
	}

	@Autowired
	private studentrepository studentrepository;

	@PostMapping("/student")
	public student addStudent(@RequestBody student student) {
		return studentrepository.save(student);
	}


	@GetMapping("/student")
	public List<student> getStudent() {
		return studentrepository.findAll();
	}


	@CrossOrigin(origins = "http://localhost:3001")
	@PutMapping("/student/review1/{id}")
	public student updateR1Student(@RequestBody student newStudent, @PathVariable int id ){
		return studentrepository.findById(id).map(student -> {
			student.setReview1_1(newStudent.getReview1_1());
			student.setReview1_2(newStudent.getReview1_2());
			student.setReview1_3(newStudent.getReview1_3());
			return studentrepository.save(student);
		}).orElseGet(() -> {
			//student.setId(id);
			return studentrepository.save(newStudent);
		});
	}

	@CrossOrigin(origins = "http://localhost:3001")
	@PutMapping("/student/review2/{id}")
	public student updateR2Student(@RequestBody student newStudent, @PathVariable int id ){
		return studentrepository.findById(id).map(student -> {
			student.setReview2_1(newStudent.getReview2_1());
			student.setReview2_2(newStudent.getReview2_2());
			student.setReview2_3(newStudent.getReview2_3());
			return studentrepository.save(student);
		}).orElseGet(() -> {
			//student.setId(id);
			return studentrepository.save(newStudent);
		});
	}

	@CrossOrigin(origins = "http://localhost:3001")
	@PutMapping("/student/review3/{id}")
	public student updateR3Student(@RequestBody student newStudent, @PathVariable int id ){
		return studentrepository.findById(id).map(student -> {
			student.setReview3_1(newStudent.getReview3_1());
			student.setReview3_2(newStudent.getReview3_2());
			student.setReview3_3(newStudent.getReview3_3());
			return studentrepository.save(student);
		}).orElseGet(() -> {
			//student.setId(id);
			return studentrepository.save(newStudent);
		});
	}

	@Autowired
	private facultyrepository facultyrepository;

	@PostMapping("/faculty")
	public faculty addFaculty(@RequestBody faculty faculty) {
		return facultyrepository.save(faculty);
	}

	@GetMapping("/faculty")
	public List<faculty> getfaculty() {
		return facultyrepository.findAll();
	}






	public static void main(String[] args) {
		SpringApplication.run(NcpBackendApplication.class, args);
	}




}