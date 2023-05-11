package com.Social_Networking_Platform.Social_Networking_Platform.Repositories;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface User_Repository extends JpaRepository<User, Long> {
}
