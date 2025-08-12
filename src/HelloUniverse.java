/**
 * La structure itérative avec le mot clé for
 *
 * Dans cette nouvelle étape des travaux pratiques, nous allons maintenant résumer dans un petit paragraphe 
 * les informations que nous connaissons du système solaire.
 *
 * Nous allons afficher successivement le texte qui correspond à 7 planètes puis celui qui correspond à 8 planètes et enfin celui qui correspond à 9 planètes.
 *
 * Nous allons utiliser une boucle for pour itérer sur les valeurs de 7 à 9 et afficher le texte correspondant à chaque valeur.
 *
 * Pour ce faire nous allons effectuer une itération de 7 à 9 autour de notre bloc switch grâce au mot clé for .
 */

public class HelloUniverse {

    /**
     * Point d'entrée du programme
     * @param args arguments passés au programme
     */
    public static void main(String... args) {
        int nombrePlanetes = 7;
        for(;nombrePlanetes<10;nombrePlanetes++){
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
}
    