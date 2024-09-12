package org.stepik.java.Module6.Task6Banking;

import java.util.Optional;

enum Curency {
    USD, RUB, EUR
}

enum Type {
    DEBIT, CREDIT
}

enum DebitType {
    TS, NS, DEPOSIT, KOPILKA
}

class Product {
    private Curency curency;
    private Type type;
    private Optional<DebitType> depositType;

    public Product(Curency curency, Type type, Optional<DebitType> depositType) {
        this.curency = curency;
        this.type = type;
        this.depositType = depositType;
    }

    public Curency getCurency() {
        return curency;
    }

    public Type getType() {
        return type;
    }

    public Optional<DebitType> getDepositType() {
        return depositType;
    }
}
