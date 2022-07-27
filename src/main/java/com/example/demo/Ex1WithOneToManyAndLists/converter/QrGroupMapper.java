package com.example.demo.Ex1WithOneToManyAndLists.converter;

import com.example.demo.Ex1WithOneToManyAndLists.models.entity.QrGroup;
import com.example.demo.Ex1WithOneToManyAndLists.models.dto.QrGroupDto;
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
