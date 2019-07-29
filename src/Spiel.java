import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Projektname:            Lotto
 * Programmname:            Spiel
 * Version: 				1.0
 * Erstellungsdatum:		25.07.2019
 * Autor:   				Kenan Sezgin
 **/
public class Spiel {
    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<Integer> numbers2 = new ArrayList<>();

    //Standard Constructor
    public Spiel() {
        super();
        System.out.println("Warnung! Parameterlosen Standard-Konstruktor aufgerufen in Klasse " + this.getClass().getSimpleName());
    }

    //Constructor with parameters
    public Spiel(ArrayList<Integer> numbers, ArrayList<Integer> numbers2) {
        this.numbers = numbers;
        this.numbers2 = numbers2;
    }

    public void randomNumbers() {
        // create a random number
        for (int i = 1; i <= 49; i++) {
            numbers.add(i);
        }
        // mix the numbers
        Collections.shuffle(numbers);
        System.out.println("    Zufallszahlen: " + numbers);
    }

    public void getTheFirstSeven() {
        for (int i = 0; i <= 6; i++) {
            numbers2.add(numbers.get(i));
        }
        int superZahl = numbers2.get(6);
        System.out.println("Superzahl: " + superZahl);
        numbers2.remove(6);
        // sort the numbers
        Collections.sort(numbers2);
        // put the random seventh number to the array
        System.out.println(numbers2);
    }
    //lalayokodd
}
