package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {
    public static void main(String[] args) {
        try {
            Zoo myZoo = new Zoo("Savanna Park", "Tunis", 20);

            for (int i = 0; i < 30; i++) {
                Animal a = new Animal("Species" + i, "Animal" + i, i, true);
                boolean added = myZoo.addAnimal(a);
                System.out.println("Added Animal" + i + ": " + added);
            }

            Animal simba = new Animal("Felidae", "Simba", 5, true);
            myZoo.addAnimal(simba);
            Animal fakeSimba = new Animal("Fake", "Simba", 0, false);
            System.out.println("Simba found at: " + myZoo.searchAnimal(fakeSimba));

            System.out.println("Add duplicate Simba: " + myZoo.addAnimal(simba));
            System.out.println("Remove Simba: " + myZoo.removeAnimal(fakeSimba));

        } catch (IllegalArgumentException e) {
            System.err.println("Erreur de validation: " + e.getMessage());
        }
    }
}