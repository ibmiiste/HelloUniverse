/**
 * Classe représentant une planète.
 */
public class Planete {
    String nom;
    String matiere;
    long diametre;
    int totalVisiteurs;
    Atmosphere atmosphere;
    Vaisseau vaisseauAccoste;
    static String forme = "Sphérique";

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

    Vaisseau accueillirVaisseau(Vaisseau vaisseauAAppareiller) {

        Vaisseau vaisseauEnPartance = new Vaisseau();
        vaisseauEnPartance = vaisseauAccoste;
        
        if (vaisseauAccoste != null) {
            System.out.println("Un vaisseau de type " + vaisseauAccoste.type + " doit s'en aller.");
        }
        else {
            System.out.println("Aucun vaisseau ne s'en va.");
        }

        vaisseauAccoste = vaisseauAAppareiller;
        totalVisiteurs= totalVisiteurs+vaisseauAAppareiller.nbPassagers;
        
        return vaisseauEnPartance;
    }
}