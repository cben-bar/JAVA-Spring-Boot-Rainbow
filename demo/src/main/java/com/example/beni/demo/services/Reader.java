package com.example.beni.demo.services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reader {

    protected String filePath;

    public Reader(String filePath){
        this.filePath = filePath;
    };

    public void readFile(String filePah) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePah))) {
            String line = null;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch(FileNotFoundException e) {
            // logger.error("The file kit.txt does not exist.");
            System.out.println("File does not exist.");
        } catch (IOException e) {
            // logger.error("Impossible to read file: kit.txt");
            System.out.println("Impossible to read the file.");

        }
    }

    public void FileCopy() {
        Path source = Paths.get("source.txt");
        Path destination = Paths.get("destination.txt");
        try {
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
     } catch (NoSuchFileException e) {
         System.out.println("File not found.");
     } catch (IOException e) {
         System.out.println("In/Out error: " + e.getMessage());}
    }

    public void save() {
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        try (
            BufferedReader reader = new BufferedReader(new FileReader(this.filePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter("copy" + date + ".txt"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Impossible to write in file: " + e.getMessage());
                // logger.error("Impossible to write in file.");

        }
    }

     public void readConsole() {
    System.out.println(
        "Enter the file path: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
        String reponse = reader.readLine();
        this.filePath = reponse;
        this.save(); } catch (IOException e) {
            System.out.println("In/Out error: " + e.getMessage());
        }

}
}