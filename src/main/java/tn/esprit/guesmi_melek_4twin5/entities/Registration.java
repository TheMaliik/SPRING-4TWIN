package tn.esprit.guesmi_melek_4twin5.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numRegistration;
    int numWeek;

    @ManyToOne
    Skier skier;

    @ManyToOne
    Course course;
}
