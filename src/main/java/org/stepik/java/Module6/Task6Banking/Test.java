package org.stepik.java.Module6.Task6Banking;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        /*
        EUR DEBIT Optional[TS]
        RUB DEBIT Optional[NS]
        RUB DEBIT Optional[DEPOSIT]
        USD DEBIT Optional[KOPILKA]
        RUB DEBIT Optional[KOPILKA]
        USD DEBIT Optional[DEPOSIT]
        USD DEBIT Optional[NS]
        RUB DEBIT Optional[TS]
        EUR DEBIT Optional[KOPILKA]
        EUR DEBIT Optional[DEPOSIT]
        RUB DEBIT Optional[KOPILKA]
        */

        //--------------------------------------->

        /*
        RUB DEBIT Optional[KOPILKA]
        RUB DEBIT Optional[TS]
        RUB DEBIT Optional[KOPILKA]
        RUB DEBIT Optional[DEPOSIT]
        RUB DEBIT Optional[NS]
        EUR DEBIT Optional[TS]
        USD DEBIT Optional[KOPILKA]
        USD DEBIT Optional[DEPOSIT]
        USD DEBIT Optional[NS]
        EUR DEBIT Optional[KOPILKA]
        EUR DEBIT Optional[DEPOSIT]
        */

        products.add(new Product(Curency.EUR, Type.DEBIT, Optional.of(DebitType.TS)));
        products.add(new Product(Curency.RUB, Type.DEBIT, Optional.of(DebitType.NS)));
        products.add(new Product(Curency.RUB, Type.DEBIT, Optional.of(DebitType.DEPOSIT)));
        products.add(new Product(Curency.USD, Type.DEBIT, Optional.of(DebitType.KOPILKA)));
        products.add(new Product(Curency.RUB, Type.DEBIT, Optional.of(DebitType.KOPILKA)));
        products.add(new Product(Curency.USD, Type.DEBIT, Optional.of(DebitType.DEPOSIT)));
        products.add(new Product(Curency.USD, Type.DEBIT, Optional.of(DebitType.NS)));
        products.add(new Product(Curency.RUB, Type.DEBIT, Optional.of(DebitType.TS)));
        products.add(new Product(Curency.EUR, Type.DEBIT, Optional.of(DebitType.KOPILKA)));
        products.add(new Product(Curency.EUR, Type.DEBIT, Optional.of(DebitType.DEPOSIT)));
        products.add(new Product(Curency.RUB, Type.DEBIT, Optional.of(DebitType.KOPILKA)));

        products.sort(new BankProductComparator());

        for (Product product : products) {
            System.out.println(product.getCurency() + " " + product.getType() + " " + product.getDepositType());
        }
    }
}