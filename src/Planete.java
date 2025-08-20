/**
 * Classe représentant une planète.
 */
public class Planete {
    String nom;
    String matiere;
    long diametre;   


    int revolution(int angle) {
        int nombreTour;
        nombreTour = angle / 360;
        return nombreTour;
    }

    int rotation(int angle) {
        int nombreTour;
        nombreTour = angle / 360;
        return nombreTour;
    }
}