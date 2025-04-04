package com.example.beni.demo.services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
            // logger.error("Le fichier kit.txt n'existe pas.");
            System.out.println("File does not exist.");
        } catch (IOException e) {
            // logger.error("Impossible de lire le fichier kit.txt");
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
        StringBuilder builder = new StringBuilder();
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("copy" + date + ".txt"));
            writer.write(builder.toString());
            writer.close(); } catch (IOException e) {
                System.out.println("Impossible to write in file.");
                // logger.error("Impossible to write in file.");
            }
    }
}

    // public void readConsole() {
    //     try {

    //     }
    // }



// public static void main(String[] args) throws IOException {
//     logger.info("Lancement du programme Epicrafter's Journey.");
//     try {
//         // Le programme commence avec un Kit de démarrage.
//         KitDemarrage kit = new KitDemarrage();
//         System.out.println("Vous possédez un kit de démarrage !");·
//         System.out.println(
//         "Que souhaitez-vous afficher ?\n\t1 - Les idées de constructions. \n\t2 - Le nombre de blocs pour chaque type de blocs présent dans le kit");
//         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//         String reponse = reader.readLine();
//         if (reponse.equals("1")) {
//             // code pour afficher les idées de constructions
//         } else if(reponse.equals("2")) {
//             // code pour affiche le nombre de blocs pour chaque type de blocs présent dans le kit
//         } else {
//             System.out.println("La valeur saisie n'est pas valide - tapez 1 ou 2.");
//         }
//     } catch (IllegalBlocException e) {
//         System.out.println("Impossible de construire le Kit de démarrage.");
//     }
//     logger.info("Arret du programme Epicrafter's Journey.");
// }