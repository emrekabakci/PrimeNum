public class Main {
    public static void main(String[] args) {
        int num = 100;
        int counter=0;

        for (int i = 1; i < num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter==0){
                System.out.println(i);
            }
            counter=0;
        }
    }
}