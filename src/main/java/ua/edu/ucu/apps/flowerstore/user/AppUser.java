package ua.edu.ucu.apps.flowerstore.user;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
public class AppUser {
    @Id
    @GeneratedValue
    private int id;
    private String email;
    private LocalDate dob;
    @Transient
    private int age;
    public int getAge(){
        return Period.between(dob, LocalDate.now()).getYears();
    }


}