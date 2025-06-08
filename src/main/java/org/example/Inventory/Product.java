package org.example.Inventory;
/*do shkojme tek pom per te shkruajtur Dependency , e lombok
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.38</version>
</dependency>
lombok, ben gjenerimin e annottation
* */



import lombok.*;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private int quantity; //sasia per 1 produkt
    private String name;
    private double price;


}
