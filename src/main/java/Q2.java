import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Q2 {
    TreeSet<Character> random1 = new TreeSet<Character>();
    TreeSet<Character> random2 = new TreeSet<Character>();

    public void feelTreeSetRandom(TreeSet<Character> one , int size) {
        Random random = new Random();
           while (true){
            one.add((char) (97 + random.nextInt(25)));
            if (one.size()==size)
                return;
        }

    }

    public void shorTreeSet(TreeSet<Character> one) {
        Iterator<Character> show1 = one.iterator();

        while (show1.hasNext())
            System.out.println(show1.next());
    }

    public void union(TreeSet<Character> one , TreeSet<Character> two)
    {  int len = one.size();
        ArrayList <Character> getSetOne = new ArrayList<Character>();
        getSetOne.addAll(one);
        ArrayList <Character> getSetTwo = new ArrayList<Character>();
        getSetTwo.addAll(two);
        for (int i = 0; i <len ; i++) {
            for (int j = 0; j < len; j++) {
             if (getSetOne.get(i).equals(getSetTwo.get(j)))
                 System.out.println(getSetOne.get(i));
            }
        }

    }


    public void intersection(TreeSet<Character> one , TreeSet<Character> two)
    {
        int len = one.size();
        one.addAll(two);
        shorTreeSet(one);

    }

    public void q2a() {
        feelTreeSetRandom(random1, 10);
        feelTreeSetRandom(random2, 10);
        System.out.println(" first tree set ");
        shorTreeSet(random1);
        System.out.println("************************************************************");
        System.out.println(" second tree set ");
        shorTreeSet(random2);
    }
    public void q2b(){
        feelTreeSetRandom(random1, 10);
        feelTreeSetRandom(random2, 10);
        System.out.println("first");
        shorTreeSet(random1);
        System.out.println("second");
        shorTreeSet(random2);
        System.out.println("union");
        union(random1,random2);
    }

    public void q2c(){
        feelTreeSetRandom(random1, 10);
        feelTreeSetRandom(random2, 10);
        System.out.println("first");
        shorTreeSet(random1);
        System.out.println("second");
        shorTreeSet(random2);
        System.out.println("intersection");
        intersection(random1,random2);
    }

}
