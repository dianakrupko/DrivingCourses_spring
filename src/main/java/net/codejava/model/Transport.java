package net.codejava.model;

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
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Transport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_transport;

    @NotNull
    @Size(max = 20)
    private String type;

    @NotNull
    @Size(max = 20)
    private String brand;

    @NotNull
    @Size(max = 10)
    private String number;

    @NotNull
    @Size(max = 20)
    private String color;

    public Transport(String type, String brand, String number, String color){
        this.type=type;
        this.brand=brand;
        this.number=number;
        this.color=color;
    }
}
