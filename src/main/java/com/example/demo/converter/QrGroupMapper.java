package com.example.demo.converter;

import com.example.demo.models.entity.QrGroup;
import com.example.demo.models.dto.QrGroupDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {QrInfoMapper.class})
public interface QrGroupMapper {

    @Mapping(target = "isActive", source = "active")
    QrGroupDto toDto(QrGroup qrGroup);

    @InheritInverseConfiguration
    QrGroup toEntity(QrGroupDto qrGroupDto);
}
