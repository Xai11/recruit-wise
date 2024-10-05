package xai11.RecruitWise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xai11.RecruitWise.model.Recruiter;
import xai11.RecruitWise.repository.RecruiterRepository;

import java.util.List;

@Service
public class RecruiterService {

    @Autowired
    private RecruiterRepository recruiterRepository;

    private List<Recruiter> recruiters;

    public Recruiter getRecruiter(Long id){
        return recruiterRepository.findById(id).orElse(null);
    }

    public void saveRecruiter(String name, String mail){
        Recruiter recruiter = new Recruiter();
        recruiter.setName(name);
        recruiter.setMail(mail);
        recruiterRepository.save(recruiter);
    }
}
