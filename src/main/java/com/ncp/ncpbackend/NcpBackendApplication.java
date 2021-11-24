package com.ncp.ncpbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Repository;
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

	@Autowired
	private mentor_logrepository mentor_logrepository;

	@PostMapping("/mentor_log")
	public mentor_log addMentorLog(@RequestBody mentor_log mentor_log) { return mentor_logrepository.save(mentor_log); }

	@GetMapping("/mentor_log")
	public List<mentor_log> getMentorLog() { return mentor_logrepository.findAll(); }

	@Autowired
	private mentor_meetingrepository mentor_meetingrepository;

	@PostMapping("/mentor_meeting")
	public mentor_meeting addMentorMeeting(@RequestBody mentor_meeting mentor_meeting) { return mentor_meetingrepository.save(mentor_meeting); }

	@GetMapping("/mentor_meeting")
	public List<mentor_meeting> getMentorMeeting() { return mentor_meetingrepository.findAll(); }

	@Autowired
	private mentor_announcementrepository mentor_announcementrepository;

	@PostMapping("/mentor_announcement")
	public mentor_announcement addMentorAnnouncement(@RequestBody mentor_announcement mentor_announcement) { return mentor_announcementrepository.save(mentor_announcement); }

	@GetMapping("/mentor_announcement")
	public List<mentor_announcement> getMentorAnnouncement() { return mentor_announcementrepository.findAll(); }

	@Autowired
	private projectrepository projectrepository;

	@PostMapping("/project")
	public project addProject(@RequestBody project project) { return projectrepository.save(project); }

	@GetMapping("/project")
	public List<project> getProject() { return projectrepository.findAll(); }

	@Autowired
	private project_studentrepository project_studentrepository;

	@PostMapping("/project_student")
	public project_student addProjectStudent(@RequestBody project_student project_student) { return project_studentrepository.save(project_student); }

	@GetMapping("/project_student")
	public List<project_student> getProjectStudent() { return project_studentrepository.findAll(); }

	public static void main(String[] args) {
		SpringApplication.run(NcpBackendApplication.class, args);
	}




}