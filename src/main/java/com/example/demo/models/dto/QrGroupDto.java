package com.example.demo.models.dto;

import com.example.demo.models.dto.QrInfoDto;

import java.time.LocalDate;
import java.util.List;

public record QrGroupDto(
        Long id,
        String name,
        List<QrInfoDto> qrInfos,
        LocalDate createdAt,
        String createdBy,
        LocalDate updatedAt,
        String updatedBy,
        LocalDate deletedAt,
        String deletedBy,
        boolean isActive) {

}
