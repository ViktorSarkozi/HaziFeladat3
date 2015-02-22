package viktorsarkozi.stringcalculator_savuaap;

/**
 *
 * @author SAVUAAP.PTE
 */
public class StringCalculator {

    private int add(String numbers) {
        String[] numbersInArray = numbers.split(",");

        for (int i = 0; i < numbersInArray.length; i++) {

            switch (numbersInArray.length) {
                case 1: {
                    switch (numbersInArray[0]) {
                        case "":
                            return 0;
                        default:
                            return Integer.parseInt(numbersInArray[0]);
                    }
                }
                default:
                    return 100;
            }
        }

    }
}
