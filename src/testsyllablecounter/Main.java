/*
 * CS1 Lab #4 Testing and Debugging
 */

package testsyllablecounter;

import java.util.Scanner;

/**
 *
 * @author Anita
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String another;
        Scanner cin = new Scanner(System.in);
        
        do{
            System.out.println();
            SyllableCounter sc = new SyllableCounter();
            sc.runSyllableCounter();
            
            System.out.println();
            System.out.print("Do you want another sentence (y/n)? ");
            another = cin.nextLine();
        }while(another.equalsIgnoreCase("y"));
    }

}

/*
run-single:


Enter the text you want analyzed: 
Dungeons and Dragons place palace 1243@Quang Bui@$324
The number of syllables in Dungeons is 2
The number of syllables in and is 1
The number of syllables in Dragons is 2
The number of syllables in place is 1
The number of syllables in palace is 2
The number of syllables in Quang is 1
The number of syllables in Bui is 1

Do you want another sentence (y/n)? y


Enter the text you want analyzed: 
witnesses contribution witnesse witnes
The number of syllables in witnesses is 3
The number of syllables in contribution is 4
The number of syllables in witnesse is 2
The number of syllables in witnes is 2

Do you want another sentence (y/n)? y


Enter the text you want analyzed: 
Finish lab 4 - began to fight with Project 3
The number of syllables in Finish is 2
The number of syllables in lab is 1
The number of syllables in  is 0
The number of syllables in  is 0
The number of syllables in began is 2
The number of syllables in to is 1
The number of syllables in fight is 1
The number of syllables in with is 1
The number of syllables in Project is 2
The number of syllables in  is 0

Do you want another sentence (y/n)? n
BUILD SUCCESSFUL (total time: 1 minute 54 seconds)

*/