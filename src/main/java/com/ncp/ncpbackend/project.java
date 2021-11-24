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
    private int project_id;
    private int faculty_id;
    private int panel_id;
    private String project_title;
    private String project_type;
    private String review1_date;
    private String review1_time;
    private String review2_date;
    private String review2_time;
    private String review3_date;
    private String review3_time;
}
