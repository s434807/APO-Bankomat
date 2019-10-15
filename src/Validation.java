import java.util.Calendar;

public class Validation extends Operations{
    public static boolean Luhnvalidate(String cardNumber){
        if(cardNumber.length() > 16 || cardNumber.length() < 13){
            return false;
        }
        //Usuniecie ostatniej cyfry z numeru karty
        int lastDigit = Character.getNumericValue(cardNumber.charAt(cardNumber.length()-1));
        cardNumber = cardNumber.substring(0, cardNumber.length()-1);
        //odwrocenie numeru karty i zapisanie jako string w celu iteracji kroku nastepnego.
        StringBuilder reversed = new StringBuilder(cardNumber).reverse();
        //Multiply the digits in odd positions (1, 3, 5, etc.) by 2 and subtract 9 to all any result higher than 9
        //and Add all numbers
        for (int i = 0; i < reversed.length(); i+=2) {
            if(Character.getNumericValue(reversed.charAt(i)) * 2 > 9 ){
                reversed.setCharAt(i , (char)(Character.getNumericValue(reversed.charAt(i)) * 2 - 9 + '0'));
            }
            else{
                reversed.setCharAt(i , (char)(Character.getNumericValue(reversed.charAt(i)) * 2 + '0'));
            }
        }
        int sum = 0;
        for (int i = 0; i < reversed.length(); i++) {
            sum += Character.getNumericValue(reversed.charAt(i));
        }
        if(sum % 10 == lastDigit){
            return true;
        }
        return false;
    }
    public static boolean isExpired(String cardDate){
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR) % 100;
        int month = c.get(Calendar.MONTH);
        int cardMonth = Integer.parseInt(cardDate.substring(0, 2));
        int cardYear = Integer.parseInt(cardDate.substring(3,5));
        if(year < cardYear || (year == cardYear && month < cardMonth)){
            return false;
        }
        return true;
    }
}
