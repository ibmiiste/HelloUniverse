/**
 * Galilée ou la réalité des planètes Version 3 - Premiers Objets
 *
 * Instanciez les planètes du système solaire et attribuez des valeurs à leurs propriétés.
 *
 * Mercure, Venus, la Terre et Mars sont des planètes telluriques, les autres sont gazeuses.
 *
 * Vous pouvez trouver les diamètres des planètes ici : Diamètre des planètes (ou ici si ca ne fonctionne pas Extrait PDF)
 *
 * Supprimez le contenu actuel situé dans le bloc du main , mais ajoutez un affichage (System.out.println ) de la matière et du diamètre de Jupiter sous la forme:
 *
 *       Jupiter est une planète Gazeuse avec un diamètre de 142984 kilomètres.
 */
 

public class HelloUniverse {

    /**
     * Point d'entrée du programme
     * @param args arguments passés au programme
     */
    public static void main(String... args) {
        Planete Mercure = new Planete();
        Mercure.nom = "Mercure";
        Mercure.matiere = "Tellurique";
        Mercure.diametre = 4880;

        Planete Venus = new Planete();
        Venus.nom = "Venus";
        Venus.matiere = "Tellurique";
        Venus.diametre = 12100;

        Planete Terre = new Planete();
        Terre.nom = "Terre";
        Terre.matiere = "Tellurique";
        Terre.diametre = 12756;

        Planete Mars = new Planete();
        Mars.nom = "Mars";
        Mars.matiere = "Tellurique";
        Mars.diametre = 6792;

        Planete Jupiter = new Planete();
        Jupiter.nom = "Jupiter";
        Jupiter.matiere = "Gazeuse";
        Jupiter.diametre = 142984;

        System.out.println(Jupiter.nom + " est une planète " + Jupiter.matiere + " avec un diamètre de " + Jupiter.diametre + " kilomètres.");

        Planete Saturne = new Planete();
        Saturne.nom = "Saturne";
        Saturne.matiere = "Gazeuse";
        Saturne.diametre = 120536;

        Planete Uranus = new Planete();
        Uranus.nom = "Uranus";
        Uranus.matiere = "Gazeuse";
        Uranus.diametre = 51118;

        Planete Neptune = new Planete();
        Neptune.nom = "Neptune";
        Neptune.matiere = "Gazeuse";
        Neptune.diametre = 49532;

        Planete Pluton = new Planete();
        Pluton.nom = "Pluton";
        Pluton.matiere = "Glace";
        Pluton.diametre = 2300;
    }
}
    