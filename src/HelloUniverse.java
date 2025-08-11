/**
 * Utiliser if et else
 *
 * Reprenez le code précédent.
 *
 * Vous avez utilisé tout à l’heure le mot clé if 2 fois dans votre code 
 * pour déterminer la valeur du nombre de planètes en fonction de l’année choisie.
 *
 * Or en réalité dans le cas présent il n’y a qu’une seule alternative. 
 * Soit on se trouve avant 2006 soit on est dans le cas contraire.
 *
 * Simplifier l’écriture de votre code grâce au mot clé else.
 */

public class HelloUniverse {

    /**
     * Point d'entrée du programme
     * @param args arguments passés au programme
     */
    public static void main(String... args) {
        int nombrePlanetes = 8;
        int annee = 2006;

        if (annee < 2006) {
            nombrePlanetes = 9;
        } else {
            nombrePlanetes = 8;
        }

        System.out.printf("En %d , les planètes du système solaire étaient au nombre de : %d",annee,nombrePlanetes);
        }
}