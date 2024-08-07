package br.com.futurodev.desapega.repository;

import br.com.futurodev.desapega.model.Person;
import br.com.futurodev.desapega.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long>{
}
