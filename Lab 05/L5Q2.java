import java.util.ArrayList;

public class L5Q2 {

    public static void main(String[] args) {

        ArrayList<Integer> randNum = new ArrayList<Integer>(10);

        for (int i = 0; i < 10; i++) {

            int temp = (int) (Math.random() * 20);

            while (randNum.contains(temp)) {
                temp = (int) (Math.random() * 20);
            }

            System.out.printf("%d%s", temp, (i == 9) ? "" : ", ");
            randNum.add(temp);
        }
    }
}
