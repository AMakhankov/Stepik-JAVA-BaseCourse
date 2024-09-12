package org.stepik.java.Module6.Task6Banking;


import java.util.Comparator;

public class BankProductComparator implements Comparator<Product> {

    private boolean checkIsDebitType(Product product, DebitType type) {
        return product.getType() == Type.DEBIT && product.getDepositType().orElse(null) == type;
    }

    @Override
    public int compare(Product p1, Product p2) {


        if (p1.getCurency() != Curency.RUB && p2.getCurency() == Curency.RUB) {
            return 1;
        }

        if (p1.getCurency() == p2.getCurency()) {
            return 0;
        }

        if (p1.getCurency() == Curency.RUB && p2.getCurency() != Curency.RUB) {
            return -1;
        }

        if (!checkIsDebitType(p1, DebitType.TS) && checkIsDebitType(p2, DebitType.TS)) {
            return 1;
        }

        if (checkIsDebitType(p1, DebitType.TS) && !checkIsDebitType(p2, DebitType.TS)) {
            return -1;
        }

        if (p1.getType() != Type.CREDIT && p2.getType() == Type.CREDIT) {
            return 1;
        }

        if (p1.getType() == p2.getType()) {
            return 0;
        }

        if (p1.getType() == Type.CREDIT && p2.getType() != Type.CREDIT) {
            return -1;
        }

        if (!checkIsDebitType(p1, DebitType.DEPOSIT) && checkIsDebitType(p2, DebitType.DEPOSIT)) {
            return 1;
        }

        if (checkIsDebitType(p1, DebitType.DEPOSIT) && !checkIsDebitType(p2, DebitType.DEPOSIT)) {
            return -1;
        }

        return 0;
    }
}
