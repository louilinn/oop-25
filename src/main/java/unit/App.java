package unit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Vehicle a = new Vehicle("hej");
        System.out.println( "Hello World!" + a );

    }

    public static int[] sortInts(int[] ints) {

        boolean swapped = true;

        while (swapped) {
            // loopa hela listan

            swapped = false;
            for (int i = 0; i < ints.length-1; i ++) {
        
                if (ints[i] < ints[i+1]) {
                    int temp = ints[i];
                    ints[i] = ints[i+1];
                    ints[i+1] = temp;
                    swapped = true;
                }
            }
            // jämföra objekt
            // byta plats om fel orning
            // uppdatera swapped om false

        }    
        return ints;
    }
}
