import java.util.ArrayList;

/**
 * Projektname:            Lotto
 * Programmname:            SpielTest
 * Version: 				1.0
 * Erstellungsdatum:		25.07.2019
 * Autor:   				Kenan Sezgin
 **/
public class SpielTest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        Spiel ob1 = new Spiel(numbers, numbers2);
        ob1.randomNumbers();
        ob1.getTheFirstSeven();
    }
}
