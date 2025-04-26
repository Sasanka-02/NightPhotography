package com.zos.repository;

import com.zos.model.LearningPlan;
import com.zos.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Long> {
    List<Topic> findByLearningPlan(LearningPlan learningPlan);
}
