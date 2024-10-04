package xai11.RecruitWise.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import xai11.RecruitWise.model.Vacancy;
import xai11.RecruitWise.service.VacancyService;

public class VacancyController {

    private VacancyService vacancyService;

    @Autowired
    public VacancyController(VacancyService vacancyService) {
        this.vacancyService = vacancyService;
    }

    @GetMapping("/vacancy/{id}")
    public Vacancy getVacancy(@PathVariable Long id){
        return vacancyService.getVacancy(id);
    }


}
