package com.codeclan.example.Employee_Lab.repositories;

import com.codeclan.example.Employee_Lab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
