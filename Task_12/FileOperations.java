import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
import java.io.InputStreamReader;

public class FileOperations {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Задание 1: Запись в файл
        try {
            System.out.print("Введите информацию для записи в файл: ");
            String input = reader.readLine();

            BufferedWriter writer = new BufferedWriter(new FileWriter("myfile.txt"));
            writer.write(input);

            writer.close();
            System.out.println("Информация успешно записана в файл!");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Задание 2: Вывод информации из файла
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader("myfile.txt"));
            String line;

            System.out.println("Содержимое файла:");
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }

            fileReader.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Задание 3: Замена информации в файле
        try {
            System.out.print("Введите информацию для замены в файле: ");
            String replacement = reader.readLine();

            BufferedWriter fileWriter = new BufferedWriter(new FileWriter("myfile.txt"));
            fileWriter.write(replacement);

            fileWriter.close();
            System.out.println("Информация успешно заменена в файле!");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Задание 4: Добавление текста в конец файла
        try {
            System.out.print("Введите текст для добавления в конец файла: ");
            String newText = reader.readLine();

            BufferedWriter fileWriter = new BufferedWriter(new FileWriter("myfile.txt", true));
            fileWriter.write(newText);

            fileWriter.close();
            System.out.println("Текст успешно добавлен в конец файла!");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
