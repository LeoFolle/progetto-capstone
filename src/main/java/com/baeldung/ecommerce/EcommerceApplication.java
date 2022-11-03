package com.baeldung.ecommerce;

import com.baeldung.ecommerce.model.Product;
import com.baeldung.ecommerce.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.save(new Product(1L, "Mele verdi", 3.00, "https://images.placeholders.dev/?width=200&height=100&bgColor=%23000&textColor=rgba(255,255,255,0.5)"));
            productService.save(new Product(2L, "Mele rosse", 2.50, "https://images.placeholders.dev/?width=200&height=100&bgColor=%23000&textColor=rgba(255,255,255,0.5)"));
            productService.save(new Product(3L, "Arance", 2.70, "https://images.placeholders.dev/?width=200&height=100&bgColor=%23000&textColor=rgba(255,255,255,0.5)"));
            productService.save(new Product(4L, "Ciliegie", 6.50, "https://images.placeholders.dev/?width=200&height=100&bgColor=%23000&textColor=rgba(255,255,255,0.5)"));
            productService.save(new Product(5L, "Kiwi", 4.00, "https://images.placeholders.dev/?width=200&height=100&bgColor=%23000&textColor=rgba(255,255,255,0.5)"));
            productService.save(new Product(6L, "Banane", 2.00, "https://images.placeholders.dev/?width=200&height=100&bgColor=%23000&textColor=rgba(255,255,255,0.5)"));
            productService.save(new Product(7L, "Patate", 4.00, "https://images.placeholders.dev/?width=200&height=100&bgColor=%23000&textColor=rgba(255,255,255,0.5)"));
            productService.save(new Product(8L, "Pomodoro", 4.00, "https://images.placeholders.dev/?width=200&height=100&bgColor=%23000&textColor=rgba(255,255,255,0.5)"));
            productService.save(new Product(9L, "Sedano", 2.00, "https://images.placeholders.dev/?width=200&height=100&bgColor=%23000&textColor=rgba(255,255,255,0.5)"));
            productService.save(new Product(10L, "Peperoni", 4.00, "https://images.placeholders.dev/?width=200&height=100&bgColor=%23000&textColor=rgba(255,255,255,0.5)"));
            productService.save(new Product(11L, "Zucchine", 3.00, "https://images.placeholders.dev/?width=200&height=100&bgColor=%23000&textColor=rgba(255,255,255,0.5)"));
            productService.save(new Product(12L, "Cavolfiore", 3.00, "https://images.placeholders.dev/?width=200&height=100&bgColor=%23000&textColor=rgba(255,255,255,0.5)"));
            productService.save(new Product(13L, "Petto di pollo", 11.00, "https://images.placeholders.dev/?width=200&height=100&bgColor=%23000&textColor=rgba(255,255,255,0.5)"));
            productService.save(new Product(14L, "Cosce di pollo", 9.00, "https://images.placeholders.dev/?width=200&height=100&bgColor=%23000&textColor=rgba(255,255,255,0.5)"));
            productService.save(new Product(15L, "Filetto di Manz", 30.00, "https://images.placeholders.dev/?width=200&height=100&bgColor=%23000&textColor=rgba(255,255,255,0.5)"));
            productService.save(new Product(16L, "Costicine di Manzo", 10.00, "https://images.placeholders.dev/?width=200&height=100&bgColor=%23000&textColor=rgba(255,255,255,0.5)"));
            productService.save(new Product(17L, "Salsiccia di Maiale", 8.00, "https://images.placeholders.dev/?width=200&height=100&bgColor=%23000&textColor=rgba(255,255,255,0.5)"));
            productService.save(new Product(18L, "Braciole di Maiale", 12.00, "https://images.placeholders.dev/?width=200&height=100&bgColor=%23000&textColor=rgba(255,255,255,0.5)"));
        };
    }
}
