package net.codejava.model;

import javax.persistence.*;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_category;

    @NotNull
    @Size(max =20)
    private String name;

    @NotNull
    @Size(max =100)
    private String description;




    public Category(String name, String description){
        this.name=name;
        this.description=description;
    }
}
