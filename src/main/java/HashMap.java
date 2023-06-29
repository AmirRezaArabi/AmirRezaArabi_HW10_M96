import java.util.ArrayList;

public class HashMap <K,V>{

    private K [] keyArray ;
    private V [] typeArray ;

    private static int length ;

    private K k ;

    private V v;

    int size ;

    public HashMap() {
     length = 0;
     size = 10 ;
     keyArray = (K[]) new Object[size];
     typeArray = (V[]) new Object[size];
    }

    public boolean put (K k , V v)
    {
        keyArray [length] = k;
        typeArray [length] = v;
        length++;

    }

    private void resize (int length , int size , K[] key,V[] value)
    {
        

    }
}
