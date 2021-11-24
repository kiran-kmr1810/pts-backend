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

public class remarks {
    @Id
    @GeneratedValue

    private int remarks_id;
    private int review_id ;
    private String description;
}
