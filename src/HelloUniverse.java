/**
 * Corrigé Exercice de codage 1 : Hello Universe
 * Créez le programme HelloUniverse (New -> Java Class) et remplacez le code généré par le modèle suivant :
 *  public class HelloUniverse {
 *      public static void main(String... args){
 *    
 *      }
 *  }
 * Adaptez le code de manière à ce qu'il affiche dans la console de sortie :
 * Hello Universe!
 * Exécutez.
*/
Public class HelloUniverse {
    public static void main(String... arg){
        String messageDebut = "Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
        System.out.println(messageDebut);
        int nombrePlanetes = 8;
        System.out.println(nombrePlanetes);
        String messageSuite = "Il y a quelques années cependant, elles étaient au nombre de : ";
        System.out.println(messageSuite);
        nombrePlanetes = 9;
        System.out.println(nombrePlanetes);
    }
}