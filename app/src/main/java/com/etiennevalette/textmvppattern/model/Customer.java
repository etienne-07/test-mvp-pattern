package com.etiennevalette.textmvppattern.model;

/**
 * Created by etiennevalette on 06/07/16.
 */
public class Customer {
    private Integer id;
    private String name;

    public Customer(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
