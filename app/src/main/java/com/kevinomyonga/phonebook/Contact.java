package com.kevinomyonga.phonebook;

/**
 * Created by kevinomyonga on 01/03/2018.
 */

class Contact {

    private String fname, lname, image;

    public Contact(String fname, String lname, String image) {
        this.fname = fname;
        this.lname = lname;
        this.image = image;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
