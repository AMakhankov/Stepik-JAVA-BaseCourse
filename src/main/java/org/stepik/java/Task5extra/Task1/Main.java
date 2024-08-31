package org.stepik.java.Task5extra.Task1;

import java.io.*;

//    Написать код, который позволит при сериализации зашифровать номер пасспорта путем прибавления
//    следующей цифры к предыдущей с остатком от деления на десять. Последнюю цифру шифровать не нужно.
//            Пример: 1789 -> 8579
//
//    Так же предусмотреть десериализацию обратно в объект
//    см Externalizible

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Human human = new Human("Boris Britva", "1789");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(human);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Human deserializedHuman = (Human) ois.readObject();
        ois.close();

        System.out.println("Начальный пасспорт id:" + human.passportNumber);
        System.out.println("Десериализованный пасспорт id: " + deserializedHuman.passportNumber);
    }
}
