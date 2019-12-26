package fancyPackage;

import java.util.Arrays;
import java.util.Scanner;

public class zbrajanje {
    private int bodoviT1, bodoviT2, zvanjeT1, zvanjeT2;
    private int krajnjiBodT1, krajnjiBodT2;

    public zbrajanje() {
    }

   /* public zbrajanje(int bodoviT1, int bodoviT2, int zvanjeT1, int zvanjeT2) {
        this.bodoviT1 = bodoviT1;
        this.bodoviT2 = bodoviT2;
        this.zvanjeT1 = zvanjeT1;
        this.zvanjeT2 = zvanjeT2;
        this.krajnjiBodT1 = 0;
        this.krajnjiBodT2 = 0;
    }*/

    // Setter
    public void setBodoviT1(int bodoviT1) {
        this.bodoviT1 = bodoviT1;
    }

    public void setBodoviT2(int bodoviT2) {
        this.bodoviT2 = bodoviT2;
    }

    public void setZvanjeT1(int zvanjeT1) {
        this.zvanjeT1 = zvanjeT1;
    }

    public void setZvanjeT2(int zvanjeT2) {
        this.zvanjeT2 = zvanjeT2;
    }

    public int getKrajnjiBodT1() {
        return this.krajnjiBodT1;
    }

    public int getKrajnjiBodT2() {
        return this.krajnjiBodT2;
    }

    public int getZvanjeT1() {
        return zvanjeT1;
    }

    public void zbrajanjeBodova() {
        if (getZvanjeT1() > 0) {
            krajnjiBodT1 += (bodoviT1 + zvanjeT1);

        } else {
            krajnjiBodT1 += bodoviT1;
        }
        if (zvanjeT2 > 0) {
            krajnjiBodT2 += (bodoviT2 + zvanjeT2);
        } else {
            krajnjiBodT2 += bodoviT2;
        }
        System.out.print("Tim 1 bodovi: " + krajnjiBodT1);
        System.out.print("\nTim 2 bodovi: " + krajnjiBodT2);
    }

    public String toString() {
        if (krajnjiBodT1 >= 1001) {
            return "\nPobjednik je Tim 1 sa osvojenim " + krajnjiBodT1 + " bodova!\n";
        } else if (krajnjiBodT2 >= 1001) {
            return "\nPobjednik je Tim 2 sa osvojenim " + krajnjiBodT2 + " bodova!\n";
        } else {
            return " \n";
        }
    }
}
