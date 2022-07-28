import java.util.Scanner;
import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();

        int [] Array = new int [n];
        int [] sort = new int [n];

        for(int i=0;i<n;i++){

                System.out.print(i+1 + ".Elemanı : ");

               Array[i]= input.nextInt();

            }
            for(int i=0;i<n;i++){

                for(int j=i+1;j<n;j++) {
                    int x=Array[i];
                    if(Array[j]<Array[i]){


                        Array[i] =Array[j];
                        Array[j]=x;

                    }
                }
            }

            System.out.println(Arrays.toString(Array));
    }
}
