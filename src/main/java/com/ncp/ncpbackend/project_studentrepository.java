package com.ncp.ncpbackend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface project_studentrepository extends JpaRepository<project_student, Integer> {

}
