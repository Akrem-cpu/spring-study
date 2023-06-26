package com.akrem.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Carts")
@Data
@NoArgsConstructor
public class Cart extends BasedEntity {
   @ManyToMany
   @JoinTable(name = "cart_item_rel", joinColumns = @JoinColumn(name = "c_ID"),
   inverseJoinColumns = @JoinColumn(name = "I_ID"))
   private List<Item> itemList;

}
