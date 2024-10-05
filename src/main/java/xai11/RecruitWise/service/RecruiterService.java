package xai11.RecruitWise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xai11.RecruitWise.model.Recruiter;
import xai11.RecruitWise.repository.RecruiterRepo;

import java.util.List;

@Service
public class RecruiterService {

    @Autowired
    private RecruiterRepo recruiterRepo;

    private List<Recruiter> recruiters;

    public Recruiter getRecr(Long id){
        return recruiterRepo.findById(id).orElse(null);
    }

    public void saveRecr(String name, String mail){
        Recruiter recr = new Recruiter();
        recr.setName(name);
        recr.setMail(mail);
        recruiterRepo.save(recr);
    }
}
