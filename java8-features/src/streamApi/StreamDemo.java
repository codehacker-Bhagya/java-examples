package streamApi;

import java.util.ArrayList;
import java.util.List;

import static java.util.Locale.filter;
import static java.util.stream.Collectors.toList;
import static sun.awt.image.MultiResolutionCachedImage.map;

public class StreamDemo {
    public static List<@org.jetbrains.annotations.NotNull Product> main(String[] args) {
        StreamDemo streamDemo = new StreamDemo();
        List<Product> products = streamDemo.generateListData();
        
        
        List<Float> productPriceList = new ArrayList<>();
        for(Product product: products)
            if (product.price() > 35000){
                productPriceList.add(product.price());
            }

        System.out.println("without stream" + productPriceList);
        
        List<Float> SecondPriceList = (List<Float>) products.stream();
        .parallel();
        .filter(product -> product.price()>35000 && product.price()<60000);
                .map(product -> product.price());
        .toList();

        System.out.println("Product Price List by using stream" + SecondPriceList);
        
        
        private List<Product> generateListData(){
            
            List<Product> products1 = new ArrayList<>();
            
            return List.of(new Product(1, "HP Laptop" , 45000f)),
        
            (new Product(2 , "Sony Laptop" , 60000)), 
                    (new Product(3,"apple Laptop" , 85000)));

        
        
        
        }
                
        
    }

    private static void filter(Object o) {
    }

}
