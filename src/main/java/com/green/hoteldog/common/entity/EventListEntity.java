package com.green.hoteldog.common.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "t_event_list")
public class EventListEntity {
    @Id
    @Column(columnDefinition = "BIGINT UNSIGNED")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventPk;
    @Column(nullable = false)
    private String pic;
    @Column(nullable = false)
    private String url;
}
