package hdqtech.main.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Table(name = "delivery")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String addressReviced;

    private String addressSend;

    private java.sql.Date send;

    private java.sql.Date recived;

    private String carrier;

    private String description;

    private Integer mass;

    private Integer cost;

    private Integer transportCost;

    private String shipper;

    private Integer phone;

    private String photo;

    public Statusd getStatusd() {
        return statusd;
    }

    public void setStatusd(Statusd statusd) {
        this.statusd = statusd;
    }
    @Enumerated(EnumType.STRING)
    private Statusd statusd;
//    @Enumerated(EnumType.STRING)
//    private Statusd statusd;

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

    public String getAddressReviced() {
        return addressReviced;
    }

    public void setAddressReviced(String addressReviced) {
        this.addressReviced = addressReviced;
    }

    public String getAddressSend() {
        return addressSend;
    }

    public void setAddressSend(String addressSend) {
        this.addressSend = addressSend;
    }

    public Date getSend() {
        return send;
    }

    public void setSend(Date send) {
        this.send = send;
    }

    public Date getRecived() {
        return recived;
    }

    public void setRecived(Date recived) {
        this.recived = recived;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMass() {
        return mass;
    }

    public void setMass(Integer mass) {
        this.mass = mass;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getTransportCost() {
        return transportCost;
    }

    public void setTransportCost(Integer transportCost) {
        this.transportCost = transportCost;
    }

    public String getShipper() {
        return shipper;
    }

    public void setShipper(String shipper) {
        this.shipper = shipper;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
