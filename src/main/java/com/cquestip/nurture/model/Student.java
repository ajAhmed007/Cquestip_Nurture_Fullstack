package com.cquestip.nurture.model;

import javax.persistence.*;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String email_id;

    public Student() {
    }

    public Student(String first_name, String last_name, String email_id) {
        super();
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_id = email_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getfirst_name() {
        return first_name;
    }

    public void setfirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getlast_name() {
        return last_name;
    }

    public void setlast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getemail_id() {
        return email_id;
    }

    public void setemail_id(String email_id) {
        this.email_id = email_id;
    }
}
