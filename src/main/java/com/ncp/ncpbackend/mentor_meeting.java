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
    private int meeting_id;
    private int faculty_id;
    private int project_id;
    private String title;
    private String date;
    private String start_time;
    private String end_time;
}
