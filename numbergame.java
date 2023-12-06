import java.util.*;
class Game{
       public int number ;
       public int number1;
       public int NoOfGuesses = 0;
       public int getNoOfGuesses(){
        return NoOfGuesses;
       }
       public void setNoOfGuesses(int NoOfGuesses){
        this.NoOfGuesses= NoOfGuesses;
       }
       Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);

       }
       void takeinput(){
        System.out.println("select the number ");
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
       }
       boolean isCorrectNumber(){
        NoOfGuesses++ ;
        if(number1 == number){
            System.out.format("Yes you guessed it right, it was %d\nyou guessed it in %d attempts ", number,NoOfGuesses);
            return true;
        }
        else if(number1>number){
            System.out.println(" to high...");
        
        }
        else if(number1<number){
            System.out.println("to low...");
        }
        return false;


       }
    }
public class numbergame {
    
    public static void main(String args[]){
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeinput();
            b = g.isCorrectNumber();
        }


    }
    
}
