package xai11.RecruitWise.service;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xai11.RecruitWise.model.Recruiter;
import xai11.RecruitWise.model.Vacancy;
import xai11.RecruitWise.repository.VacancyRepo;

import java.util.List;

@Service
public class VacancyService {

    @Autowired
    private VacancyRepo vacancyRepo;

    private List<Vacancy> vacancies;

    public Vacancy getVacancy (Long id){
        return vacancyRepo.findById(id).orElse(null);
    }

    public void saveVacancy (String name) {
        Vacancy vacancy = new Vacancy();
        vacancy.setName(name);
        vacancyRepo.save(vacancy);
    }

    public List<Vacancy> allVac(){
        return vacancyRepo.findAll();
    }

    public void deleteVacancy(Long id) {
        Vacancy vacancy = vacancyRepo.findById(id).orElseThrow(() -> new RuntimeException("Вакансия не найдена"));
        vacancyRepo.delete(vacancy);
    }

    public List<Vacancy> getActiveVacancies() {
        return vacancyRepo.findAllByActiveTrue();
    }

    public List<Vacancy> getVacanciesByResumes(int minResumes) {
        return vacancyRepo.findAllByNumbResumesGreaterThanEqual(minResumes);
    }

    public List<Vacancy> getSortedVacanciesByResumes() {
        return vacancyRepo.findAllByOrderByNumbResumesDesc();
    }

    public List<Vacancy> getSortedVacanciesByInterviews() {
        return vacancyRepo.findAllByOrderByInviteInterviewDesc();
    }

    public List<Vacancy> getVacanciesByInvites(int minInvites) {
        return vacancyRepo.findAllByInviteInterviewGreaterThanEqual(minInvites);
    }

    public List<Vacancy> getVacanciesByRecruiter(Recruiter recruiter) {
        return vacancyRepo.findAllByRecruiter(recruiter);
    }
}
