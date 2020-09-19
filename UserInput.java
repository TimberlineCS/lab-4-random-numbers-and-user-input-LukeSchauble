import java.io.*;
import java.util.*;
public class UserInput{
  public static void main(String args[]){
    //Challenge 1
    Scanner sc = new Scanner(System.in);
    System.out.print("Type a negative number:");
    int neg = sc.nextInt();
    neg = Math.abs(neg);
    System.out.print("Type a postive number that is greater than "+neg+":");
    int pos = sc.nextInt();
    int mult = pos+neg;
    int one = (int)(Math.random()*mult)-neg;
    int two = (int)(Math.random()*mult)-neg;
    System.out.print("Your numbers are: ");
    System.out.print(Math.min(one, two));
    System.out.print(",");
    System.out.print(Math.max(one, two));
    //Challenge 2
    Scanner s1 = new Scanner(System.in);
    System.out.print("Input an adjective:");
    String adj = s1.next();
    System.out.print("Input a whole number in between 1 and 12:");
    int time = s1.nextInt();
    Scanner s2 = new Scanner(System.in);
    System.out.print("Input a food:");
    String breakfast = s2.nextLine();
    System.out.print("Input a decimal number(Ex. 14.2):");
    double work = s2.nextDouble();
    Scanner s3 = new Scanner(System.in);
    System.out.print("Input a generic title(Ex. Grandma or Coworker):");
    String title = s3.nextLine();
    System.out.print("Input a whole number:");
    int anger = s3.nextInt();
    System.out.print("I got out of my "+adj+" bed today at "+time+"AM and went to make "+breakfast+" for breakfast. I knew I had to eat quickly because it takes me "+work+" minutes to get to work. I didn't want to make my "+title+" mad for the "+anger+"th time this week.");
  }
}