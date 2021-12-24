package neffar.startup.inventoryservice;

import neffar.startup.inventoryservice.entity.Product;
import neffar.startup.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(new Product(null, "HP ZBOOK", 950.99));
            productRepository.save(new Product(null, "DELL XPS", 350.99));
            productRepository.save(new Product(null, "MAC BOOK PRO", 999.99));
        };
    }
}
