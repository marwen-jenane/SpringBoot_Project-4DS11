package tn.esprit.ds.championnat.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCourse;

    private String emplacement;

    private LocalDate dateCourse;

    @ManyToMany(mappedBy = "courses",cascade = CascadeType.ALL)
    private List<Championnat> championnats;

    @OneToMany(mappedBy = "course")
    private List<Position> positions;
}
