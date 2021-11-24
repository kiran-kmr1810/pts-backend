package com.ncp.ncpbackend;


import com.sun.javafx.geom.transform.Identity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class mentor_log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int log_id;
    private int faculty_id;
    private int project_id;
    private String title;
    private String description;
    private String date;
    private String time;
}
