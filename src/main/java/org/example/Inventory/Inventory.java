package org.example.Inventory;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class Inventory {
    private String location;
    private List<Product> products;
}
