package com.zos.repository;

import com.zos.model.LearningPlan;
import com.zos.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LearningPlanRepository extends JpaRepository<LearningPlan, Long> {
    List<LearningPlan> findByUser(User user);

    @Query("SELECT lp FROM LearningPlan lp WHERE lp.user.id = :userId")
    List<LearningPlan> findByUserId(@Param("userId") Integer userId);
}
