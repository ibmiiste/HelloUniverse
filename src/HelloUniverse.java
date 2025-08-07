/**
 * Reprenez HelloUniverse.java et faites en sortes que la variable qui représente
 * le nombre de planètes passe de 8 à 9 entre les 2 affichages grâce à l'opérateur d'incrémentation.
 */

public class HelloUniverse {

    /**
     * Point d'entrée du programme
     * @param args arguments passés au programme
     */
    public static void main(String... args) {
        String messageDebut = "Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
        System.out.println(messageDebut);
        int nombrePlanetes = 8;
        System.out.println(nombrePlanetes);
        String messageSuite = "Il y a quelques années cependant, elles étaient au nombre de : ";
        System.out.println(messageSuite);
        nombrePlanetes++;
        System.out.println(nombrePlanetes);
    }
}