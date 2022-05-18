package net.codejava.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_courses;

    @NotNull
    private int id_instructor;
    @NotNull
    private String name;

    @NotNull
    private double cost;
    @NotNull
    private int duration;
    @NotNull
    private double quality;

    @ManyToOne
    @JoinColumn(name ="id_category")
    private Category id_category;

    public Courses(int id_instructor, String name, double cost, int duration, double quality) {
        this.id_instructor=id_instructor;
        this.name=name;
        this.cost=cost;
        this.duration=duration;
        this.quality=quality;
    }

}
