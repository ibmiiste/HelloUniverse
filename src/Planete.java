/**
 * Classe représentant une planète.
 */
public class Planete {
    String nom;
    String matiere;
    long diametre;
    int totalVisiteurs;   


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

    void accueillirVaisseau(int nombreHumain) {
        totalVisiteurs= totalVisiteurs + nombreHumain;
    }

    void accueillirVaisseau(String typeVaisseau) {
        if(typeVaisseau == "CHASSEUR") {
            totalVisiteurs= totalVisiteurs + 3;
        } else if(typeVaisseau == "FREGATE") {
            totalVisiteurs= totalVisiteurs + 12;
        } else if(typeVaisseau == "CROISEUR") {
            totalVisiteurs= totalVisiteurs + 50;
        } else {
            System.out.println("Type de vaisseau inconnu.");
        }
    }
}