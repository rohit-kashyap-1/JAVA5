import java.util.ArrayList;
import java.util.Iterator;;
public class JavaIterator {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(25);
        integers.add(12);
        integers.add(32);
        integers.add(45);
        integers.add(65);
        integers.add(54);

        Iterator<Integer> it = integers.iterator();

        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }
        while(it.hasNext()){
            Integer i = it.next();
            if(i<30){
                it.remove();
            }
        }
        System.out.println(integers);

    }
}
