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
    private String roll_number;
    private String name ;
    private String mail_id;
    private boolean is_assign;
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

    public int getReview1_1() {
        return review1_1;
    }

    public void setReview1_1(int review1_1) {
        this.review1_1 = review1_1;
    }

    public int getReview1_2() {
        return review1_2;
    }


    public void setReview1_2(int review1_2) {
        this.review1_2 = review1_2;
    }

    public int getReview1_3() {
        return review1_3;
    }

    public void setReview1_3(int review1_3) {
        this.review1_3 = review1_3;
    }


    public int getReview2_1() {
        return review2_1;
    }

    public void setReview2_1(int review2_1) {
        this.review2_1 = review2_1;
    }

    public int getReview2_2() {
        return review2_2;
    }

    public void setReview2_2(int review2_2) {
        this.review2_2 = review2_2;
    }

    public int getReview2_3() {
        return review2_3;
    }

    public void setReview2_3(int review2_3) {
        this.review2_3 = review2_3;
    }

    public int getReview3_1() {
        return review3_1;
    }

    public void setReview3_1(int review3_1) {
        this.review3_1 = review3_1;
    }

    public int getReview3_2() {
        return review3_2;
    }

    public void setReview3_2(int review3_2) {
        this.review3_2 = review3_2;
    }

    public int getReview3_3() {
        return review3_3;
    }

    public void setReview3_3(int review3_3) {
        this.review3_3 = review3_3;
    }
}
