import java.util.ArrayList;
import java.util.Scanner;

public class InstructionsCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int num1 = sc.nextInt();
            if(num1==1){
                int num2=sc.nextInt();
                arr1.add(0, num2);
            }
            else if(num1==2){
                int num2=sc.nextInt();
                arr1.add(num2);
            } else if (num1 == 3) {
                System.out.println();
                System.out.println(arr1.get(0));
                arr1.remove(0);
            } else if (num1== 4) {
                System.out.println();
                System.out.println(arr1.get(arr1.size()-1));
                arr1.remove(arr1.size()-1);
            }
        }
    }
}