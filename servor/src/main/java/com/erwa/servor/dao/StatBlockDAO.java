package com.erwa.servor.dao;

import com.erwa.servor.model.StatBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Repository("StatBlockDAO")
public interface StatBlockDAO extends JpaRepository<StatBlock,UUID> {
    @Query("select u from StatBlock u where u.name = ?1")
    List<StatBlock> findByNameIgnoreCase(String name);
}

