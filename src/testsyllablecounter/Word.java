/*
 * Class Description: Word strips any leading or trailing non-letter
 * characters from the word (string token) object, then counts the
 * number of syllables based on its vowel(s) groups.
 */
package testsyllablecounter;

/**
 *  This class is based on a sample program from Big Java by Cay Horstmann
 * 
 * @author modified by: A. Wright
 * developed on: 6 March 2013
 */
public class Word 
{
    private String word;   // "scrubbed" input -- all non-letters removed
    int count;             // number of syllables in word
    /**
     *  Construct Word object by removing leading/trailing punctuation
     *  leaving only letters stored in member text
     *  @param  inputS the input string
     */
    public Word (String inputS)
    {
        count = 0;  // set number of syllables to 0 initially

        int i = 0;          // local index to parse through the inputS
        while (i < inputS.length() && 
                Character.isLetter(inputS.charAt(i)) == false)
            i++;
        int j = inputS.length();
        while (j > i && Character.isLetter(inputS.charAt(j - 1))== false)
            j--;
        word = inputS.substring(i,j);
    }
    /**
     * Accessor:  getWord()
     * @return the word without any punctuation 
     */
    public String getWord()
    {
        return word;
    }
    /**
     * Accessor: toString()
     * @return word as string without its punctuation
     */
    public String toString()
    {
        return word;
    }
   /** Mutator: countSyllables()
    * Using the following guidelines, count the number of syllables in word
    * 	A single or a combination of adjacent vowels (a,e,i,o,u,y) counts as 
    *   one syllable 
    *   An “e” at the end of a word does not count as a syllable.
    *Each word has at least one syllable (even if it evaluates to 0 syllables)

    */
    
    public int countSyllables()
    {
        count = 0;
        int upperLimit = word.length()-1;
        if (upperLimit < 0) return 0;   // empty String       
        
        char c = Character.toLowerCase(word.charAt(upperLimit));
        if ( c == 'e') upperLimit--;  // if e at the end of the word, omit it;
                                      // don't want to count as vowel
        
        boolean insideVowelGroup = false;  // indicates vowel/combo found
        for (int i = 0; i <= upperLimit; i++) // look at each character
        {  // check for inside vowel and/or vowel combination
            c = Character.toLowerCase(word.charAt(i));
            if ("aeiouy".indexOf(c)>=0)  // check for c == vowel
            {
              if (!insideVowelGroup) // no vowel/or combo vowel yet
              {                      // Start new vowel group
                  count++;
                  insideVowelGroup = true;
              }
            }else{
                insideVowelGroup = false;
            }
        } // end for loop
        if (count == 0) count++;  // every word has at least one syllable
        return count;
    }
}