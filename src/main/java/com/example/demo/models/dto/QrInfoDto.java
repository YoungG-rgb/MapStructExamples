package com.example.demo.models.dto;

import java.time.LocalDate;

public record QrInfoDto(
                        Long id,
                        Long key,
                        Long value,
                        Long qrGroupId,
                        LocalDate createdAt,
                        String createdBy,
                        LocalDate updatedAt,
                        String updatedBy,
                        LocalDate deletedAt,
                        String deletedBy,
                        boolean isActive) {

}
