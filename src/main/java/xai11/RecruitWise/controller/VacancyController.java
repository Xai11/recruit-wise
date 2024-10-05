package xai11.RecruitWise.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xai11.RecruitWise.model.Recruiter;
import xai11.RecruitWise.model.Vacancy;
import xai11.RecruitWise.service.RecruiterService;
import xai11.RecruitWise.service.VacancyService;

import java.util.List;

@RestController
public class VacancyController {

    @Autowired
    private VacancyService vacancyService;

    @Autowired
    private RecruiterService recruiterService;

    @Autowired
    public VacancyController(VacancyService vacancyService) {
        this.vacancyService = vacancyService;
    }

    @GetMapping("/vacancies/{id}")
    public Vacancy getVacancy(@PathVariable Long id) {
        return vacancyService.getVacancy(id);
    }

    @PostMapping("/vacancies/add")
    public void saveVacancy(@RequestBody Vacancy vacancy) {
        vacancyService.saveVacancy(vacancy.getName());
    }

    @GetMapping("/vacancies")
    public List<Vacancy> getAllVacancies() {
        return vacancyService.allVacancies();
    }

    @DeleteMapping("/vacancies/{id}")
    public ResponseEntity<String> deleteVacancy(@PathVariable Long id) {
        vacancyService.deleteVacancy(id);
        return ResponseEntity.ok("");
    }

    @GetMapping("/vacancies/byResumes/{minResumes}")
    public List<Vacancy> getVacanciesByResumes(@PathVariable int minResumes) {
        return vacancyService.getVacanciesByResumes(minResumes);
    }

    @GetMapping("/vacancies/byInvites/{minInvites}")
    public List<Vacancy> getVacanciesByInvites(@PathVariable int minInvites) {
        return vacancyService.getVacanciesByInvites(minInvites);
    }

    @GetMapping("/vacancies?status={status}")
    public List<Vacancy> getVacanciesByStatus(){
        return vacancyService.getActiveVacancies();
    }

    @GetMapping("/vacancies/byRecruiter/{recruiterId}")
    public List<Vacancy> getVacanciesByRecruiter(@PathVariable Long recruiterId) {
        Recruiter recruiter = recruiterService.getRecruiter(recruiterId);
        return vacancyService.getVacanciesByRecruiter(recruiter);
    }

    @GetMapping("/vacancies/sortedByResumes")
    public List<Vacancy> getSortedVacanciesByResumes() {
        return vacancyService.getSortedVacanciesByResumes();
    }

    @GetMapping("/vacancies/sortedByInterviews")
    public List<Vacancy> getSortedVacanciesByInterviews() {
        return vacancyService.getSortedVacanciesByInterviews();
    }
}
