package com.example.demo.Ex1WithOneToManyAndLists.repo;

import com.example.demo.Ex1WithOneToManyAndLists.models.entity.QrGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QrGroupRepository extends JpaRepository<QrGroup, Long> {
}
