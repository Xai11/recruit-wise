package xai11.RecruitWise.service;

import org.springframework.beans.factory.annotation.Autowired;
import xai11.RecruitWise.model.Vacancy;
import xai11.RecruitWise.repository.VacancyRepo;

import java.util.List;

public class VacancyService {

    @Autowired
    private VacancyRepo vacancyRepo;

    private List<Vacancy> vacancies;

    public Vacancy getVacancy (Long id){
        return vacancyRepo.findById(id).orElse(null);
    }

}
