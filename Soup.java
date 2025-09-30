//Name: Nirupam
//Date: 09/29/25
//Description: This program is for company to produce specific words by using different operations on 'letters' string with 'company' name.
public class Soup {
    //these are instance variables 
    private String letters; //will store all the possible letters for this version of soup 
    private String company; //stores which company this soup is for

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //Adds the word passed in to this method to the instance variable 'letters'
    /*Precondition: word should be non null and non empty */
    /*Postcondition: letters will now include the 'word' which is the input to method */
    public void add(String word){
        letters = letters + word;
    }


    //Uses Math.random() to get a random character from the letters string and return it.
    //Generates random number and returns the character at that location or index.
    /*Precondition: letters string should be non null and non empty */
    /*Postcondition: no change to 'letters' string. Returns character present at randomIndex */
    public char randomLetter(){

        int randomIndex = (int)(Math.random() * letters.length());
        return letters.charAt(randomIndex);
    }


    //Returns the letters currently stored with the company name placed directly in the center of all.
    //The letters instance variable is not modified.
    /*Precondition: letters string should be non null and non empty */
    /*Postcondition: company word is in center of letters string */
    public String companyCentered(){
        return letters.substring(0,letters.length()/2)+company+letters.substring(letters.length()/2);
    }


    //Removes the first available vowel from letters. If there are no vowels this method has no effect.
    /*Precondition: letters string should be non null and non empty */
    /*Postcondition: First occurrence of a vowel ,if present, is removed from letters string. */
    public void removeFirstVowel(){
    for (int index = 0; index < letters.length(); index++) {
        char currentChar = letters.charAt(index);
        if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
            currentChar == 'o' || currentChar == 'u') {
            letters = letters.substring(0, index) + letters.substring(index + 1);
            break;
        }
    }
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    //Removes the character at index num which is passed in to this method
    /*Precondition: letters string should be non null and non empty */
    /*Postcondition: Character at num index is removed from letters string */
    public void removeSome(int num){
        String firstPart=letters.substring(0,num-1);
        String secondPart=letters.substring(num);
        letters=firstPart+secondPart;

    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    /*Precondition: letters string should be non null and non empty */
    /*Postcondition: Given word is removed from letters string */
    public void removeWord(String word){
        letters.replace(word,"");
    }
}
