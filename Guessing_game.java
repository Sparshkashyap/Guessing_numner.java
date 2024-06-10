import java.util.*;
public class Guessing_game{
    public static int check_random_number(){
        double random_number=(int)(Math.random()*100);
        return (int)random_number;
    }
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        System.err.println("===============Welcome to Guessing Game===============");
        double random_number=(int)(Math.random()*100);
        // System.err.println((int)random_number);
        int n=0;
        while(n>=0){
            Scanner sc = new Scanner(System.in);
            System.err.print("Enter the Guessing number:");
            n =sc.nextInt();
            // System.err.println("\n");
            if(n>random_number){
                System.err.println("=============================");
                System.err.println("you are given largest number");
                System.err.println("Try again 'Never Give up'");
                System.err.println("=============================");
            }
            else if(n<random_number){
                System.err.println("=============================");
                System.err.println("you are given Smallest number");
                System.err.println("Try again 'Never Give up'");
                System.err.println("=============================");
            }
            else if(n==random_number){
                System.err.println("=============================");
                System.err.println("Hurrah! you are win the game");
                System.err.println("=============================");
                System.err.println("Do you want to play game again");
                System.err.println("YES or NO");
                String v=sc.next();
                String m="YES";
                

                if(v.compareTo(m)==0){
                    n=0;
                     random_number=check_random_number();
                    }
                else{
                    System.err.println("Shyad sahi soch raha tha");
                    break;
                }

            }
            else{
                System.err.println("Invailed Number");
            }
                
            }
            System.err.print("Hint:");
            System.err.print((int)random_number);
          
        }

        
}
    

