package com.zos.services;

import com.zos.dto.UserDto;
import com.zos.exception.NotificationException;
import com.zos.exception.UserException;
import com.zos.model.Notification;
import com.zos.model.User;
import com.zos.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class NotificationServiceImplementation implements NotificationService {

    @Autowired
    private NotificationRepository notificationRepo;

    @Autowired
    private UserService userService;

    @Override
    public Notification createNotification(Notification notification, Integer userId) throws UserException {
        User user = userService.findUserById(userId);

        UserDto userDto = new UserDto();
        userDto.setEmail(user.getEmail());
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        userDto.setName(user.getName());
        userDto.setUserImage(user.getImage());

        notification.setUser(userDto);
        notification.setCreatedAt(LocalDateTime.now());
        notification.setRead(false);

        return notificationRepo.save(notification);
    }

    @Override
    public List<Notification> getNotificationsByUserId(Integer userId) throws UserException {
        return notificationRepo.findByUserId(userId);
    }

    @Override
    public Notification markAsRead(Integer notificationId) throws NotificationException {
        Notification notification = notificationRepo.findById(notificationId)
                .orElseThrow(() -> new NotificationException("Notification not found"));

        notification.setRead(true);
        return notificationRepo.save(notification);
    }

    @Override
    public void deleteNotification(Integer notificationId) throws NotificationException {
        if (!notificationRepo.existsById(notificationId)) {
            throw new NotificationException("Notification not found");
        }
        notificationRepo.deleteById(notificationId);
    }

    @Override
    public List<Notification> getUnreadNotifications(Integer userId) throws UserException {
        return notificationRepo.findUnreadByUserId(userId);
    }
}