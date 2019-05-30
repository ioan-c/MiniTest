import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class MiniTest {

    static void runTest(){
        boolean ok = false; //used to make sure the user only inserts numerical values or does not exceed 1000 tests
        do {
            try{
                testNumbers();
                ok = true;
            } catch (InputMismatchException ex){
                ex.printStackTrace();
                System.out.println("Please only enter values of type integer or long!");
            } catch (RuntimeException ex) {
                ex.printStackTrace();
            }
        } while (!ok);
    }

    private static void testNumbers(){
        Scanner systemIn = new Scanner(System.in);

        System.out.println("Input:");
        int T = systemIn.nextInt(); //input for number of tests
        if(T>1000){
            throw new RuntimeException("The number of tests cannot be over 1000!");
        }

        //populating list with data
        List<Long> numbersList = new ArrayList<>();
        for(int i=0; i<T; i++){
            Long N = systemIn.nextLong();
            numbersList.add(N);
        }

        //testing the numbers in list
        System.out.println("Output:");
        for(Long number : numbersList){
            if(number%4 == 0){
                System.out.println(++number);
            } else {
                System.out.println(--number);
            }
        }
        systemIn.close();
    }
}
