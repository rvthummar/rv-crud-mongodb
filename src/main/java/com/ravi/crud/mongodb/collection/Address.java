package com.ravi.crud.mongodb.collection;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private String adddress1;
    private String adddress2;
    private String city;

}
