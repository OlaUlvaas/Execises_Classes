package se.lexicon;

import java.util.Arrays;

/**
 *          Working with Strings
 *          1.What is the length of the String: "Java" ?
 *          2.What char is at index position 6 in the following String:"Long example sentence" ?
 *          3.What is the index position of 'o' in the following String:"Even longer example sentence" ?
 *          4.Given the following String: "Ok this is not as long!" create a substring of only "not as long"
 *          (excluding the exclamation point) and print it out.
 *          5.Convert the following String: "CAPS EQUALS SCREAMING" to lower case and print it out.
 *          Then convert it back to upper case and print it out again.
 *          6.Correct the following String: "Java is the worst programming language!" by replacing the
 *          (obviously incorrect) word "worst" with the word "best". Then print out the sentence.
 *          7.What is the output of the following String:"\tJ\ta\tv\ta\t" after you trim it?
 *          8.Parse the following int: 20 to a String and add a 20 to the end of the String.
 *          Printing it out should return: "2020".
 *          9.Oil and water don't go well together. Given the String:"Oil and Water", split them up into the words
 *          "Oil","Water"and store them in a String array.
 *          10.Split the following String: "Carl,Susie,Fredrick,Bob,Erik"into an array. Print out all names separately.
 *          11.Convert the following String: "ThisShouldBeConverted" to a char array.
 *          Iterate through the char array and print out each element.
 *          12.Convert the following char[]: {'J','a','v','a'} to a String and print it out.
 */
public class ExercisesWithStrings {
    public static void main(String[] args){
        /*1.What is the length of the String: "Java" ?*/
        String word = "Java";
        System.out.println(word.length());      // 4


        /*2.What char is at index position 6 in the following String:"Long example sentence" ?*/
        String longExample = "Long example sentence";
        System.out.println(longExample.charAt(6));          // x

        /*3.What is the index position of 'o' in the following String:"Even longer example sentence" ?*/
        String evenLonger = "Even longer example sentence";
        System.out.println(evenLonger.indexOf('o'));            // 6

        /*4.Given the following String: "Ok this is not as long!" create a substring of only "not as long"*/
        String notAsLong = "Ok this is not as long!";
        System.out.println(notAsLong.substring(11, 22));            // not as long

        /*5.Convert the following String: "CAPS EQUALS SCREAMING" to lower case and print it out.
            Then convert it back to upper case and print it out again.*/

        String upperAndLower = "CAPS EQUALS SCREAMING";
        System.out.println(upperAndLower.toLowerCase());            // caps equals screaming
        System.out.println(upperAndLower.toUpperCase());            // CAPS EQUALS SCREAMING

        /*6.Correct the following String: "Java is the worst programming language!" by replacing the
            (obviously incorrect) word "worst" with the word "best". Then print out the sentence.*/

        String worstBest = "Java is the worst programming language!";
        System.out.println(worstBest.replace("worst", "best"));  // "Java is the best programming language!"

        /*7.What is the output of the following String:"\tJ\ta\tv\ta\t" after you trim it?*/
        String trimTabs = "\tJ\ta\tv\ta\t";
        System.out.println(trimTabs.trim());            // "J    a   v   a"

        /*8.Parse the following int: 20 to a String and add a 20 to the end of the String.
            Printing it out should return: "2020".*/
        int intToString = 20;
        String toBeString = Integer.toString(intToString);
        System.out.println(toBeString + "20");          // "2020"

        /*9.Oil and water don't go well together. Given the String:"Oil and Water", split them up into the words
            "Oil","Water"and store them in a String array.*/
        String oilAndWater = "Oil and water";
        String[] owArray = oilAndWater.split(" and ");
        System.out.println(Arrays.toString(owArray));           // [Oil, water]

        /*10.Split the following String: "Carl,Susie,Fredrick,Bob,Erik"into an array. Print out all names separately.*/
        String names = "Carl,Susie,Fredrick,Bob,Erik";
        String[] nameArray = names.split(",");
        for(String name : nameArray){
            System.out.print(name + " ");           // Carl Susie Fredrick Bob Erik
        }
        System.out.println();
        /*11.Convert the following String: "ThisShouldBeConverted" to a char array.
          Iterate through the char array and print out each element.*/
        String toBeConverted = "ThisShouldBeConverted";
        char[] charArray = new char[toBeConverted.length()];
        for(int i = 0; i < toBeConverted.length(); i++){
            charArray[i] = toBeConverted.charAt(i);
            System.out.println(charArray[i]);               // T
        }                                                   // h
                                                            // i
                                                            // .
                                                            // .
                                                            // .
                                                            // d

        /*12.Convert the following char[]: {'J','a','v','a'} to a String and print it out.*/
        char[] javaChar = {'J','a','v','a'};
        String javaString =" ";
        for(int i = 0; i < javaChar.length; i++){
            javaString += javaChar[i];
        }
        System.out.println(javaString);         // "Java"







    }
}
