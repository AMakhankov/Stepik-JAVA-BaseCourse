package org.stepik.java.Module6.Task6Banking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        /*
        EUR DEBIT Optional[TS]
        EUR CREDIT Optional.empty
        RUB DEBIT Optional[NS]
        RUB DEBIT Optional[DEPOSIT]
        USD CREDIT Optional.empty
        USD DEBIT Optional[KOPILKA]
        RUB DEBIT Optional[KOPILKA]
        USD DEBIT Optional[DEPOSIT]
        USD DEBIT Optional[NS]
        RUB DEBIT Optional[TS]
        RUB CREDIT Optional.empty
        EUR DEBIT Optional[KOPILKA]
        EUR DEBIT Optional[DEPOSIT]
        RUB DEBIT Optional[KOPILKA]
        */

//        ----------------------------->

        /*
        RUB DEBIT Optional[TS]
        RUB CREDIT Optional.empty
        RUB DEBIT Optional[DEPOSIT]
        RUB DEBIT Optional[NS]
        RUB DEBIT Optional[KOPILKA]
        RUB DEBIT Optional[KOPILKA]
        EUR DEBIT Optional[TS]
        EUR CREDIT Optional.empty
        USD CREDIT Optional.empty
        USD DEBIT Optional[DEPOSIT]
        EUR DEBIT Optional[DEPOSIT]
        USD DEBIT Optional[KOPILKA]
        USD DEBIT Optional[NS]
        EUR DEBIT Optional[KOPILKA]
        */

        products.add(new Product(Curency.EUR, Type.DEBIT, Optional.of(DebitType.TS)));
        products.add(new Product(Curency.EUR, Type.CREDIT, Optional.empty()));
        products.add(new Product(Curency.RUB, Type.DEBIT, Optional.of(DebitType.NS)));
        products.add(new Product(Curency.RUB, Type.DEBIT, Optional.of(DebitType.DEPOSIT)));
        products.add(new Product(Curency.USD, Type.CREDIT, Optional.empty()));
        products.add(new Product(Curency.USD, Type.DEBIT, Optional.of(DebitType.KOPILKA)));
        products.add(new Product(Curency.RUB, Type.DEBIT, Optional.of(DebitType.KOPILKA)));
        products.add(new Product(Curency.USD, Type.DEBIT, Optional.of(DebitType.DEPOSIT)));
        products.add(new Product(Curency.USD, Type.DEBIT, Optional.of(DebitType.NS)));
        products.add(new Product(Curency.RUB, Type.DEBIT, Optional.of(DebitType.TS)));
        products.add(new Product(Curency.RUB, Type.CREDIT, Optional.empty()));
        products.add(new Product(Curency.EUR, Type.DEBIT, Optional.of(DebitType.KOPILKA)));
        products.add(new Product(Curency.EUR, Type.DEBIT, Optional.of(DebitType.DEPOSIT)));
        products.add(new Product(Curency.RUB, Type.DEBIT, Optional.of(DebitType.KOPILKA)));

        products.sort(new BankProductComparator());

        for (Product product : products) {
            System.out.println(product.getCurency() + " " + product.getType() + " " + product.getDepositType());
        }

    }
}