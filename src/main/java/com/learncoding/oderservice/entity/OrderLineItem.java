package com.learncoding.oderservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order_line_item")
public class OrderLineItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int itemNumber;

    private String description;

    private int currentQty;

    private int previousQty;

    private int qtyDifference;

    private String orderComment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_material_id")
    private OrderMaterials orderMaterials;

    public OrderLineItem() {
    }

    public OrderLineItem(int id, int itemNumber, String description, int currentQty, int previousQty, int qtyDifference, String orderComment, OrderMaterials orderMaterials) {
        this.id = id;
        this.itemNumber = itemNumber;
        this.description = description;
        this.currentQty = currentQty;
        this.previousQty = previousQty;
        this.qtyDifference = qtyDifference;
        this.orderComment = orderComment;
        this.orderMaterials = orderMaterials;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public OrderMaterials getOrderMaterials() {
        return orderMaterials;
    }

    public void setOrderMaterials(OrderMaterials orderMaterials) {
        this.orderMaterials = orderMaterials;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCurrentQty() {
        return currentQty;
    }

    public void setCurrentQty(int currentQty) {
        this.currentQty = currentQty;
    }

    public int getPreviousQty() {
        return previousQty;
    }

    public void setPreviousQty(int previousQty) {
        this.previousQty = previousQty;
    }

    public int getQtyDifference() {
        return qtyDifference;
    }

    public void setQtyDifference(int qtyDifference) {
        this.qtyDifference = qtyDifference;
    }

    public String getOrderComment() {
        return orderComment;
    }

    public void setOrderComment(String orderComment) {
        this.orderComment = orderComment;
    }
}
