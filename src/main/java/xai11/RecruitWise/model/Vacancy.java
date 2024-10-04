package xai11.RecruitWise.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Vacancy {


    private Long id;

    private String name;

    private int numbResumes; //количество отклкнутых резюме

    private int timeClosed;  //сколько дней вакансия

    private int inviteInterview; //скольких пригласили на интервью

    private int joinWork; //сколько трудоустроили

}
