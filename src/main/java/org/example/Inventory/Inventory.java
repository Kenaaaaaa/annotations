package org.example.Inventory;
/*Ushtrimi **2.2.**1. Sistem i Inventarit në Dyqan
Krijoni Klasë Product me atributete e nevojshme
Me pas krijoni klasën Inventory që përmban një listë Product dhe atribute te tjera.
 Krijo metoda për:
shtim produkti
përditësim çmimi
shfaqje stokut më të ulët
Testo në main funksionalitein*/

//staying.fun/eng
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString


public class Inventory {
    private String location;
    private int nrOfProducts;
    private List<Product> productList=new ArrayList<>();

    public Inventory(String location, List<Product> productList, Product min, int nrOfProducts) {
        this.location = location;
        this.productList = productList;
        productList=new ArrayList<>();
    }

    // shtim produkti
    public void addProduct(Product product){
        productList.add(product);
        nrOfProducts++;
    }

    //Perditesim cmimi
    public void updatePrice(String name, double newPrice){
        productList.stream()
                .filter( p->p.getName().equals(name))
                .forEach( p->p.setPrice(newPrice));


    /**/
    List<Product>  newList=new ArrayList<>();

    for(Product product: productList){
        if(product.getName().equals(name)){
        product.setPrice(newPrice);
        productList.set(productList.indexOf(product),product);
        }
    }

     //   productList.stream() .filter(p -> p.getName().equals(name)) .forEach(p -> p.setPrice(newPrice));
/*listen e kthen ne stream, qe punosh me te dhenat , filter eshte for dhe if,
* condition me gjej produktin qe e ka emrin te barabarfte me kete emer,
* foreach ( pasi eshte filtruar vendosi emrin e ri*/

        for(Product product:newList){
        product.setPrice(newPrice);
    }
    }


    //produkti me stokun me te ulet
    Product min=productList.get(0);

    public Product lowerQuantity( ){
        for(int i=1;i<productList.size();i++){
            if(productList.get(i).getQuantity()<min.getQuantity()){
                min=productList.get(0);
            }
        }
        return null;

    }
}
