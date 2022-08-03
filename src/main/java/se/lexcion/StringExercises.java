package se.lexcion;

import java.util.Arrays;

public class StringExercises {

    public static void main(String[] args) {

//1

        {
            String name = "Java";
            System.out.println(name.length());
        }

//2

        {
            String sentence = "Long example sentence";
            System.out.println(sentence.charAt(6));
        }

//3

        {
            String sentence1 = "Even longer example sentence";
            System.out.println(sentence1.indexOf('o'));
        }

//4

        {
            String ok = "Ok this is not as long!";
            System.out.println(ok.substring(11, 22));
        }

//5

        {
            String caps = "CAPS EQUALS SCREAMING";
            System.out.println(caps.toLowerCase());
            System.out.println(caps.toUpperCase());
        }

//6

        {
            String java = "Java is the worst programming language!";
            System.out.println(java.replace("worst", "best"));
        }

//7

        {
            String ex = "\tJ\ta\tv\ta\t";
            System.out.println(ex.trim());
        }

//8

        {
            String year = "20";
            System.out.println(year.endsWith("20"));
        }

//9

        {
            String str = "Oil and Water";
            str = str.replace("and", ",");
            String[] storage = str.split(",", 2);
            System.out.println(Arrays.toString(storage));
        }

//10

        {
            String str = "Carl,Susie,Fredrick,Bob,Erik";
            str = str.replace(",", "\n");
            String[] array = str.split(",", 4);
            System.out.println(Arrays.toString(array));
        }

//11

        {
            String convert = "ThisShouldBeConverted";
            char[] c = convert.toCharArray();
            System.out.println("This sentence \"ThisShouldBeConverted\" will be converted to a char array :\n" + Arrays.toString(c));
        }

//12

        {
            char[] j = {'J', 'a', 'v', 'a'};
            String a = String.valueOf(j);
            System.out.println(a);
            // System.out.print(j.clone());
        }

    }

}





