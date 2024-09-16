### HashMap and HashSet

```java
import java.util.HashMap;
public class HashMapLoop {
    public static void main(String[] args) {
        HashMap<String,String> couples = new HashMap<String,String>();
        couples.put("Sumit", "Disha");
        couples.put("Prince","Kawai");
        couples.put("Rohit", "Komal");
        couples.put("Piyush","Dolly");

        //System.out.println("\033[0;32m"+couples+"\033[0m");
        for(String i: couples.values()){
            System.out.println("\033[0;32m"+i+"\033[0m");
        }
        
    }
}

```

```java
import java.util.HashSet;
class JavaHashSet{
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Car 1");
        cars.add("Car 2");
        cars.add("Car 3");
        cars.add("Car 4");
        System.out.println(cars);
        cars.remove("Car 4");
        System.out.println(cars);
        System.out.println("\033[0;31m"+"Clearing..."+"\033[0m");
        System.out.println(cars);
    }
}
```

### Iterator<String> use to loop through array list

```java
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

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}

```

also removing element while in loop is quite difficult and not working properly in for and foreach loop

```java
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

```

# Java Wrapper Classes

Wrapper classes provide a way to use primitive data types (`int`, `boolean`, etc..) as objects.

The table below shows the primitive type and the equivalent wrapper class:

| Primitive Data Type | Wrapper Class |
| --- | --- |
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| boolean | Boolean |
| char | Character |

### Try catch in java

```java
import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {
        
        Integer cibil=1;
        do{
            try{
                System.out.print("Enter your CIBIL Score: ");
                Scanner scan = new Scanner(System.in);
                cibil= scan.nextInt();
                if(cibil==0){
                    break;
                }
                if(cibil<750){
                    throw new Exception("Your Cibil is below 750, You're not eligible");
                }else{
                    System.out.println("\033[0;32m"+"Congratulations! You're eligible"+"\033[0m");
                }
            }catch(Exception e){
                System.out.println("\033[0;31m"+"Error: "+ e.getMessage()+"\033[0m");
            }
            
        }while(cibil!=0);
    }
}

```

tst
