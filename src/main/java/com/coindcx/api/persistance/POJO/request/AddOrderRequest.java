package com.coindcx.api.persistance.POJO.request;

import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter
public class AddOrderRequest {
    private Long size;
    private Long price;
    private Time time;
    private String side;
}
