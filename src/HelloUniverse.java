/**
 * Indiquer l'angle de rotation - ajouter des arguments et obtenir une valeur de retour
 *
 * Les méthodes que nous venons de créer indiquent qu'une rotation est en cours. Améliorons ces méthodes afin d'indiquer maintenant l'angle de rotation. 
 * Cet angle peut être positif ou négatif, signifiant le sens de rotation.
 *
 * Il peut également dépasser les 360° indiquant que nous souhaitons une rotation de plus d'un tour.
 *
 * Les méthodes devront également être en mesure de retourner un entier indiquant le nombre de tours complets effectués lors de cette rotation.
 * Nous retournerons une valeur du nombre de tours conservant le signe de la rotation, autrement dit, -745° équivaut à -2 tours complets.
 *
 * Faites tourner à nouveau Neptune autour de son étoile mais désormais de -3542°.
 * Toutes les planètes du système solaire tournent autour du soleil dans le sens inverse des aiguilles d'une montre.
 *
 * Faites tourner Mars autour d'elle-même de -684°, Mars tourne sur elle-même dans le sens inverse des aiguilles d'une montre.
 *
 * Faites également tourner Vénus, la seule planète du système solaire à tourner sur elle-même dans le sens des aiguilles d'une montre de 1250°.
 * 
 * A chaque fois, affichez à partir du main le nombre de tours complets réalisés avec la syntaxe suivante :
 *
 *     Neptune a effectué -9 tours complets autour de son étoile.
 *
 * Note : Afin que la vérification de la solution depuis la plate-forme Udemy puisse s’exécuter avec succès, vous devrez utiliser les noms de méthode : rotation  et revolution
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

        System.out.println(neptune.nom + " a effectué " + neptune.revolution(-745) + " tours complets autour de son étoile.");
        
        System.out.println(mars.nom + " a effectué " + mars.rotation(-684) + " tours complets sur elle-même.");

        System.out.println(neptune.nom + " a effectué " + neptune.revolution(-3542) + " tours complets autour de son étoile.");

        System.out.println(venus.nom + " a effectué " + venus.rotation(1250) + " tours complets sur elle-même.");
    }
}
    