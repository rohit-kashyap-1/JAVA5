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
