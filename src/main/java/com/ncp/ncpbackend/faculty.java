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
    private int faculty_id;
    private int panel_id;
    private String name;
    private String mail_id;
    private boolean is_incharge;
    private boolean is_coordinator;

}
