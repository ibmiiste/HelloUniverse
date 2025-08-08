/**
 * Le cas de Pluton Version 2 - Première variable de type String

Modifiez l'exercice précédent en créant une nouvelle variable qui accueillera successivement les phrases affichées à savoir :

    Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de :

    Il y a quelques années cependant, elles étaient au nombre de :

Votre code devra donc afficher successivement :

       <La valeur de la nouvelle variable de type String  qui contient la phrase> 

       <La valeur d'une variable de type int qui contient le nombre de planètes>

       <La valeur de la MEME VARIABLE de type String  qui contient la phrase>

       <La valeur de la MEME VARIABLE de type int qui contient le nombre de planètes>
*/
public class HelloUniverse {
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