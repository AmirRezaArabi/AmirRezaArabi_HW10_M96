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

    public void put (K k , V v)
    {
        keyArray [length] = k;
        typeArray [length] = v;
        length++;
        resize(length,size,keyArray,typeArray);
    }

    private void resize (int length , int size , K[] key,V[] value)
    {
        if (length==size) {
            keyArray = (K[]) new Object[size * 2];
            typeArray = (V[]) new Object[size * 2];
            for (int i = 0; i < size; i++) {
                keyArray[i] = key[i];
                typeArray[i]= value[i];
            }
        }
    }
    public boolean SpecialKey (K k)
    {
        for (int i = 0; i < length; i++) {
            if (keyArray[i].equals(k))
                return true;
        }
        return false;
    }
}
