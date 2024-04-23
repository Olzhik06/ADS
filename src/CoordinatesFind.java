import java.util.ArrayList;
import java.util.Scanner;

public class CoordinatesFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>();
        for(int i=0; i<n; i++){
            ArrayList<Integer> arr2 = new ArrayList<>();
            int m = sc.nextInt();
            for(int j=0; j<m; j++){
                int a = sc.nextInt();
                arr2.add(a);
            }
            arr1.add(arr2);
        }
        System.out.println();
        int s = sc.nextInt();
        for (int i=0; i<s; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            try{
                System.out.println(arr1.get(x-1).get(y-1));
            }catch (Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}