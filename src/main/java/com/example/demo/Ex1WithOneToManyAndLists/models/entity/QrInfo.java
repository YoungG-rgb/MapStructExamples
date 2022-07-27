package com.example.demo.Ex1WithOneToManyAndLists.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class QrInfo extends BaseEntity<Long>{

    @Column(unique = true)
    private Long qrKey;

    private String qrValue;

    @JsonIgnore
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY)
    private QrGroup qrGroup;

}
