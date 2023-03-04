package MyApplications;

import java.util.Scanner;

public class NumberSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want");
        int sayi = input.nextInt();
        if(sayi<=1){
            System.out.println("Minumum 2 you can enter");
            System.exit(0);
        }
        int[] result = new int[1000];
        for(int i=0;i<sayi;i++) {
            int numEntry = input.nextInt();
            result[i]=numEntry;
        }for(int i=0;i<sayi;i++) {
            for(int j=0;j<sayi;j++) {
                if(result[i]>result[j]) {
                    int temp = result[i];
                    result[i]=result[j];
                    result[j]=temp;
                }
            }
        }
            for(int i=0;i<sayi;i++) {
                System.out.print(result[sayi-1-i]);
                if(i==sayi-1){
                    break;
                }
                for(int j=0;j<sayi;j++) {
                    if (i==j) {
                        continue;
                    }if(result[i]==result[j]) {
                        System.out.print("=");
                    }  else {
                        System.out.print("<");
                    }
                    break;
                }
            }
    }
}
