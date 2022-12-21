package com.example.SpringBootApp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class User {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;

    private String log,time,date,i;

    User() {}

    User(String log,String time,String date,String i)

    {

    
    	   this.setLog(log);
    	this.setTime(time);
    	this.setDate(date);

        this.setI(i);


    }

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getI() {
		return i;
	}

	public void setI(String i) {
		this.i = i;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}
}