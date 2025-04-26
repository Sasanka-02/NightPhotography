package com.zos.services;

import java.util.List;
import java.util.Optional;

import com.zos.dto.UserDto;
import com.zos.exception.PostException;
import com.zos.exception.UserException;
import com.zos.model.Post;
import com.zos.model.User;

public interface UserService {

    User registerUser(User user) throws UserException;

    User findUserById(Integer userId) throws UserException;

    User findUserProfile(String token) throws UserException;

    User findUserByUsername(String username) throws UserException;

    String followUser(Integer reqUserId, Integer followUserId) throws UserException;

    String unfollowUser(Integer reqUserId, Integer unfollowUserId) throws UserException;

    List<User> findUsersByUserIds(List<Integer> userIds);

    List<User> searchUser(String query) throws UserException;

    List<User> popularUser();


    User updateUserDetails(User updatedUser, User existingUser) throws UserException;


}
