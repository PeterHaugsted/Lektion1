public class Opgave1 {


    public static void main(String[] args) {

        int test = 10;
        test += 15;
        test += returnTen();
        System.out.println("Hello DTU!");
    }

    public static int returnTen() {
        return 10;
    }


}
