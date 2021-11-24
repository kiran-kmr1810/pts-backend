package com.ncp.ncpbackend;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class faculty {
    @Id
    @GeneratedValue
    private int facultyid;
    private int panelid;
    private String name;
    private String mailid;
    private boolean isincharge;
    private boolean iscoordinator;

}
