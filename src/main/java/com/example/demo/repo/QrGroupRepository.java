package com.example.demo.repo;

import com.example.demo.models.entity.QrGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QrGroupRepository extends JpaRepository<QrGroup, Long> {
}
