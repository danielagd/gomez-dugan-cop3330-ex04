package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class MadLib
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a holiday: ");
        String holiday = input.nextLine();
        System.out.print("Enter a noun: ");
        String noun_1 = input.nextLine();
        System.out.print("Enter a place: ");
        String place = input.nextLine();
        System.out.print("Enter a adjective: ");
        String adjective = input.nextLine();
        System.out.print("Enter a noun: ");
        String noun_2 = input.nextLine();
        System.out.println("\"I can't believe it's already " + holiday + "! I can't wait to put on my " + noun_1 + " and visit every " + place + " in my neighborhood. \nThis year, I am going dressed up as a(n) " + adjective + " " + noun_2 + "!\" Isn't that hilarious?");
    }
}
