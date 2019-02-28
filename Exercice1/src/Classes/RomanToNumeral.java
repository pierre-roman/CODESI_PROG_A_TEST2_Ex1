package Classes;

public class RomanToNumeral {
    public int getNumeral(String roman){
        int numeral = 0;
        for (int i = 0; i<roman.length(); i++){
            if (getCharNumeral(roman.charAt(i)) > getCharNumeral(roman.charAt(i+1))){
                numeral += getCharNumeral(roman.charAt(i));
            }
            else if (getCharNumeral(roman.charAt(i)) < getCharNumeral(roman.charAt(i+1)) && getCharNumeral(roman.charAt(i)) * 10 < getCharNumeral(roman.charAt(i+1)) && (roman.charAt(i) == 'I' || roman.charAt(i) == 'X' || roman.charAt(i) == 'C')){
                numeral = numeral + getCharNumeral(roman.charAt(i+1)) - getCharNumeral(roman.charAt(i));
                i++;
            }
            else
                return 0;
        }
        return numeral;
    }

    public int getCharNumeral(char roman){
        switch (roman){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}
