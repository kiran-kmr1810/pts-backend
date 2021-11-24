package com.ncp.ncpbackend;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class project_student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectstudentid;
    private int projectid;
    private int studentid;
}
