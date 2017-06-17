package com.codecool.jpaexample.model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String country;

    @Column(name="Zip", length=4)
    private String zipcode;

    private String city;
    private String addr;

    @OneToOne(mappedBy = "address")
    private Student student;

    public Address() {
    }

    public Address(String country, String zipcode, String city, String addr) {
        this.country = country;
        this.zipcode = zipcode;
        this.city = city;
        this.addr = addr;
    }

    public Address(String country, String zipcode, String city, String addr, Student student) {
        this(country, zipcode, city, addr);
        this.student = student;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", city='" + city + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
