/**
 * Utiliser if, else if et else
 *
 * Notre code n’est pas tout à fait correct fonctionnellement. 
 *
 * En réalité personne ne sait si les scientifiques ne changeront pas d’avis dans le futur 
 * et excluront pourquoi pas Mercure du rang de planète.
 *
 * De la même manière, les planètes n’ont pas toutes été découvertes d’un coup, 
 * Uranus par exemple fut découverte au 17ème siècle et Neptune au 18ème.
 * *
 * On va améliorer notre code de manière à restreindre notre gamme de valeurs acceptables. 
 * On acceptera des valeurs à partir de l’an 1600 et jusqu’à disons 2020 incluse.
 *
 * Dans le cas contraire, il faudra alors afficher le message :
 *
 * Le programme ne peut pas fournir de résultat pour l'année <année>
 *
 * Si en revanche l'année choisi est acceptable, 
 * alors on va également considérer les 2 cas supplémentaires qui corresponde à la découverte de Uranus et Neptune.
 *
 * Si l'année est inférieure à 1700 alors le nombre de planètes est de 7
 *
 * Sinon si l'année est inférieure à 1800 alors le nombre de planètes est de 8
 */

public class HelloUniverse {

    /**
     * Point d'entrée du programme
     * @param args arguments passés au programme
     */
    public static void main(String... args) {
        int nombrePlanetes = 8;
        int annee = 2019;

        if (annee < 1600 || annee >=2020) {
            System.out.println("Le programme ne peut pas fournir de résultat pour l'année " + annee);
        } else
        { if (annee<1700){
            nombrePlanetes = 7;
        }
        else if (annee<1800){
            nombrePlanetes=8;
        }
        else if (annee<2006) {
            nombrePlanetes=9;
        }
        else {
            nombrePlanetes=8;
        }

        System.out.println("En " + annee + ", les planètes du système solaire étaient au nombre de : " + nombrePlanetes);
        }}
    }
    