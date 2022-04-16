package by.itAcademy.homework.les16_serialization.task2;

import java.io.*;

public class SerializationUtil {
    public static void serialize(Computer computer, File file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file, false))) {
            oos.writeObject(computer);
        } catch (IOException exception) {
            System.err.println(exception);
        }
    }

    public static Computer deserialize(File file) {
        try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream(file))) {
            return (Computer) oos.readObject();
        } catch (IOException | ClassNotFoundException exception) {
            System.err.println(exception);
            return null;
        }
    }
}
