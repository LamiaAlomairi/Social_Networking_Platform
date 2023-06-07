package com.Social_Networking_Platform.Social_Networking_Platform.Repositories;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
