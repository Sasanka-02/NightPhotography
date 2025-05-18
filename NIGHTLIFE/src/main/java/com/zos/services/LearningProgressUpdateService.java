package com.zos.services;

import com.zos.exception.UserException;
import com.zos.model.LearningProgressUpdate;

import java.util.List;

public interface LearningProgressUpdateService {

    LearningProgressUpdate createProgressUpdate(LearningProgressUpdate update, Integer userId) throws UserException;

    LearningProgressUpdate updateProgressUpdate(Long id, LearningProgressUpdate update, Integer userId) throws UserException;

    void deleteProgressUpdate(Long id, Integer userId) throws UserException;

    List<LearningProgressUpdate> getUserProgressUpdates(Integer userId) throws UserException;
}
