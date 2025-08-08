/**
 * Le cas de Pluton Version 4 - Opérateur de concaténation
 *
 * Reprenez HelloUniverse.java et faites en sortes de réduire à 2 lignes l'ensemble du texte affiché à l'écran, 
 * en concaténant le texte et le nombre de planètes sur une seule ligne à chaque fois :
 *
 * Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : 8
 * Il y a quelques années cependant, elles étaient au nombre de : 9
 *
 * Vous n'utiliserez donc plus que 2 System.out.println
 */

public class HelloUniverse {

    /**
     * Point d'entrée du programme
     * @param args arguments passés au programme
     */
    public static void main(String... args) {
        int nombrePlanetes = 8;
        String messageDebut = "Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
        String messageSuite = "Il y a quelques années cependant, elles étaient au nombre de : ";
        System.out.println(messageDebut + nombrePlanetes);
        System.out.println(messageSuite + (++nombrePlanetes));
        }
}