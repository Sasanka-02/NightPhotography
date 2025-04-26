package com.zos.repository;

import com.zos.model.Resource;
import com.zos.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
    List<Resource> findByTopic(Topic topic);
}