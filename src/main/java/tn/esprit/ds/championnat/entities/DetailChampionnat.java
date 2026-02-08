package tn.esprit.ds.championnat.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailChampionnat {

    @Id
    private String idDetailChamp;

    private String description;

    private String code;

    @OneToOne(mappedBy = "detailChampionnat")
    private Championnat championnat;
}
