package com.zos.repository;

import com.zos.model.LearningProgressUpdate;
import com.zos.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LearningProgressUpdateRepository extends JpaRepository<LearningProgressUpdate, Long> {
    List<LearningProgressUpdate> findByUser(User user);
}
