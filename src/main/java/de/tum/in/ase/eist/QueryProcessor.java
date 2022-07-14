package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "MyTeam";
        } else { // TODO extend the programm here

            String line = "564 33 654 8321 15";
            //We split the line at each space, so we can separate each number
            String[] array = line.split("\\s+");

            //Integer.MIN_VALUE will give you the smallest number an integer can have,
            //and you can use this to check against.
            int largestInt = Integer.MIN_VALUE;

            //We iterate over each of the separated numbers (they are still Strings)
            for (String numberAsString : array) {

                //Integer.parseInt will parse a number to integer from a String
                //You will get a NumberFormatException if the String can not be parsed
                int number = Integer.parseInt(numberAsString);

                //Check if the parsed number is greater than the largestInt variable
                //If it is, set the largestInt variable to the number parsed
                if (number > largestInt) {
                    largestInt = number;
                }
            }
            return Integer.toString(largestInt);
        }

    }
}
