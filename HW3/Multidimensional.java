import java.util.Random;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[][] array = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j]=r.nextInt(50);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        //1
        int sum=0;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                    if(i==j && array[i][j]%2==0) {
                        sum+=array[i][j];
                    }
            }
        }
        System.out.println("Sum of elements of the main diagonal" + sum + ".");


        //2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j+1 && array[i][j]%2!=0){
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();


        //3
        sum=0;
        int sum2=0;
        int count=0;
        int count2 =0;
        for (int i = 0; i < n; i++) {
            for (int j=0; j<n; j++) {
                if (i==j){
                   sum+=array[i][j];
                   count++;
                }
                if (j==array.length-1-i){
                    sum2+=array[i][j];
                    count2++;
                }
            }
        }
        sum/=count;
        sum2/=count2;
        if (sum>sum2){
            System.out.println("The product of the main diagonal is larger.");
        } else {
            System.out.println("The product of the extra diagonal is larger.");
        }


        //4
        sum=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==array.length -2-i && array[i][j]%2==0){
                  sum+=array[i][j];
                }
            }
        }
        System.out.println("Sum of even elements above the extra diagonal: " + sum + ".");


        //5
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
