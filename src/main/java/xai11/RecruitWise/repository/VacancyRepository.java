package xai11.RecruitWise.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import xai11.RecruitWise.model.Recruiter;
import xai11.RecruitWise.model.Rejection;
import xai11.RecruitWise.model.Vacancy;

import java.util.List;
@Repository
public interface VacancyRepository extends JpaRepository<Vacancy,Long> {
    List<Vacancy> findAllByActiveTrue();

    List<Vacancy> findAllByOrderByNumbResumesDesc();

    List<Vacancy> findAllByOrderByInviteInterviewDesc();

    List<Vacancy> findAllByNumbResumesGreaterThanEqual(int minResumes);

    List<Vacancy> findAllByInviteInterviewGreaterThanEqual(int minInvites);

    List<Vacancy> findAllByRecruiter(Recruiter recruiter);

    @Query("SELECT r FROM Rejection r WHERE r.vacancy.id = :vacancyId")
    List<Rejection> findRejectionsByVacancyId(@Param("vacancyId") Long vacancyId);


}