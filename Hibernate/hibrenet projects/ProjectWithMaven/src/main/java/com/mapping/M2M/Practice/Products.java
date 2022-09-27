package com.mapping.M2M.Practice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import java.util.List;

@Entity
public class Products {
     @Id
     private  int product_id;
     private String product_name;
     private String Description;
     private  double price;
     @ManyToMany(mappedBy = "productsList")
     private List<Orders> ordersList;

     public Products() {
          super();
     }

     public Products(int product_id, String product_name, String description, double price, List<Orders> ordersList) {
          this.product_id = product_id;
          this.product_name = product_name;
          Description = description;
          this.price = price;
          this.ordersList = ordersList;
     }

     public int getProduct_id() {
          return product_id;
     }

     public void setProduct_id(int product_id) {
          this.product_id = product_id;
     }

     public String getProduct_name() {
          return product_name;
     }

     public void setProduct_name(String product_name) {
          this.product_name = product_name;
     }

     public String getDescription() {
          return Description;
     }

     public void setDescription(String description) {
          Description = description;
     }

     public double getPrice() {
          return price;
     }

     public void setPrice(double price) {
          this.price = price;
     }

     public List<Orders> getOrdersList() {
          return ordersList;
     }

     public void setOrdersList(List<Orders> ordersList) {
          this.ordersList = ordersList;
     }
}
