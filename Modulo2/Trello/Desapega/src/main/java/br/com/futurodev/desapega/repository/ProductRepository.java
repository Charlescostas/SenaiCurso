package br.com.futurodev.desapega.repository;

import br.com.futurodev.desapega.model.Person;
import br.com.futurodev.desapega.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
