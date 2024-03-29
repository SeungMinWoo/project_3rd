package com.green.hoteldog.common.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "t_hotel_where")
public class HotelWhereEntity {
    @Id
    @OneToOne(optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "hotel_pk",referencedColumnName = "hotelPk",columnDefinition = "BIGINT UNSIGNED")
    private HotelEntity hotelPk;

    @Column(nullable = false)
    private String addressName;

    @Column(nullable = false)
    private String region1DepthName;

    @Column(nullable = false)
    private String region2DepthName;

    @Column(nullable = false)
    private String region3DepthName;

    @Column(nullable = false)
    private String zoneNum;

    @Column(name = "x_coordinate",nullable = false)
    private String x;

    @Column(name = "y_coordinate",nullable = false)
    private String y;

    @Column(nullable = false)
    private String detailAddress;

}
