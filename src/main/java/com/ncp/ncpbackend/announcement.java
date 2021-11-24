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
public class announcement {
    @Id
    @GeneratedValue

    private int announcementid;
    private String description ;
    private String date;
    private String time;

}
