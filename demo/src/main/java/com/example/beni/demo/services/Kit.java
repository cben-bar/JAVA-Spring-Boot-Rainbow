package com.example.beni.demo.services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class Kit {

    private Set<String> keyWords = new LinkedHashSet<String>();
    private Set<IBloc> blocs = new LinkedHashSet<IBloc>();

    public Kit() {
        blocs.add(new Wall(103, 2, 2, "Wally", true));
        blocs.add(new Wall(103, 2, 2, "Walla", true));
        blocs.add(new Wall(222, 1, 2, "Wallo", false));
        blocs.add(new Wall(122, 1, 2, "Wallu", false));
        blocs.add(new Door(145, 2, 2, "Doodoo", true));

        keyWords.add("Fortress");
        keyWords.add("Hut");
    }

    public void displayKit() {
        System.out.println("Nombre de bloc dans le kit : " + this.blocs.size());
        System.out.print("Liste des mots clés du kit : ");
        
        for(String motCle :keyWords) {
            System.out.print(motCle);
        }
    }
    
    public Set<String> getKeyWords() {
        return keyWords;
    }
    
    public Set<IBloc> getBlocs() {
        return blocs;
    }

    public void saveKit() {
        StringBuilder builder = new StringBuilder();
        builder.append("Starter Kit\n");
        for(String keyWord : keyWords) {
            builder.append(keyWord + " ");
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("kit.txt"));
            writer.write(builder.toString());
            writer.close(); } catch (IOException e) {
                System.out.println("Impossible to write in file.");
                // logger.error("Impossible to write in file.");
            }
    }
}
