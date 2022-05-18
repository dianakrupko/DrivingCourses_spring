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
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class IntermediateTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_test;

    @NotNull
    private int id_student;

    @NotNull
    private Date date;

    @NotNull
    private double result;

    public IntermediateTest(int id_student, Date date, double result){
        this.id_student=id_student;
        this.date=date;
        this.result=result;
    }
}
