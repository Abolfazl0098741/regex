package regix;

public class Main {
    public static void main(String[] args) {

        String [] numbers ={"+995 442 123456","+93 30 539-0605","+61 2 1255-3456","+86 (20) 1255-3456",
                "+49 351 125-3456","+62 21 6539-0605","+98 (515) 539-0605","+39 06 5398-0605",
                "+64 3 539-0605","+63 35 539-0605","+65 6396 0605","+66 2 123 4567","+44 141 222-3344",
                "+1 (212) 555-3456","+84 35 539-0605"};

        String rgx="^((\\(?\\+\\d{1,3}\\)?)\\s\\(?\\d{1,4}\\)?\\s(\\d{3,4}[- ]\\d{4}|\\d{4}|\\d{6}))$";


        for (String testRgx : numbers)
        {
            System.out.println(testRgx + ":");
            if (testRgx.matches(rgx))
            {
                System.out.println("valid  the whole phone number");
            }else
            {
                System.out.println("invalid the whole phone number");
            }
        }


    }
}
