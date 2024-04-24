import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        //task3
        String[] j = {"cd", "ac", "dc", "ca", "zz"};
        int count = 0;
        for (int i = 0; i < j.length - 1; i++) {
            for (int a = i + 1; a < j.length; a++) {
                if (Objects.equals(j[i], reverse(j[a]))) {
                    count++;
                }
            }
        }
        System.out.println(count);


        //task 4;
        ArrayList<Integer> task4 = new ArrayList<>(List.of(8, 3, 4, 5));
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < task4.size(); i++) {
            if (task4.get(i) % 2 == 0) {
                int temp = task4.get(i);
                while (true) {
                    if (!answer.contains(temp)) {
                        answer.add(temp);
                    }
                    temp /= 2;
                    if (temp % 2 != 0) {
                        break;
                    }
                }
                if(!answer.contains(temp)){
                    answer.add(temp);
                }
            }
            if (task4.get(i) % 2 != 0) {
                if (!answer.contains(task4.get(i))) {
                    answer.add(task4.get(i));
                }
                if (!answer.contains(task4.get(i) * 2)) {
                    answer.add(task4.get(i) * 2);
                }
            }
        }
        System.out.println(answer);

    }

    public static String reverse(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = str.length() - 1; i > -1; i--) {
            newStr.append(str.charAt(i));
        }
        return new String(newStr);
    }


}