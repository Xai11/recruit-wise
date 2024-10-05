package xai11.RecruitWise.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "vacancy")
public class Vacancy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private int numbResumes; //количество отклкнутых резюме
    @Column
    private LocalDateTime createVac;  //создание вакансии
    @Column
    private LocalDateTime endVac; //закрытие вакансии
    @Column
    private int inviteInterview; //скольких пригласили на интервью
    @Column
    private int joinWork; //сколько трудоустроили
    @Column
    private Boolean active; //вакансия активна или в ахиве
    @JoinColumn(name = "recruiter_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Recruiter recruiter;
}
