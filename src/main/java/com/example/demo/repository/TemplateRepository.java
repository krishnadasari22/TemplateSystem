package com.example.demo.repository;

import com.example.demo.model.Template;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemplateRepository extends JpaRepository<Template, Integer> {
}