/**
 * La planète X - le mot clé null
 *
 * Depuis près d'un siècle, les astronomes pensent qu'il existe au moins une planète massive inconnue au delà de Neptune. 
 * On ne connaît ni son diamètre ni de quoi elle est composée. On ne connaît pas même son nom, on l'appelle désormais "planète neuf" 
 * mais elle a eu d'autres noms dans le passé.
 * Voici une petite vidéo sur le sujet pour les passionnés.
 *
 * Instanciez une nouvelle planète sans nom, ni diamètre ni matière. 
 * Affichez ses caractéristiques comme vous l'aviez fait précédemment pour Jupiter.
 *
 * Vous constaterez que la valeur du diamètre non valorisée est alors de 0, valeur par défaut des entiers non valorisés.
 *
 * En revanche pour ce qui concerne le nom et la matière, leur valeur est null  et le fait de tenter de la concaténer, 
 * transforme automatique null  en une chaîne de caractères (String ) valant la séquence de 4 lettres "null".
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
        
    }
}
    