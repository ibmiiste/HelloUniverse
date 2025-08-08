/** Le cas de Pluton - Première variable
 Les scientifiques remettent régulièrement en question le nombre de planètes dans le système solaire. 
 Actuellement au nombre de 8, on en comptabilisait 9 avec Pluton il y a encore quelques années. 
 L'objectif est de reprendre le code "Hello Universe" en affichant successivement :
 
    Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : 
 
        <La valeur d'une variable de type int >

        Il y a quelques années cependant, elles étaient au nombre de : 

        <La valeur de la MÊME VARIABLE>
*/

public class HelloUniverse {
    public static void main(String... arg){
        System.out.println("Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ");
        int nombrePlanetes = 8;
        System.out.println(nombrePlanetes);
        System.out.println("Il y a quelques années cependant, elles étaient au nombre de : ");
        nombrePlanetes = 9;
        System.out.println(nombrePlanetes);
    }
}