package com.example.demo.Ex1WithOneToManyAndLists.converter;

import com.example.demo.Ex1WithOneToManyAndLists.repo.QrGroupRepository;
import com.example.demo.Ex1WithOneToManyAndLists.models.entity.QrInfo;
import com.example.demo.Ex1WithOneToManyAndLists.models.dto.QrInfoDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper
public abstract class QrInfoMapper {

    @Autowired
    QrGroupRepository qrGroupRepository;

    @Mappings ({
            @Mapping(target = "qrKey", source = "key"),
            @Mapping(target = "qrValue", source = "value"),
            @Mapping(target = "active", source = "isActive"),
            @Mapping(target = "qrGroup", expression = "java(qrGroupRepository.findById(qrInfoDto.qrGroupId()).get())")
    })
    abstract QrInfo toEntity(QrInfoDto qrInfoDto);

    @InheritInverseConfiguration
    @Mapping(target = "qrGroupId", source = "qrGroup.id")
    abstract QrInfoDto toDto(QrInfo qrInfo);

}
