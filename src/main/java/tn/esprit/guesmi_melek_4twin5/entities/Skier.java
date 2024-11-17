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
//@Table(name = "t_skier")
public class Skier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int numSkier;
    String firstName ;
    String lastName ;
    String city ;
    LocalDate birthDate ;


    @OneToOne(cascade = {CascadeType.PERSIST , CascadeType.REMOVE})
    Subscription subscription;

    @OneToMany(mappedBy = "skier" , fetch = FetchType.EAGER)
    Set<Registration> registrations;


    @ManyToMany(mappedBy = "skiers")
    Set<Piste> pistes;

}
