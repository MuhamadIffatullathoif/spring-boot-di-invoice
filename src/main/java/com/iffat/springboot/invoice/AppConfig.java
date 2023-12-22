package com.iffat.springboot.invoice;

import com.iffat.springboot.invoice.models.Item;
import com.iffat.springboot.invoice.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {

    // @Primary
    @Bean
    List<Item> itemsInvoice() {
        Product product = new Product("Mouse",50);
        Product product1 = new Product("Keyboard", 100);
        return Arrays.asList(new Item(product, 2), new Item(product1, 4));
    }

    @Bean("default")
    List<Item> itemsInvoiceOther() {
        Product product = new Product("Mouse",50);
        Product product1 = new Product("Keyboard", 100);
        Product product2 = new Product("Monitor", 1000);
        Product product3 = new Product("Speaker", 400);
        return Arrays.asList(new Item(product, 2), new Item(product1, 4), new Item(product2, 4), new Item(product3, 4));
    }
}
