/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improving modularity and reusability.
 *
 * @author Developer
 * @version 4
 */

public class App {

    // Main method to run the banner display
    public static void main(String[] args) {

        String[] banner = {

            "  *****      *****      ******      *****  ",
            " *     *    *     *    *     *    *        ",
            " *     *    *     *    *     *    *        ",
            " *     *    *     *    ******      *****   ",
            " *     *    *     *    *          *        ",
            " *     *    *     *    *          *        ",
            "  *****      *****     *           *****   "

        };

        // Loop through array and print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}