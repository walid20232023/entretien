package fr.bordeaux.isped.MonProjetExamJava.PatientToCreateDTO;

import java.util.Random;

public class RandomStringChooser {


    public static String chooseRandomString(String str1, String str2) {
        Random random = new Random();
        int randomIndex = random.nextInt(2); // Génère un nombre aléatoire soit 0 soit 1
        return (randomIndex == 0) ? str1 : str2; // Si randomIndex est 0, retourne str1, sinon retourne str2
    }

}
