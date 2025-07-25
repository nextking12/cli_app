package com.example.CliApp.repository;

import com.example.CliApp.model.Script;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ScriptRepository extends JpaRepository<Script, Long> {
    Optional<Script> findByName (String name);
}

