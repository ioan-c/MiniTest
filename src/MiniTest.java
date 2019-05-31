import java.util.*;

class MiniTest {

    static void runTest(){
        boolean ok = false; //used to make sure the user only inserts numerical values or does not exceed 1000 tests
        do {
            try{
                testNumbers(readUserInput());
                ok = true;
            } catch (InputMismatchException ex){
                ex.printStackTrace();
                System.out.println("Please only enter values of type integer or long!");
            } catch (RuntimeException ex) {
                ex.printStackTrace();
            }
        } while (!ok);
    }

    private static List<Long> readUserInput(){
        Scanner systemIn = new Scanner(System.in);

        System.out.println("Input:");
        int T = systemIn.nextInt(); //input for number of tests
        if(T>1000){
            throw new RuntimeException("The number of tests cannot be over 1000!");
        }

        //populating list with data
        List<Long> numbersList = new ArrayList<>(T);
        for(int i=0; i<T; i++){
            Long N = systemIn.nextLong();
            numbersList.add(N);
        }
        systemIn.close();
        return numbersList;
    }

    static List<Long> testNumbers(List<Long> numbersList){
        //testing the numbers in list
        System.out.println("Output:");
        ListIterator<Long> listIter = numbersList.listIterator();
        while (listIter.hasNext()) {
            Long number = listIter.next();
            if(number%4 == 0){
                Long tempNr = ++number;
                System.out.println(tempNr);
                listIter.set(tempNr);
            } else {
                Long tempNr = --number;
                System.out.println(tempNr);
                listIter.set(tempNr);
            }
        }
       return numbersList;
    }
}
