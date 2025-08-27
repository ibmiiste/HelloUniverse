/**
 * Atmosphère de la planète - Utiliser des propriétés sous forme d'objet
 *
 * Nous avons indiqué si la planète était solide (tellurique) ou gazeuse, 
 * il est temps d'aller un peu plus loin en étudiant la composition de son atmosphère.
 *
 * Nous allons créer une nouvelle classe Atmosphere  qui se définit par les propriétés suivantes :
 *
 *   Taux d'hydrogène en % : float 
 *
 *   Taux de méthane en % :float 
 *
 *   Taux d'azote en % : float 
 *
 *   Taux d'hélium en % : float 
 *
 *   Taux d'argon en % : float 
 *
 *   Taux de dioxyde de carbone en % : float 
 *
 *   Taux de sodium en % : float 
 *
 * Ajoutez à la classe Planete une propriété de type Atmosphere et valorisez l'atmosphère de la planète Uranus.
 *
 * Affichez dans le main  la composition de l'atmosphère d'Uranus sous la forme :
 *
 *   L'atmosphère de Uranus est composée :
 *       A X% d'hydrogène
 *
 *       A X% d'argon
 *
 *       A X% de dioxyde de carbone
 *
 *       A X% d'azote
 *
 *       A X% d'hélium
 *
 *       A X% de méthane
 *
 *       A X% de sodium
 *
 * Uranus est composée :
 *
 *       D'hydrogène à 83%
 *
 *      D'hélium à 15%
 *
 *      De méthane à 2.5%
 *
 * Si vous souhaitez effectuer le même travail pour l'ensemble des planètes, voici un super lien: Composition de l'atmosphère des planètes
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
        uranus.atmosphere = new Atmosphere();
        uranus.atmosphere.hydrogene = 83f;
        uranus.atmosphere.helium = 15f;
        uranus.atmosphere.methane = 2.5f;

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

        System.out.println("L'atmosphère de " + uranus.nom + " est composée :");
        System.out.println("   D'hydrogène à " + uranus.atmosphere.hydrogene + "%");
        System.out.println("   D'hélium à " + uranus.atmosphere.helium + "%");
        System.out.println("   De méthane à " + uranus.atmosphere.methane + "%");
    }
}
    