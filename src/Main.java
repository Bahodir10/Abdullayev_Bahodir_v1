import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        //task3
        String[] j = {"cd","ac","dc","ca","zz"};
        int count = 0;
        for(int i = 0;i<j.length-1;i++){
            for(int a = i+1;a<j.length;a++){
                if(Objects.equals(j[i],reverse(j[a]))){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
    public static String reverse(String str){
        StringBuilder newStr = new StringBuilder();
        for(int i = str.length()-1;i>-1;i--){
            newStr.append(str.charAt(i));
        }
        return new String(newStr);
    }
}