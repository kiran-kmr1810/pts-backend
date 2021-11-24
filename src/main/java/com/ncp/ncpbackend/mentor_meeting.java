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
public class mentor_meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int meetingid;
    private int facultyid;
    private int projectid;
    private String title;
    private String date;
    private String starttime;
    private String endtime;
}
