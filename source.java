package fancyPackage;

import java.util.Scanner;


public class source {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        int bodTim1, bodTim2, zvanjeTim1, zvanjeTim2, maxigra = 0;
        int foo, flag = 0;

        zbrajanje zbrajanjeObj = new zbrajanje();

        do {
            System.out.print("Želte li igrati do 501, 701 ili 1001 bod? ");
            foo = userInput.nextInt();

            if ((foo != 501) && (foo != 701) && (foo != 1001)) {
                System.out.println("Pogrešan unos, molim pokušajte ponovno!");
                continue;
            } else {
                maxigra = foo;
                flag = 1;
            }
            System.out.println("Igra se igra do " + maxigra + "\nNeka vam srce bude u kartama!");

        } while (flag == 0);


        do {
            System.out.print("Unesite bodove za prvi tim: ");
            bodTim1 = userInput.nextInt();
            userInput.nextLine();
            if (bodTim1 > 162) {
                System.out.print("Unesite broj manji od 162\n");
                continue;
            }

            System.out.print("Unesite bodove za drugi tim: ");
            bodTim2 = userInput.nextInt();
            userInput.nextLine();
            if (bodTim2 + bodTim1 != 162) {
                System.out.println("Tim 1 ili Tim 2 hašaju na bodovima.");
                System.out.println("Prebroj te ponovno, molim.");
                continue;
            }

            System.out.print("Unesite zvanje za prvi tim: ");
            zvanjeTim1 = userInput.nextInt();
            userInput.nextLine();

            System.out.print("Unesite zvanje za drugi tim: ");
            zvanjeTim2 = userInput.nextInt();
            userInput.nextLine();

            zbrajanjeObj.setBodoviT1(bodTim1);
            zbrajanjeObj.setBodoviT2(bodTim2);
            zbrajanjeObj.setZvanjeT1(zvanjeTim1);
            zbrajanjeObj.setZvanjeT2(zvanjeTim2);

            zbrajanjeObj.zbrajanjeBodova();
            System.out.print(zbrajanjeObj);

        } while ((zbrajanjeObj.getKrajnjiBodT1() < maxigra) || (zbrajanjeObj.getKrajnjiBodT2() < maxigra));
    }
}
