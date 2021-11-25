package com.ncp.ncpbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.Query;
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
			student.setReview11(newStudent.getReview11());
			student.setReview12(newStudent.getReview12());
			student.setReview13(newStudent.getReview13());
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
			student.setReview21(newStudent.getReview21());
			student.setReview22(newStudent.getReview22());
			student.setReview23(newStudent.getReview23());
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
			student.setReview31(newStudent.getReview31());
			student.setReview32(newStudent.getReview32());
			student.setReview33(newStudent.getReview33());
			return studentrepository.save(student);
		}).orElseGet(() -> {
			//student.setId(id);
			return studentrepository.save(newStudent);
		});
	}


	//PROJECT STUDENT FETCH

	@Autowired
	private project_studentrepository project_studentrepository;

	//@GetMapping("/panel/project/{id}")
	/*public List<student> getstudentsProject(@PathVariable int id){
		//List<project_student> studentIds = project_studentrepository.findAllById(id);
		//System.out.println(project_studentrepository.findAllStudents().toString());
		return null;
	}*/


	@Autowired
	private facultyrepository facultyrepository;


	@PostMapping("/faculty")
	public faculty addFaculty(@RequestBody faculty faculty){
		return facultyrepository.save(faculty);
	}

	@GetMapping("/faculty")
	public List<faculty> getfaculty() {
		return facultyrepository.findAll();
	}

	@GetMapping("/faculty/{nm}")
	public List<String> getfacultynm() {
		return facultyrepository.fun("Jeyakumar");
	}


	@GetMapping("/project/students/{pid}")
	public List<student> getStudentsProject(@PathVariable int pid){
		return studentrepository.findProjectStudents(pid);
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


	@PostMapping("/project_student")
	public project_student addProjectStudent(@RequestBody project_student project_student) { return project_studentrepository.save(project_student); }

	@GetMapping("/project_student")
	public List<project_student> getProjectStudent() { return project_studentrepository.findAll(); }


	@Autowired
	private remarksrepository remarksrepository;

	@PostMapping("/remarks")
	public remarks addremarks(@RequestBody remarks remarks) {
		return remarksrepository.save(remarks);
	}

	@GetMapping("/remarks")
	public List<remarks> getremarks() {
		return remarksrepository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(NcpBackendApplication.class, args);
	}



}