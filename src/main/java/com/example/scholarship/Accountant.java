package com.example.scholarship;

public class Accountant {
    private String name;
    private String estimates;
    private Integer scholarship;

    public Accountant(String name, String estimates, Integer scholarship) {
        this.name = name;
        this.estimates = estimates;
        this.scholarship = scholarship;
    }


    public String getName() {
        return name ;
    }

    public void setName(String name ) {
        this.name = name;
    }

    public String getEstimates() {
        return estimates ;
    }

    public void setEstimates(String estimates) {
        this.estimates = estimates;
    }

    public Integer getScholarship() {
        return scholarship;
    }

    public void setScholarship(Integer scholarship) {
        this.scholarship = scholarship;
    }

}
