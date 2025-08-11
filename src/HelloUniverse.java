/**
 * Affichage conditionnel - Première instruction conditionnelle
 * Reprenez le code précédent. Ce dernier affiche pour l'instant successivement :
 * Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : 8
 * 
 * Il y a quelques années cependant, elles étaient au nombre de : 9
 * 
 * Nous allons désormais offrir des variations dans notre code grâce au mot clé if.
 * 
 * Il s’agit à partir de maintenant de n’afficher plus qu’un seul message avec quelque variations sous la forme :
 * 
 *     En <numéro année>, les planètes du système solaire étaient au nombre de : <nombre planètes>
 *
 * Les éléments entre <> seront variables et dépendent du moment qui nous intéresse.
 *
 * Si l’on veut par exemple connaître le nombre de planètes en 2003 le message affiché sera :
 *
 *     En 2003, les planètes du système solaire étaient au nombre de : 9
 * 
 * Si l’on veut par exemple connaître le nombre de planètes en 2014 le message affiché sera :
 *
 *     En 2014, les planètes du système solaire étaient au nombre de : 8
 * 
 * Pluton a été effectivement exclu du rang des planètes en Août 2006. 
 * Cela signifie donc que le nombre de planètes dans le système solaire est passé de 9 à 8 à ce moment exact. 
 * Mais pour simplifier le code, nous n’allons pas considérer le mois de l’année. 
 * Nous dirons simplement que ce nombre était de 9 avant 2006 et est passé à 8 à partir de 2006 inclus.
 */

public class HelloUniverse {

    /**
     * Point d'entrée du programme
     * @param args arguments passés au programme
     */
    public static void main(String... args) {
        int nombrePlanetes = 8;
        int annee = 2014;

        if (annee < 2006) {
            nombrePlanetes = 9;
        }

        System.out.printf("En %d , les planètes du système solaire étaient au nombre de : %d",annee,nombrePlanetes);
        }
}