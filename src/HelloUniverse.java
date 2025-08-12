/**
 * Utiliser switch, case et default
 *
 * Nous avons déterminé le nombre de planètes dans le système solaire en fonction d'une date (année) donnée.
 *
 * Nous allons maintenant modifier intégralement notre code pour réaliser la démarche inverse, 
 * c'est à dire afficher à quelle période correspond un nombre de planète donné :
 *
 *     Pour 7, afficher "On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes"
 *
 *     Pour 8, afficher "On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006"
 *
 *     Pour 9, afficher "On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8".
 *
 *   Pour tout autre nombre, on va afficher le message "Le programme ne peut pas fournir de résultat pour <nombre>"
 *
 * Plutôt que d'utiliser une structure en if - else if - else pour tenir compte de tous les cas possibles, nous allons introduire le switch - case - default .
 */

public class HelloUniverse {

    /**
     * Point d'entrée du programme
     * @param args arguments passés au programme
     */
    public static void main(String... args) {
        int nombrePlanetes = 10;
        
        switch (nombrePlanetes) {

            case 7 : 
                System.out.println("On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes");
                break;
            case 8 :
                System.out.println("On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006");
                break;
            case 9 :
                System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8");
                break;
            default:
                System.out.println("Le programme ne peut pas fournir de résultat pour le nombre " + nombrePlanetes);
                break;
        }
    }
}
    