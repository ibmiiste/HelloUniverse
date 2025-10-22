/**
 * Expansion de l'univers - Une méthode statique
 * 
 * On considère le Big Bang comme le début du temps et de l'espace. On a tendance à croire que le Big Bang s'est produit en un point précis dans l'univers mais il n'en est rien, le Big Bang a été partout, en tous points de l'univers. 
 * 
 * Depuis cet instant, chaque point de l'univers s'éloigne des autres selon des règles qu'il serait ici trop long d'énoncer. 
 * 
 * Cependant, sans tout expliquer (j'en serais d'ailleurs bien incapable), il est tout de même à noter qu'à un instant t, l'éloignement de deux points est proportionnel à une constante (Constante de Hubble) et la distance qui sépare ces 2 points.
 * 
 * J'invite cependant ceux que cela intéresse à consulter le très bon article ci-dessous :
 * 
 * Vitesse d'expansion de l'univers
 * 
 * Les planètes suivent évidemment également ce mouvement. La vitesse d'éloignement d'une planète avec un autre corps céleste, une autre planète par exemple est donc proportionnelle à la distance qui sépare ces 2 planètes.
 * 
 * Ajoutez à la classe Planete  une méthode statique que vous nommerez expansion . Cette méthode prendra en paramètre une distance qui sépare 2 planètes en milliards de kilomètres (double). A moins de ressentir une vocation particulière dans le domaine, ne faites aucun calcul précis dans cette méthode. Nous allons simplifier :
 * 
 * Si la distance est < 14, retourner une chaîne de caractère :
 * 
 *         Oh la la mais c'est super rapide !
 * 
 * Si la distance est > ou égale 14, retourner la chaîne de caractère :
 * 
 *        Je rêve ou c'est plus rapide que la lumière ?
 * 
 * Incroyable mais vrai, la théorie veut que si 2 objets étaient éloignés de plus de 14 milliards de kilomètres environ, ils s'éloigneraient à une vitesse supérieure à la lumière. Est-ce que ces distances existent ? Ceci est une autre énigme, en tous cas, plus on s'approche de la vitesse de la lumière moins il est facile de regarder et bien évidemment au delà ce n'est plus possible.
 * 
 * Invoquez à partir de main  la méthode expansion  avec 10,5 milliard de kilomètres puis avec 14,2 milliards de kilomètres.
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

        System.out.println(Planete.expansion(10.5));
        System.out.println(Planete.expansion(14.2));
    }
 }

    