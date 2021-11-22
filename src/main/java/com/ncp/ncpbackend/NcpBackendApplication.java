package com.ncp.ncpbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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