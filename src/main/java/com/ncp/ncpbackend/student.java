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
    private int studentid;
    private String rollnumber;
    private String name ;
    private String mailid;
    private boolean isassign;
    private boolean ispublished1;
    private boolean ispublished2;
    private boolean ispublished3;
    private int review11;
    private int review12;
    private int review13;
    private int review21;
    private int review22;
    private int review23;
    private int review31;
    private int review32;
    private int review33;

    public int getReview11() {
        return review11;
    }

    public void setReview11(int review11) {
        this.review11 = review11;
    }

    public int getReview12() {
        return review12;
    }


    public void setReview12(int review12) {
        this.review12 = review12;
    }

    public int getReview13() {
        return review13;
    }

    public void setReview13(int review13) {
        this.review13 = review13;
    }


    public int getReview21() {
        return review21;
    }

    public void setReview21(int review21) {
        this.review21 = review21;
    }

    public int getReview22() {
        return review22;
    }

    public void setReview22(int review22) {
        this.review22 = review22;
    }

    public int getReview23() {
        return review23;
    }

    public void setReview23(int review23) {
        this.review23 = review23;
    }

    public int getReview31() {
        return review31;
    }

    public void setReview31(int review31) {
        this.review31 = review31;
    }

    public int getReview32() {
        return review32;
    }

    public void setReview32(int review32) {
        this.review32 = review32;
    }

    public int getReview33() {
        return review33;
    }

    public void setReview33(int review33) {
        this.review33 = review33;
    }
}