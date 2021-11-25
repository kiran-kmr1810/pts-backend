package com.ncp.ncpbackend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface facultyrepository extends JpaRepository<faculty,Integer> {
    @Query(value = "SELECT name FROM faculty WHERE name = :nm ",nativeQuery = true)
    public List<String> fun(@Param("nm") String nm);

}
