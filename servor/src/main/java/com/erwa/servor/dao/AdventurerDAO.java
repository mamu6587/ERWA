package com.erwa.servor.dao;

import com.erwa.servor.model.Adventurer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository("AdventurerDAO")
public interface AdventurerDAO extends JpaRepository<Adventurer,UUID> {
    }

