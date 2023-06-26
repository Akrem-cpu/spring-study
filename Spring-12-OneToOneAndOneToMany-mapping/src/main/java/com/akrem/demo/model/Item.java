package com.akrem.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Items")
@Data
@NoArgsConstructor
public class Item extends BasedEntity{

    private String name;

    public Item(String name, String code) {
        this.name = name;
        this.code = code;
    }

    private String code;

    @ManyToMany(mappedBy = "itemList")
    private List<Cart> cartList;



}
