package com.exrcise.juan.romamnumbers;
import java.util.HashMap;

/**
 * Created by Juan on 31/08/2015.
 * Convert the Roman number to Decimal number
 */
public class Convertion {

    public static final HashMap<String,Integer> MapRomanNumbers = new HashMap<String,Integer>()
    {{
            put("M",1000);
            put("C",100);
            put("L",50);
            put("X",10);
            put("V",5);
            put("I",1);
        }};

    /**
     *Calculation of the roman numbers
     * NumberToCalculate
     * @return the calculated number
     */
    public int Calculation(String NumberToCalculate)
    {
        char[] TextArray = NumberToCalculate.toCharArray();
        int first;
        int second;
        int third;
        int result = 0;
        String comparison1_2;
        String comparison2_3;
        int i=0;

        while(i < NumberToCalculate.length())
        {
            first = MapRomanNumbers.get(String.valueOf(TextArray[i]));

            try
            {
                second = MapRomanNumbers.get(String.valueOf(TextArray[i+1]));
            }
            catch (IndexOutOfBoundsException e) {
                //No more index in the array
                result = result + first;
                return result;
            }

            comparison1_2 = String.valueOf(TextArray[i])+String.valueOf(TextArray[i+1]);

            try
            {
                third = MapRomanNumbers.get(String.valueOf(TextArray[i+2]));
                comparison2_3 = String.valueOf(TextArray[i+1])+String.valueOf(TextArray[i+2]);
            }
            catch (IndexOutOfBoundsException e) {
                third = 0;//No more index in the array
                comparison2_3 = String.valueOf(TextArray[i+1]);
            }


            //if first is minor than second is minus else plus
            if(comparison1_2.matches("^CM|CD|XC|XL|IX|IV$"))
            {
                result += second - first;
                i+= 1; //play with two numbers
            }
            else //if second is minor than third is minus else plus
                if (comparison2_3.matches("^CM|CD|XC|XL|IX|IV$"))
                {
                    result += first + third - second;
                    i+= 2; //play with three numbers
                }
                else
                {
                    result += first + second;
                    i+= 1; //play with two numbers
                }
            i+= 1;
        }
        return result;
    }

}
