package com.how2java.pojo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("p")
public class Product {
    int id;
    String name="product 1";
    double price;
    //@Autowired
    @Resource(name="c")
    private Category category;
    
    public Category getCategory(){
    	return category;
    }
    //@Autowired
    public void setCategory(Category category){
    	this.category = category;
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
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
