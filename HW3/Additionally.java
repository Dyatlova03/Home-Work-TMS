import java.lang.reflect.Array;
import java.util.Random;
import java.util.Arrays;

public class Additionally {
    public static void main(String[] args) {
        Random r = new Random();
        double res=1;
        double[] array = new double[15];
        for (int i = 0; i < 15; i++) {
            array[i] = r.nextInt(20);
            System.out.print(array[i] + " ");
        }
        System.out.println();


        //1
        for (int i = 0; i < 15; i++) {
            if (array[i]>0 && array[i] % 3 == 0) {
                res*= array[i];
            }
        }
        System.out.println("Product of elements multiple of 3 is " + res + " ");

        //2
        double pr=0;
        for (int i = 0; i < 15; i++) {
            if(i%2!=0) {
                pr+= array[i];
            }
        }
        pr/=7;
        System.out.println("Arithmetic mean of elements with add numbers: " + pr + ".");


        //3
        double pr2=0;
        int count=0;
        for (int i = 0; i < 15; i++) {
           if(array[i]>5){
               pr2+=array[i];
               count++;
           }
        }
        pr2/=count;
        System.out.println("Arithmetic mean of elements more than 5: " + pr2 + ".");


        //4
        double min=array[1];
        for (int i = 1; i < 15; i+=2) {
            if(array[i]<min){
                    min=array[i];
            }
        }
        System.out.println("Smallest odd element: " + min + ".");


        //5
        for (int i = 0; i < 15; i++) {
            while(i<7) {
                int n = i + 2;
                array[i] = array[n];
                System.out.print(array[i] + " ");
                i++;
            }
            array[i]=0;
            System.out.print(array[i] + " ");
        }
        System.out.println();


        //6
        int s=0;
        int[] array2 = new int[15];
        for (int i = 0; i < 15; i++) {
            array2[i]=r.nextInt(20);
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        Arrays.sort(array2);
        for (int i = 1; i <15; i++) {
            if(array2[i]== array2[i-1]){
                s=0;
                break;
            } else {
                s=1;
            }
        }
        switch (s){
            case 0:
                System.out.println( "The array has the same elements.");
                break;
            case 1:
                System.out.println("All elements are different.");
                break;
        }


        //7
        int c=5;
        count=0;
        for (int i = 0; i < 15; i++) {
            if(array2[i]==c){
                count++;
            }
        }
        System.out.println("An element equal to " + c + " occurs " + count + "times.");


        //8
        Arrays.sort(array2);
        System.out.println("Next item after max: " + array2[13] + ".");


        //9
        min = array2[0];
        for (int i = 0; i < 15; i+=2) {
            if(array2[i]<min){
                min=array[2];
            }
        }
        System.out.println("Smallest element among even index: " + min + ".");


        //10
        int max=0;
        int[] mas3= new int [15];
        int k;
        for (int i = 0; i < 15; i++) {
            mas3[i]=r.nextInt(30);
            System.out.print(mas3[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            if(mas3[i]>max){
                max=mas3[i];
                s=i;
            }
        }
        k=mas3[s];
        mas3[s]=mas3[0];
        mas3[0]=k;

        for (int i = 0; i < 15; i++) {
            System.out.print(mas3[i] + " ");
        }
        System.out.println();
    }
}
