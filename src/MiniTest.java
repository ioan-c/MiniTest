import java.util.ArrayList;
import java.util.Scanner;

class MiniTest {

    void processNumbers(){
        Scanner systemIn = new Scanner(System.in);

        System.out.println("Input:");
        int T = systemIn.nextInt(); //number of tests
        if(T>1000){
            throw new RuntimeException("The number of tests cannot be over 1000!");
        }

        ArrayList<Long> numbersList = new ArrayList<>();
        for(int i=0; i<T; i++){
            Long N = systemIn.nextLong();
            numbersList.add(N);
        }

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
