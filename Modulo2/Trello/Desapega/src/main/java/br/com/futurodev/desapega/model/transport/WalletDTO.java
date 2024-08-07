package br.com.futurodev.desapega.model.transport;

import br.com.futurodev.desapega.model.Person;
import br.com.futurodev.desapega.model.Wallet;

import java.math.BigDecimal;

public record WalletDTO (Long id,
                         double balance){

    public WalletDTO(Wallet wallet) {
        this(wallet.getId(), wallet.getBalance());
    }
}
