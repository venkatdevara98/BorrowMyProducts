package com.techhunters.borrowmyproducts.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductLocationDTO {

    private int productLocationId;

    private ProductDTO product;

    private double longitude;

    private double latitude;
}
