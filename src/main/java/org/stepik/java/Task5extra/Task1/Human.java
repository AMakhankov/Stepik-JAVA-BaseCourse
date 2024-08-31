package org.stepik.java.Task5extra.Task1;

//    Написать код, который позволит при сериализации зашифровать
//    номер пасспорта путем прибавления следующей
//    цифры к предыдущей с остатком от деления на десять.
//    Последнюю цифру шифровать не нужно.
//            Пример: 1789 -> 8579
//    Так же предусмотреть десериализацию обратно в объект
//    см Externalizible

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

class Human implements Externalizable {

    String name;
    String passportNumber;

    public Human() {
    }

    public Human(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        String encryptedPassportNumber = encryptPassportNumber(passportNumber);
        out.writeObject(encryptPassportNumber(passportNumber));
        System.out.println(encryptedPassportNumber);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        passportNumber = decryptPassportNumber((String) in.readObject());
    }

    private String encryptPassportNumber(String passportNumber) {

        StringBuilder encrypted = new StringBuilder(passportNumber);
        for (int i = 0; i < encrypted.length() - 1; i++) {
            int currentDigit = Character.getNumericValue(encrypted.charAt(i));
            int nextDigit = Character.getNumericValue(encrypted.charAt(i + 1));
            int encryptedDigit = (currentDigit + nextDigit) % 10;
            encrypted.setCharAt(i, Character.forDigit(encryptedDigit, 10));
        }
        return encrypted.toString();
    }

    private String decryptPassportNumber(String encryptedNumber) {

        StringBuilder sb = new StringBuilder(encryptedNumber);
        int counter = sb.length() - 2;
        while (counter >= 0) {
            int currentDigit = Character.getNumericValue(sb.charAt(counter));
            int nextDigit = Character.getNumericValue(sb.charAt(counter + 1));
            int originalDigit = (currentDigit - nextDigit + 10) % 10;
            sb.setCharAt(counter, Character.forDigit(originalDigit, 10));
            counter--;
        }
        return sb.toString();
    }

}
