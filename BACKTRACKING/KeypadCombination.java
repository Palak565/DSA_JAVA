import java.util.ArrayList;
import java.util.HashMap;

public class KeypadCombination {
    public static void findKeypadCombo(HashMap<Integer, ArrayList<Character>> map, int n, String res){
        if (n == 0 || n == 1){
            System.out.println(res);
            return;
        }

        int digit = n % 10;
        for (char ch : map.get(digit)){
            findKeypadCombo(map, n/10, ch + res);
        }
    }
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Character>> map = new HashMap<>();
        map.put(2, new ArrayList<>(){{add('a'); add('b'); add('c');}});
        map.put(3, new ArrayList<>(){{add('d'); add('e'); add('f');}});
        map.put(4, new ArrayList<>(){{add('g'); add('h'); add('i');}});
        map.put(5, new ArrayList<>(){{add('j'); add('k'); add('l');}});
        map.put(6, new ArrayList<>(){{add('m'); add('n'); add('o');}});
        map.put(7, new ArrayList<>(){{add('p'); add('q'); add('r'); add('s');}});
        map.put(8, new ArrayList<>(){{add('t'); add('u'); add('v');}});
        map.put(9, new ArrayList<>(){{add('w'); add('x'); add('y'); add('z');}});
        findKeypadCombo(map, 23, "");
    }
}
