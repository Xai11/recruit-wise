package xai11.RecruitWise.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "recruiter")
public class Recruiter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;
    @Column (unique = true)
    private String mail;
    @Column
    @OneToMany(mappedBy = "recruiter")
    private List<Vacancy> countVac; //сколько вакансий обработано
}
