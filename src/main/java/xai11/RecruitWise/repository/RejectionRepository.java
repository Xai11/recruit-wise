package xai11.RecruitWise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import xai11.RecruitWise.model.Rejection;

import java.util.List;

@Repository
public interface RejectionRepository extends JpaRepository<Rejection,Long> {
//    @Query("SELECT r FROM Rejection r WHERE r.id_vacancy = :id")
//    List<Rejection> findRejectionsByVacancyId(@Param("id") Long vacancyId);
}

