public class PenjumlahanRekursif {
    public static int jumlahRekursif(int n) {
        if (n == 1) return 1; 
        return n + jumlahRekursif(n - 1);
    }

    public static void main(String[] args) {
        int angka = 5;
        System.out.println("Penjumlahan dari 1 sampai " + angka + " adalah: " + jumlahRekursif(angka));
    }
}
