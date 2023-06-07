package com.Social_Networking_Platform.Social_Networking_Platform.Repositories;

import com.Social_Networking_Platform.Social_Networking_Platform.Models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
