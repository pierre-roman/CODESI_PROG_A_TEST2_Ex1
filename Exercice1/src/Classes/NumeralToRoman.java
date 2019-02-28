package Classes;

public class NumeralToRoman {
    public String getRoman(int numeral){
        String roman = "";
        while (numeral >= 1000){
            numeral -= 1000;
            roman = roman + 'M';
        }
        if (numeral >= 900){
            numeral -= 900;
            roman = roman + "CM";
        }
        if (numeral >= 500){
            numeral -= 500;
            roman = roman + "D";
        }
        if (numeral >= 400){
            numeral -= 400;
            roman = roman + "CD";
        }
        while (numeral >= 100){
            numeral -= 100;
            roman = roman + 'C';
        }
        if (numeral >= 90){
            numeral -= 90;
            roman = roman + "XC";
        }
        if (numeral >= 50){
            numeral -= 50;
            roman = roman + 'L';
        }
        if (numeral >= 40){
            numeral -= 40;
            roman = roman + "XL";
        }
        while (numeral >= 10){
            numeral -= 10;
            roman = roman + 'X';
        }
        if (numeral >= 9){
            numeral -= 9;
            roman = roman + "IX";
        }
        if (numeral >= 5){
            numeral -= 5;
            roman = roman + 'V';
        }
        if (numeral >= 4){
            numeral -= 4;
            roman = roman + "IV";
        }
        while (numeral > 0){
            numeral -= 1;
            roman = roman + 'I';
        }
        return roman;
    }
}
