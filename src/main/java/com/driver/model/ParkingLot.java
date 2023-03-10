package com.driver.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class ParkingLot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;

    public ParkingLot() {
    }

    public List<Spot> getSpotList() {
        return spot;
    }

    public void setSpotList(List<Spot> spot) {
        this.spot = spot;
    }

    public ParkingLot(String name, String address) {

        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @OneToMany(mappedBy = "parkingLot",cascade = CascadeType.ALL)
    private List<Spot> spot = new ArrayList<>();


}
