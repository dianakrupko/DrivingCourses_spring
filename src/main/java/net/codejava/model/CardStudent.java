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
import java.text.DateFormat;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class CardStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_card;
    @NotNull
    private int id_instructor;

    @NotNull
    private int id_student;

    @NotNull
    private Date date;

    @NotNull
    private boolean presence;

    @NotNull
    @Size(max=100)
    private String mistakes;

    public CardStudent(int id_instructor, int id_student, Date date, boolean presence, String mistakes){
        this.id_instructor=id_instructor;
        this.id_student=id_student;
        this.date=date;
        this.presence=presence;
        this.mistakes=mistakes;
    }
}
