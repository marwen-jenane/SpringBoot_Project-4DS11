package tn.esprit.ds.championnat.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Championnat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChampionnat;

    @Enumerated(EnumType.STRING)
    private Categorie categorie;

    private String libelleC;

    private Integer annee;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Course> courses;

    @OneToOne
    private DetailChampionnat detailChampionnat;
}
