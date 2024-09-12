package org.stepik.java.Module6.Task6Banking;


import java.util.Comparator;

public class BankProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {

        if (o1.getCurency() != Curency.RUB && o2.getCurency() == Curency.RUB) {
            return 1;
        }

        if (o1.getCurency() == o2.getCurency()) {
            return 0;
        }

        if (o1.getCurency() == Curency.RUB && o2.getCurency() != Curency.RUB) {
            return -1;
        }



        if (o1.getType() != Type.CREDIT) {
            return 1;
        }

        if (o1.getType() == Type.CREDIT) {
            return -1;
        }


        return 0;
    }
}
