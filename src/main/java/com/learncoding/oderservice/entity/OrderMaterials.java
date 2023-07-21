package com.learncoding.oderservice.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "order_materials")
public class OrderMaterials {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderMaterialId;
    private String orderDescription;
    private int buildingID;

    private String buildingName;

    private String buildingAddress;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_list_id")
    private List<OrderLineItem> orderLineItemList;

    public OrderMaterials() {
    }

    public OrderMaterials(int orderMaterialId, String orderDescription, int buildingID, String buildingName, String buildingAddress, List<OrderLineItem> orderLineItemList) {
        this.orderMaterialId = orderMaterialId;
        this.orderDescription = orderDescription;
        this.buildingID = buildingID;
        this.buildingName = buildingName;
        this.buildingAddress = buildingAddress;
        this.orderLineItemList = orderLineItemList;
    }

    public int getOrderMaterialId() {
        return orderMaterialId;
    }

    public void setOrderMaterialId(int orderMaterialId) {
        this.orderMaterialId = orderMaterialId;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public int getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(int buildingID) {
        this.buildingID = buildingID;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getBuildingAddress() {
        return buildingAddress;
    }

    public void setBuildingAddress(String buildingAddress) {
        this.buildingAddress = buildingAddress;
    }

    public List<OrderLineItem> getOrderLineItemList() {
        return orderLineItemList;
    }

    public void setOrderLineItemList(List<OrderLineItem> orderLineItemList) {
        this.orderLineItemList = orderLineItemList;
    }
}
