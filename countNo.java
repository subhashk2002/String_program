package String_program;
import java.util.*;
public class countNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str="subhash kumar mishra";
        
        int count=0;

 //count each character except space 
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=' '){
               count++;
            }
        }
        System.out.println("no of character is : "+count);
    }
}
