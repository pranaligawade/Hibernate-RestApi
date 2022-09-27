package com.mapping.M2M.Practice;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Orders {
    @Id
    @Column(name = "order_Id")
    private  int order_id;
    @Column(name = "customer_Name")
    private  String customerName;
    @Column(name ="order_Date" )
    @Temporal(TemporalType.DATE)
    private Date order_date;
    @Column(name = "shipping_Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date shipping_date;
    @Column(name = "shiper_id")
    private  int shiperid;

    @ManyToMany
    @JoinTable(name = "product_order",
            joinColumns = {@JoinColumn(name = "o_id")},
            inverseJoinColumns = {@JoinColumn(name = "p_id")}
    )
    private List<Products> productsList;

    public Orders() {
        super();
    }

    public Orders(int order_id, String customerName, Date order_date, Date shipping_date, int shiperid, List<Products> productsList) {
        this.order_id = order_id;
        this.customerName = customerName;
        this.order_date = order_date;
        this.shipping_date = shipping_date;
        this.shiperid = shiperid;
        this.productsList = productsList;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public Date getShipping_date() {
        return shipping_date;
    }

    public void setShipping_date(Date shipping_date) {
        this.shipping_date = shipping_date;
    }

    public int getShiperid() {
        return shiperid;
    }

    public void setShiperid(int shiperid) {
        this.shiperid = shiperid;
    }

    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }
}
