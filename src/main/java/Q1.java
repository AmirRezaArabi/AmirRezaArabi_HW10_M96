import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Q1 {
           private HashMap <Integer,String> PerMutable = new HashMap<Integer,String>();
           private int hashCounter=0;

           public void isPerMut (){
            String str1 = getInput();
            String str2 = getInput();
            if (str1.length()!=str2.length())
            {System.out.println("fail");
            return;}
            else {
                generatePermutation(str1,0,str1.length());
                for (int i =0 ; i<=hashCounter;i++)
                 if (str2.equals(PerMutable.get(i)))
                 {System.out.println("fail");
                return;}
            }
               System.out.println("fail");

           }


    public void getPermutation() {
        String str = getInput();
        int len = str.length();
        generatePermutation(str, 0, len);
        showHashMap(PerMutable,hashCounter);
    }

    private  String swapString(String a, int i, int j) {
        char[] b =a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

            private   void generatePermutation(String str, int start, int end)
            {
                if (start == end-1)
                {
                    PerMutable.put(hashCounter,str);
                    hashCounter++;
                }
                else
                {
                    for (int i = start; i < end; i++)
                    {
                        str = swapString(str,start,i);
                        generatePermutation(str,start+1,end);
                        str = swapString(str,start,i);
                    }
                }
            }

            private   String getInput(){
                Scanner scanner = new Scanner(System.in);
                System.out.println("input your word");
                return scanner.nextLine();

            }

            private  void showHashMap(HashMap<Integer,String> input,int length )
            {
                System.out.println("your answer is : ");
                for (int i = 0; i <length ; i++) {
                    System.out.println(input.get(i));
                }
            }
        }

