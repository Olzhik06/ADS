import java.util.ArrayList;
import java.util.Scanner;

public class QueryList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int num= sc.nextInt();
            arr1.add(num);
        }
        int q=sc.nextInt();
        for(int i=0; i<q; i++){
            String query=sc.next();
            if(query.equals("Insert") || query.equals("insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                arr1.add(x, y);
            } else if(query.equals("Delete") || query.equals("delete")){
                int x = sc.nextInt();
                arr1.remove(x);

            }else{
                System.out.println("Error");

            }
        }
        System.out.println();
        System.out.println(arr1);
    }
}