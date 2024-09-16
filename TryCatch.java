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
