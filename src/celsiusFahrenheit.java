/*Programma che permetta all’utente di convertire una temperatura fornita in gradi da Celsius a Fahrenheit e viceversa.
Le formule sono:
gradi_Celsius = 5 (gradi_Fahrenheit - 32) / 9
gradi_Fahrenheit = 9 (gradi_Celsius / 5) + 32
Nel codice dobbiamo usare una variabile di tipo 'char' che deve contenere le lettere "C" o "c" per Celsius e "F" o "f" per i Fahrenheit,
in modo tale che sia questa variabile ad indirizzare il programma nella scelta della formula corretta di conversione.
Ad esempio se imposto la variabile a "C" (oppure “c”) e gradi a 35, significa che voglio convertire i 35 gradi Celsius in gradi Fahrenheit.
Quindi si converte la temperatura in gradi Fahrenheit se si inseriscono i Celsius e viceversa.
Se vengono digitate lettere diverse da C, c, F o f, si mostri un messaggio che riporta l'inserimento di una lettera non corretta.
Il programma puo' essere scritto usando lo switch. */
import java.util.*;
public class celsiusFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        float temperatura;
        char scala;
        String nomeScala=null;
        String scalaConv=null;
        System.out.print("Convertitore Celsius/Fahrenheit\n");
        System.out.print("Inserisca solo il numero della temperatura: ");
        temperatura = sc.nextFloat();
        System.out.print("Ora inserisca la scala C per Celsius, F per Fahrenheit: ");
        scala = reader.next().charAt(0);
        System.out.print("Hai inserito " + temperatura);

        if (scala=='C' || scala=='c' || scala =='F' || scala =='f') {
            switch (scala) {
                case 'C':
                case 'c':
                    nomeScala="Celsius";
                    scalaConv="Fahrenheit";
                    temperatura = (9 * temperatura / 5) + 32;
                    break;
                case 'F':
                case 'f':
                    nomeScala="Fahrenheit";
                    scalaConv="Celsius";
                    temperatura = 5 * (temperatura - 32) / 9;
                    break;
            }
            System.out.println(" in scala " + nomeScala);
            System.out.println("Convertito a " +scalaConv +" sono: " + temperatura + " gradi.");
        } else {
            System.out.println("\nHai inserito "+scala +" non corrisponde a una scala. Deve inserire solo le lettere C o F (anche in minuscolo)");
        }
    }
}