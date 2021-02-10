package com.fridaynext.cp2077companion.repository;

import com.fridaynext.cp2077companion.model.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AchievementRepository extends JpaRepository<Achievement, Long> {
    // Can build some custom CRUD functionality here for Achievements

    Achievement findByName(String title);
}
