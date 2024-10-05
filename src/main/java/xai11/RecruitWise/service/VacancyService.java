package xai11.RecruitWise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xai11.RecruitWise.model.Recruiter;
import xai11.RecruitWise.model.Rejection;
import xai11.RecruitWise.model.Vacancy;
import xai11.RecruitWise.repository.VacancyRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class VacancyService {

    @Autowired
    private VacancyRepository vacancyRepository;
    private List<Vacancy> vacancies;

    public Vacancy getVacancy (Long id){
        return vacancyRepository.findById(id).orElse(null);
    }

    public void saveVacancy (String name) {
        Vacancy vacancy = new Vacancy();
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Time now: " + now);
        vacancy.setName(name);
        vacancy.setCreateVac(now);
        vacancy.setActive(true);
        vacancyRepository.save(vacancy);
    }

    public List<Rejection> getRejectionsByVacancyId(Long vacancyId) {
        return vacancyRepository.findRejectionsByVacancyId(vacancyId);
    }

    public List<Vacancy> allVacancies(){
        return vacancyRepository.findAll();
    }

    public void deleteVacancy(Long id) {
        Vacancy vacancy = vacancyRepository.findById(id).orElseThrow(() -> new RuntimeException(""));
        vacancyRepository.delete(vacancy);
    }

    public List<Vacancy> getActiveVacancies() {
        return vacancyRepository.findAllByActiveTrue();
    }

    public List<Vacancy> getVacanciesByResumes(int minResumes) {
        return vacancyRepository.findAllByNumbResumesGreaterThanEqual(minResumes);
    }

    public List<Vacancy> getSortedVacanciesByResumes() {
        return vacancyRepository.findAllByOrderByNumbResumesDesc();
    }

    public List<Vacancy> getSortedVacanciesByInterviews() {
        return vacancyRepository.findAllByOrderByInviteInterviewDesc();
    }

    public List<Vacancy> getVacanciesByInvites(int minInvites) {
        return vacancyRepository.findAllByInviteInterviewGreaterThanEqual(minInvites);
    }

    public List<Vacancy> getVacanciesByRecruiter(Recruiter recruiter) {
        return vacancyRepository.findAllByRecruiter(recruiter);
    }
}
