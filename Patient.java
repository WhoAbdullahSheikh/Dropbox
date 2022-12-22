package com.mycompany.mavenproject1;


/**
 * @author Ma
 * @version 1.0
 * @created 22-Dec-2022 7:08:14 PM
 */
public class Patient {

	private int id;
	private String name;

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public Patient(){

	}

	public void finalize() throws Throwable {

	}
}//end Patient