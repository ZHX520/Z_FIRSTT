package com.example.demo;

public class Person {
    Integer PersonId;
    String Pname;
    int Page;

    public Person(Integer i1,String i2,int i3){
        PersonId = i1;
        Pname = i2;
        Page =i3;
    }

    public Integer getPersonId() {
        return PersonId;
    }

    public void setPersonId(Integer personId) {
        PersonId = personId;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public int getPage() {
        return Page;
    }

    public void setPage(int page) {
        Page = page;
    }
}
