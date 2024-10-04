package xai11.RecruitWise.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import xai11.RecruitWise.model.Vacancy;

import java.util.List;

public interface VacancyRepo extends JpaRepository<Vacancy,Long> {

}