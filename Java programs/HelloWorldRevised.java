package week3;

import java.util.Scanner;

class HelloWorldRevised {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Please enter your name: ");
    String name = in.nextLine();
    
    System.out.println("Now tell me what is your favorite dessert? ");
    String dessert = in.nextLine();
    
    System.out.println("Hello " + name + "!");
    System.out.println("I hope you like coding JavaScript as much as you like to eat " + dessert);
    
    System.out.println("What Country do you live in? ");
    String country = in.nextLine();
    System.out.println("Wow, " + country + " is an amazing Country, I want to visit there in the future.");
    
    System.out.println("What is your favorite song from your Country? ");
    String song = in.nextLine();
    System.out.println("I already heard " + song + " it is my favorite song too, it has a nice rhythm");

    System.out.println(name + " I think we could be friends, I will give you a present"
    		+ " What is your favorite color?  ");
    String color = in.nextLine();
    
    System.out.println("Then I will give you one " + color + "... " + dessert + "! Would you like this?");
    String answer = in.nextLine();
    
    System.out.println("Ok " + name + " If you could be anywhere in the world, where would it be?");
    String place = in.nextLine();
    
    System.out.println("Amazing, and what would you be doing there? ");
    String lastAnswer = in.nextLine();
    
    System.out.println("Wow, so it was a pleasure to meet you, see you later! :) ");
          
  }
}