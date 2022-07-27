package com.example.demo.Ex1WithOneToManyAndLists.models.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDate;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity<K extends Serializable> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private K id;

    private LocalDate createdAt;
    private String createdBy;

    private LocalDate updatedAt;
    private String updatedBy;

    private LocalDate deletedAt;
    private String deletedBy;

    private boolean isActive;
}
