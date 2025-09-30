/**
 * La classe Vaisseau - Une méthode qui référence des objets
 *
 * Les méthodes qui permettent à la planète d'accueillir un vaisseau recevaient en paramètre :

 *    Soit le nombre de passagers

 *    Soit le type de Vaisseau
 *
 * Nous allons fusionner ces 2 méthodes en une seule qui va maintenant réellement 
 * recevoir en paramètre un objet de type Vaisseau. On considérera que le type du  Vaisseau (CROISEUR etc...) 
 * est maintenant une propriété de Vaisseau mais que celle ci ne détermine plus automatiquement le nombre de passagers. 
 * La classe Vaisseau disposera  également d'une nouvelle propriété de type int pour le nombre de passagers 
 * 
 * 
 * IMPORTANT : Il n'est pas prévu pour le moment que nos planètes puissent accueillir les vaisseaux en nombre illimité. 
 * C'est le début de la conquête spatiale, les planètes ne disposent que d'une seule baie d'accostage. 
 * Autrement dit, si un vaisseau est déjà présent, il va devoir au préalable s'en aller.
 * 
 * La méthode qui permet d'accueillir le vaisseau devra également retourner le vaisseau en partance s'il existe. 
 * Pour que cela soit possible, la Planète devra disposer d'une propriété pour stocker le Vaisseau actuellement accosté.
 * 
 * 
 * Faites accoster sur Mars une Frégate de 9 passagers puis un Croiseur de 42 passagers.
 *
 * A chaque fois, indiquez si en arrivant, le nouveau vaisseau à remplacé 
 * un autre vaisseau déjà présent en affichant le type du vaisseau en partance sous la forme :
 *
 *         Aucun vaisseau ne s'en va.
 *
 * ou
 * 
 *        Un vaisseau de type X doit s'en aller.
 *
 * A la fin du programme affichez toujours le nombre de visiteurs ayant déjà posé le pied sur la planète sous la forme :
 *
 *       Le nombre d'humains ayant déjà séjourné sur X est actuellement de Y.
 *
 * Note : Afin que la vérification de la solution depuis la plate-forme Udemy puisse s’exécuter avec succès, 
 * vous devrez utiliser les noms de variable : type  et nbPassagers  dans la classe Vaisseau */
 

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

        Vaisseau fregate = new Vaisseau();
        fregate.nbPassagers=9;
        fregate.type="FREGATE";

        Vaisseau vaisseauSEnva=mars.accueillirVaisseau(fregate);
      

        System.out.println("Le nombre d'humains ayant déjà séjourné sur " + mars.nom + " est actuellement de " + mars.totalVisiteurs + ".");

        

        Vaisseau croiseur = new Vaisseau();
        croiseur.nbPassagers=42;
        croiseur.type="CROISEUR";

        vaisseauSEnva=mars.accueillirVaisseau(croiseur);
 

        System.out.println("Le nombre d'humains ayant déjà séjourné sur " + mars.nom + " est actuellement de " + mars.totalVisiteurs + ".");

        System.out.println("L'atmosphère de " + uranus.nom + " est composée :");
        System.out.println("   D'hydrogène à " + uranus.atmosphere.hydrogene + "%");
        System.out.println("   D'hélium à " + uranus.atmosphere.helium + "%");
        System.out.println("   De méthane à " + uranus.atmosphere.methane + "%");
    }
 }

    