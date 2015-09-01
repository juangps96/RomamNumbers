package com.exrcise.juan.romamnumbers;

/**
 * Created by Juan on 31/08/2015.
 * Validation of Roman Number
 */
public class Validation {

    /*
     Validations of the Roman Numbers with a regular expression
     @param NumberToValidate
     @return true or false depending of the entry
     */
    public boolean Validator(String NumberToValidate) {
        return (NumberToValidate.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$"));
    }
}
