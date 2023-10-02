/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Entite;

/**
 *
 * @author Nabil
 */
public class Game {
    private String name,img,Descrption;
    float price;

    public Game(String name,float price, String img, String Descrption) {
        this.name = name;
        this.img = img;
        this.Descrption = Descrption;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescrption() {
        return Descrption;
    }

    public void setDescrption(String Descrption) {
        this.Descrption = Descrption;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Game{" + "name=" + name + ", img=" + img + ", Descrption=" + Descrption + ", price=" + price + '}';
    }
    
    
    
    
}
