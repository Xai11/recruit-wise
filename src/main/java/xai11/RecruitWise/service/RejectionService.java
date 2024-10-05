package xai11.RecruitWise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xai11.RecruitWise.model.Rejection;
import xai11.RecruitWise.model.Vacancy;
import xai11.RecruitWise.repository.RejectionRepository;
import xai11.RecruitWise.repository.VacancyRepository;

import java.util.List;

@Service
public class RejectionService {
    @Autowired
    private RejectionRepository rejectionRepository;
    @Autowired
    private VacancyRepository vacancyRepository;

    public void saveRejection(String type, Long id){
        Rejection rejection = new Rejection();
        rejection.setType(type);
        Vacancy vacancy = vacancyRepository.findById(id).orElse(null);
        rejection.setVacancy(vacancy);
        rejectionRepository.save(rejection);
    }

}
