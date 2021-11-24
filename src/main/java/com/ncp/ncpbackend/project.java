package com.ncp.ncpbackend;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class project {
    @Id
    private int projectid;
    private int facultyid;
    private int panelid;
    private String projecttitle;
    private String projecttype;
    private String review1date;
    private String review1time;
    private String review2date;
    private String review2time;
    private String review3date;
    private String review3time;
}
