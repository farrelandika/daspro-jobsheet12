import java.util.Scanner;
public class percobaan2_soal {
    static String deret = "";

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            deret += "1";
            return (1);
        } else {
            deret += x + "x";
            return x * hitungPangkat(x, y - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang akan dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        int hasil = hitungPangkat(bilangan, pangkat);

        System.out.println(deret + " = " + hasil);

    }
}

