import java.util.Scanner;
public class percobaan3 {
    static double hitunglaba(double saldo, int tahun) {
    if (tahun == 0) {
        return (saldo);
    }else {
        return (1.11 * hitunglaba(saldo, tahun - 1));
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoAwal;
        int tahun;
        System.out.print("jumlah saldo awal : ");
        saldoAwal = sc.nextInt();
        System.out.print("Lamanya ivestasi (tahun) : ");
        tahun = sc.nextInt();

        System.out.println("Jumlah saldo setelah " + tahun + " tahun : ");
        System.out.print(hitunglaba(saldoAwal, tahun));

    }
}
