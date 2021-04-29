package com.erwa.servor.dao;

import com.erwa.servor.model.StatBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository("StatBlockDAO")
public interface StatBlockDAO extends JpaRepository<StatBlock,String> {
}

