//Ejercicio 1.2

/*.The broken keyboard execution which the start key which is defined as "[" and the end key
"]" can be pressed alone, the idea is to arrange the keyboard in a certain way that in the end it remains legible
taking into account that every time there is a text enclosed [] must be placed at the beginning.
 @authors Carla Sofía Rendón/ Samuel Salazar Salzar
 @version 1.1
 @param tx - Enter a String which contains a text that has both letters and [].
 @return  - will print a string with the text arranged
*/
import java.util.LinkedList;

public class Ejercicio21 {
    public static void Brokenkeyboard(String tx) {
        LinkedList<Character> text = new LinkedList<>(); // O(1)
        int count = 0; // O(1)

        for (char l : tx.toCharArray()) { // O(1)
            if (l == '[') { // O(1)
                count = 0;
            } else if (l == ']') { // O(1)
                count = text.size();
            } else
                text.add(count++, l); // O(1)
        }

        StringBuilder t = new StringBuilder();
        for (char l : text) // O(1)
            t.append(l);

        System.out.println(t.toString());
    }
}
