package com.ncp.ncpbackend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface studentrepository extends JpaRepository<student,Integer> {
    @Query(value = "SELECT * FROM student WHERE studentid in  (select studentid from project_student where projectid = :pid) ",nativeQuery = true)
    public List<student> findProjectStudents(@Param("pid") int pid);
}
