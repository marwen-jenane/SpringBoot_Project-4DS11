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
    private String code;

    private String description;

    private String idDetailChamp;
}
