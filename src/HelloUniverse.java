/**
 * Rotation des planètes - déclarer et invoquer une méthode
 *
 * Nos planètes ont de nombreuses propriétés mais réalisent également plusieurs "activités" que nous allons matérialiser au travers de méthodes.
 *
 * Par exemple, les planètes effectuent des rotations autour de leur étoile que l'on appelle plus précisément "révolutions" 
 * et qui correspondent au sens stricte aux années. En effet, une révolution de la terre autour du soleil correspond à une année terrestre.
 *
 * Les planètes effectuent également des rotations sur elles-même, que l'on appelle tout simplement "rotation", 
 * et qui correspondent aux journées. Une rotation de la terre sur elle-même correspond à une journée terrestre.
 *
 * Matérialiser ces 2 mouvements (rotation et révolution) à l'aide de méthodes, ajouter dans le corps de ces méthodes un affichage :
 *
 *   Pour la révolution : Je suis la planète <Nom de la planète> et je tourne autour de mon étoile.
 *
 *   Pour la rotation : Je suis la planète <Nom de la planète> et je tourne sur moi-même. 
 *
 *
 * Faites ensuite tourner Neptune autour de son étoile et Mars autour d'elle-même en invoquant leur méthodes respectives dans le main .
 *
 * Note : Afin que la vérification de la solution depuis la plate-forme Udemy puisse s’exécuter avec succès, 
 * vous devrez utiliser le nom de variable nom pour le nom de la planète.
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

        Planete PlaneteNeuf = new Planete();
        System.out.println(PlaneteNeuf.nom + " est une planète " + PlaneteNeuf.matiere + " avec un diamètre de " + PlaneteNeuf.diametre + " kilomètres.");

        Neptune.revolution();
        Mars.rotation();

    }
}
    