import java.util.ArrayList;

public class Q3 {
    ArrayList<Integer> RemoveImproperOrderedPair(ArrayList<Integer> input) {
        int len = input.size();
        if (len % 2 == 1) input.remove(len - 1);
        len = input.size();
        for (int i = len - 1; i >= 0; i--) {
            if (i % 2 == 1) if (input.get(i) > input.get(i - 1)) {
                input.remove(i);
                input.remove(i - 1);
            }
        }
        return input;
    }
}
