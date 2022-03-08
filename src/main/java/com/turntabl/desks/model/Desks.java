package com.turntabl.desks.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Desks {
    private @Id  Integer deskId;
    private String status;
    private String location;


    public Desks(){}


    public Desks(String status, String location) {
        this.status = status;
        this.location = location;
    }


    public Integer getDesk() {
        return deskId;
    }

    public void setDesk(Integer deskId) {
        this.deskId = deskId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
