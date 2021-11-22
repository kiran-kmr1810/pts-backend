package com.ncp.ncpbackend;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
