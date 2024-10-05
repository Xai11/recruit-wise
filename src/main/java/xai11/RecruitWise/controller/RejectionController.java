package xai11.RecruitWise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xai11.RecruitWise.model.RejectRequest;
import xai11.RecruitWise.model.Rejection;
import xai11.RecruitWise.model.Vacancy;
import xai11.RecruitWise.service.RejectionService;

import java.util.List;

@RestController
public class RejectionController {

    @Autowired
    private RejectionService rejectionService;

    @PostMapping("/rejections/save")
    public void saveRejection(@RequestBody RejectRequest rejectRequest){
        rejectionService.saveRejection(rejectRequest.getType(), rejectRequest.getId());
    }

}
