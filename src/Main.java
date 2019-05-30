import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        MiniTest miniTest = new MiniTest();

        boolean ok = false; //used to make sure the user only inserts numerical values
        do {
            try{
                miniTest.processNumbers();
                ok = true;
            } catch (InputMismatchException ex){
                ex.printStackTrace();
                System.out.println("Please enter only long values!");
            } catch (RuntimeException ex) {
                ex.printStackTrace();
            }
        } while (!ok);
    }
}
