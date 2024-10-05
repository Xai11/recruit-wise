package xai11.RecruitWise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xai11.RecruitWise.model.Recruiter;
import xai11.RecruitWise.service.RecruiterService;

@RestController
public class RecruiterController {
    @Autowired
    private RecruiterService recruiterService;

    @GetMapping("/recruiter/{id}")
    public Recruiter getRecr(Long id){
        return recruiterService.getRecruiter(id);
    }

    @PostMapping("/recruiter/registration")
    public void saveRecruiter(@RequestBody Recruiter recruiter){
        recruiterService.saveRecruiter(recruiter.getName(), recruiter.getMail());
    }


}
