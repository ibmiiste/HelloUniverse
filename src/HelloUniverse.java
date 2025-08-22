/**
 * Accueillir des engins spatiaux - Surcharge de méthode
 *
 * Il est temps d'aller rendre visite à nos planètes. Nous sommes en 2156, et nous allons comptabiliser le nombre d'être humains qui aura posé le pied sur la planète.
 *
 * Le nombre total sera matérialisé par une nouvelle propriété totalVisiteurs  de type int  qui a bien évidemment comme valeur de départ 0.
 *
 * Deux nouvelles méthodes nommées accueillirVaisseau  ayant exactement le même nom et ne retournant rien,  vont permettre d'accueillir de nouveaux humains, 
 * et par conséquent incrémenter la propriété ajoutée un peu plus tôt. 
 *
 *   La première prendra en paramètre le nombre de nouveaux humains arrivés avec le vaisseau
 *
 *   La seconde, surchargeant donc la 1ère, prendra en paramètre une chaîne de caractère valant :
 *
 *       Soit "CHASSEUR", ce qui équivaut à 3 êtres humains
 *
 *       Soit "FREGATE", ce qui équivaut à 12 êtres humains
 *
 *        Soit "CROISEUR", ce qui équivaut à 50 êtres humains
 *
 * Dans le main , faites accoster sur Mars un convoi de 8 êtres humains, suivi d'une Frégate. Affichez ensuite le nombre d'être humains finalement comptabilisés sur Mars sous la forme :
 *
 *       Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de 20.
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

        mars.accueillirVaisseau(8);
        mars.accueillirVaisseau("FREGATE");
        System.out.println("Le nombre d'humains ayant déjà séjourné sur " + mars.nom + " est actuellement de " + mars.totalVisiteurs + ".");
    }
}
    