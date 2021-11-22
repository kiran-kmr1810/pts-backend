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
public class student {

    @Id
    @GeneratedValue
    private int student_id;
    private String name ;
    private String mail_id;
    private boolean is_assigned;
    private boolean is_published1;
    private boolean is_published2;
    private boolean is_published3;
    private int review1_1;
    private int review1_2;
    private int review1_3;
    private int review2_1;
    private int review2_2;
    private int review2_3;
    private int review3_1;
    private int review3_2;
    private int review3_3;


}
