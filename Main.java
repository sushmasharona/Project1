import java.util.Scanner;
public class Main {
   /**
 * @param args
 */
public static void main(String args[]) {
   Scanner sc= new Scanner(System.in);
   int myNumber=(int)(Math.random()*100);
   int userNumber=0;
   
   do{ 
        System.out.println("Guess my Number");
        userNumber=sc.nextInt();

       if(userNumber==myNumber){
           System.out.println("Yayy!!.. you have guessed the correct number");
           break;
       }
       else if (userNumber> myNumber){
           System.out.println("Your number is too big");
       }
       else  {
           System.out.println("Your number is too small");
       }
   }
   while(userNumber>=0);
   System.out.println("The correct answer is "+myNumber);

       
   }
}
   
   
