/**
 * La forme des planètes - Une propriété statique
 *
 * Ajouter à la classe Planete  une propriété forme, de type String .
 *
 * Sa valeur sera "Sphérique" et valable pour l'ensemble des instances.
 *
 * Afficher la forme d'une Planète en général et de Mars en particulier avec la syntaxe suivante :
 *
 *     La forme d'une planète est : Y
 *
 *     La forme de X est : Y
 *
 * Note : Afin que la vérification de la solution depuis la plate-forme Udemy puisse s’exécuter avec succès, vous devrez utiliser le nom de variable  forme  dans la classe Planete
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

        System.out.println("La forme d'une planète est : " + Planete.forme);
        System.out.println("La forme de " + mars.nom + " est : " + mars.forme);
    }
 }

    