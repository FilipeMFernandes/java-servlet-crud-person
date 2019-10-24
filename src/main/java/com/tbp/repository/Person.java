package com.tbp.repository;

public class Person {

    String name, address, msisdn;

    public Person(String name, String address, String msisdn) {
        this.name = name;
        this.address = address;
        this.msisdn = msisdn;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }
}
