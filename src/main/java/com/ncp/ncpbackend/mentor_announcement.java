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
public class mentor_announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int announcementid;
    private int facultyid;
    private int projectid;
    private String title;
    private String description;
    private String date;
    private String time;

}
