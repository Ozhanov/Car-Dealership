package com.new_car_dealership.entity;



import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "brand")
public class Brand  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "brand")
    private List<Model> models;

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Brand(){

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

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }
}
