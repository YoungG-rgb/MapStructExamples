package com.example.demo.Ex1WithOneToManyAndLists.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QrGroup extends BaseEntity<Long> {

    private String name;

    @OneToMany(mappedBy = "qrGroup", cascade = {CascadeType.ALL})
    private List<QrInfo> qrInfos = new ArrayList<>();
}
