/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 jiahao Zhu
 */

import java.util.Scanner;
public class carIssues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Is the car silent when you turn the key?");
        String answer = scan.nextLine();

        if(answer.equals("y"))
        {
            System.out.println("Are  the battery terminals corroded?");
            answer = scan.nextLine();
            if(answer.equals("y"))
            {
                System.out.println("Clean terminals and try starting again.");
            }
            else if(answer.equals("n"))
            {
                System.out.println("Replace cables and try again.");
            }
        }
        else if (answer.equals("n"))
        {
            System.out.println("Does the car make a slicking noise?");
            answer = scan.nextLine();
            if(answer.equals("y"))
            {
                System.out.println("Replace the battery.");
            }
            else if(answer.equals("n"))
            {
                System.out.println("Does the car crank up but fail to start?");
                answer = scan.nextLine();
                if(answer.equals("y"))
                {
                    System.out.println("Check spark plug connections.");
                }
                else if(answer.equals("n"))
                {
                    System.out.println("Does the engine start and then die?");
                    answer = scan.nextLine();
                    if(answer.equals("y"))
                    {
                        System.out.println("Does you car have fuel injection?");
                        answer = scan.nextLine();
                        if(answer.equals("y"))
                        {
                            System.out.println("Get it in for service.");
                        }
                        else if(answer.equals("n"))
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else if(answer.equals("n"))
                    {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
