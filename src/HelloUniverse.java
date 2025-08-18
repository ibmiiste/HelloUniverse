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
 * Faites ensuite tourner neptune autour de son étoile et mars autour d'elle-même en invoquant leur méthodes respectives dans le main .
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
        Planete mercure = new Planete();
        mercure.nom = "mercure";
        mercure.matiere = "Tellurique";
        mercure.diametre = 4880;

        Planete venus = new Planete();
        venus.nom = "venus";
        venus.matiere = "Tellurique";
        venus.diametre = 12100;

        Planete terre = new Planete();
        terre.nom = "terre";
        terre.matiere = "Tellurique";
        terre.diametre = 12756;

        Planete mars = new Planete();
        mars.nom = "mars";
        mars.matiere = "Tellurique";
        mars.diametre = 6792;

        Planete jupiter = new Planete();
        jupiter.nom = "jupiter";
        jupiter.matiere = "Gazeuse";
        jupiter.diametre = 142984;

        System.out.println(jupiter.nom + " est une planète " + jupiter.matiere + " avec un diamètre de " + jupiter.diametre + " kilomètres.");

        Planete saturne = new Planete();
        saturne.nom = "saturne";
        saturne.matiere = "Gazeuse";
        saturne.diametre = 120536;

        Planete uranus = new Planete();
        uranus.nom = "uranus";
        uranus.matiere = "Gazeuse";
        uranus.diametre = 51118;

        Planete neptune = new Planete();
        neptune.nom = "neptune";
        neptune.matiere = "Gazeuse";
        neptune.diametre = 49532;

        Planete pluton = new Planete();
        pluton.nom = "pluton";
        pluton.matiere = "Glace";
        pluton.diametre = 2300;

        Planete planeteNeuf = new Planete();
        System.out.println(planeteNeuf.nom + " est une planète " + planeteNeuf.matiere + " avec un diamètre de " + planeteNeuf.diametre + " kilomètres.");

        neptune.revolution();
        mars.rotation();

    }
}
    