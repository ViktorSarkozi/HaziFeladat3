package viktorsarkozi.stringcalculator_savuaap;

/**
 *
 * @author SAVUAAP.PTE
 */
public class StringCalculator {

    private int add(String numbers) {
        String[] numbersInArray = numbers.split(",");

        switch (numbersInArray.length) {
            case 1: {
                switch (numbersInArray[0]) {
                    case "":
                        return 0;
                    default:
                        return Integer.parseInt(numbersInArray[0]);
                }
            }
            default: {
                return sum(numbersInArray);
            }
        }
    }

    private int sum(String[] numbersInArray) {
        int sum = 0;
        for (String number : numbersInArray) {
            sum += Integer.valueOf(number);
        }
        return sum;
    }
}
