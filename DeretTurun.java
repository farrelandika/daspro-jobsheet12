public class DeretTurun {
    public static void deretTurunRekursif(int n) {
        if (n < 0) return;
        System.out.print(n + " ");
        deretTurunRekursif(n - 1);
    }

    public static void deretTurunIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int angka = 5;
        System.out.println("Rekursif:");
        deretTurunRekursif(angka);
        System.out.println("\nIteratif:");
        deretTurunIteratif(angka);
    }
}
