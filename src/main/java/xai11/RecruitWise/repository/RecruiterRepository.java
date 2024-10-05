package xai11.RecruitWise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xai11.RecruitWise.model.Recruiter;

@Repository
public interface RecruiterRepository extends JpaRepository<Recruiter,Long> {

}
