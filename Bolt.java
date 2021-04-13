public class Bolt {

    public static boolean vasarlas(int ora, int perc) {
        if ((ora >= 9 && ora < 12) || (ora == 12 && perc == 0)) {
            return true;
        } else {
            return false;
        }
    }
}

/* public class Bolt {

    public static boolean vasarlas(int ora, int perc) {
        return (ora >= 9 && ora < 12) || (ora == 12 && perc == 0);
    }

}
 */
