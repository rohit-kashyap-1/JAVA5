import java.util.HashMap;
class Main{
    public static void main(String[] args) {
        HashMap<String,String> states = new HashMap<String,String>();
        states.put("Rajasthan","India");
        states.put("Delhi","India");
        System.out.println(states);
        System.out.println("Accessing particular item:");       
        System.out.println(states.get("Delhi"));
        System.out.println("Removing an item");
        states.remove("Delhi");
        System.out.println("\033[0m"+states);
    }
}