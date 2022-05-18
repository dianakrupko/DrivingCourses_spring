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
import java.sql.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_student;

    @NotNull
    @Size(max = 20)
    private String surname;

    @NotNull
    @Size(max = 20)
    private String name;

    @NotNull
    private Date birthday;

    @NotNull
    private int IPN;

    @NotNull
    @Size(max = 13)
    private String phone_number;

    public Student(String surname, String name, Date birthday, int IPN, String phone_number) {
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
        this.IPN = IPN;
        this.phone_number = phone_number;
    }
}