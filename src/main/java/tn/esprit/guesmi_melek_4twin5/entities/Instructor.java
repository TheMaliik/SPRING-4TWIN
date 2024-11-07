package tn.esprit.guesmi_melek_4twin5.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numInstructor;
    String firstName;
    String lastName;
    LocalDate dateOfHire;

    @OneToMany
    Set<Course> Courses;
}
