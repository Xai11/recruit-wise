package xai11.RecruitWise.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VacancyPatchRequest {
    private Integer numbResumes;
    private Integer inviteInterview;
    private Integer finishInterview;
    private Integer resignation;
    private Integer joinWork;
    private Boolean active;
}
