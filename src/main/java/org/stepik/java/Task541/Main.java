package org.stepik.java.Task541;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {

            Animal[] originalAnimals = {
                    new Animal("Cat"),
                    new Animal("Dog"),
                    new Animal("Fish"),
                    new Animal("Horse")
            };

            byte[] serializedData = serializeAnimalArray(originalAnimals);

            Animal[] deserializedAnimals = deserializeAnimalArray(serializedData);

            System.out.println("Оригиналы:");
            for (Animal animal : originalAnimals) {
                System.out.println(animal.getName());
            }

            System.out.println("\nПосле десериализации:");
            for (Animal animal : deserializedAnimals) {
                System.out.println(animal.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] serializeAnimalArray(Animal[] animals) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeInt(animals.length);
            for (Animal animal : animals) {
                oos.writeObject(animal);
            }
        }
        return baos.toByteArray();
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        Animal[] animals;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int sizeOfData = objectInputStream.readInt();
            animals = new Animal[sizeOfData];
            for (int i=0; i < sizeOfData; i++) {
                Animal animal = (Animal) objectInputStream.readObject();
                animals[i] = animal;
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
        return animals;
    }



}
