package com.example.demo.Ex1WithOneToManyAndLists.models.dto;

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
