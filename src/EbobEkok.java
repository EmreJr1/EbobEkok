import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz :");
        int n1=input.nextInt();

        System.out.print("İkinci sayıyı giriniz :");
        int n2=input.nextInt();

        int ebob=1;
        int ekok=1;
        int i = 1;

        while (i<=n1){
            if (n1%i==0 && n2%i==0){
               ebob=i;
            }
            i++;
        }
        System.out.println("Ebob ="+ ebob);


        if (n1==n2){
            ekok=n1;
        }
        else {
            while (i<=n1*n2){
                if (i%n1==0 && i%n2==0){
                    ekok=i;
                    break;
                }
                i++;
            }

        }System.out.println("Ekok ="+ ekok);



    }
}
