/**
 * class Description: Syllable Counter requires that the user provide
 *                    input text that will be parsed one word at a time
 *                    and displayed with its number of syllables
 *                      one per line
 *
 *  SyllableCounter uses class Word to analyze each word token to
 *  determine the number of syllables in each word
 *
 */
package testsyllablecounter;

import java.util.Scanner;

/**
 * Based on a program from Big Java by Cay Horstmann
 *
 * @author Modified by: A. Wright
 */
public class SyllableCounter
{
   String inputText;
   
 /**
  * default constructor
  */  
   public SyllableCounter()  
   {
       inputText = "";
   }
   /**
    * Mutator: setInputText() accepts input string from the user to be 
    * parsed -- called from runSyllableCounter()
    */
   public void setInputText()
   {
      Scanner cin = new Scanner(System.in);
      System.out.println("\nEnter the text you want analyzed: ");
       inputText = cin.nextLine(); 
   }
   
   public void setInputText(String inText)
   {
      inputText = inText; 
   }
   /**
    * Accessor: Instructions()  Explains how to use the class
    */
   public void instructions()
   {
       
     System.out.println(" This Syllable Counter parses your text into " +
                         "words, then counts and reports the number of\n" +
                         " syllables per word in the text -- the ENTER " +
                         "KEY terminates your text entry \n");
    }

   /**
    * Mutator:  runSyllableCounter() controls the actions of the
    *           syllableCounter; provides instructions, prompts the user
    *           for input, sets up a Scanner object to parse the input into
    *           individual words to be analyzed by class Word to count the
    *           syllables and then prints the word and its syllable count
    */
    public void runSyllableCounter()
    {
       //instructions();
       setInputText();
       Scanner input= new Scanner(inputText); // create a scanner object
       do                                     // from the uwer's input text
       {
           String token = input.next();       // get next input token
           Word word = new Word (token);      // scrub and analyze the word
           //System.out.print(word + "\t");
           int syllableCount = word.countSyllables(); // count syllables
           System.out.println("The number of syllables in " + word +
                               " is " + syllableCount); // report count
       } while (input.hasNext());             // continue for each word
    }

}
