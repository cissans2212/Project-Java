import java.util.Scanner;

public class Myvar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulang = true;

        while (ulang) {
            System.out.println("\nPilih bangun yang ingin dihitung:");
            System.out.println("1. Persegi");
            System.out.println("2. Segitiga");
            System.out.println("3. Lingkaran");
            System.out.println("4. Kubus");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan (1-5): ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    // Persegi
                    System.out.print("Masukkan sisi persegi: ");
                    int sisi = input.nextInt();
                    int luasPersegi = sisi * sisi;
                    int kelilingPersegi = 4 * sisi;
                    System.out.println("Luas Persegi     : " + luasPersegi);
                    System.out.println("Keliling Persegi : " + kelilingPersegi);
                    break;

                case 2:
                    // Segitiga
                    System.out.print("Masukkan alas segitiga: ");
                    int alas = input.nextInt();
                    System.out.print("Masukkan tinggi segitiga: ");
                    int tinggi = input.nextInt();
                    double luasSegitiga = 0.5 * alas * tinggi;
                    System.out.print("Masukkan sisi pertama segitiga: ");
                    int sisi1 = input.nextInt();
                    System.out.print("Masukkan sisi kedua segitiga: ");
                    int sisi2 = input.nextInt();
                    System.out.print("Masukkan sisi ketiga segitiga: ");
                    int sisi3 = input.nextInt();
                    int kelilingSegitiga = sisi1 + sisi2 + sisi3;
                    System.out.println("Luas Segitiga     : " + luasSegitiga);
                    System.out.println("Keliling Segitiga : " + kelilingSegitiga);
                    break;

                case 3:
                    // Lingkaran
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    float r = input.nextFloat();
                    float phi = 3.14f;
                    float luasLingkaran = phi * (r * r);
                    float kelilingLingkaran = 2 * phi * r;
                    System.out.println("Luas Lingkaran     : " + luasLingkaran);
                    System.out.println("Keliling Lingkaran : " + kelilingLingkaran);
                    break;

                case 4:
                    // Kubus
                    System.out.print("Masukkan panjang rusuk kubus: ");
                    int rusuk = input.nextInt();
                    int luasKubus = 6 * (rusuk * rusuk);
                    int kelilingKubus = 12 * rusuk;
                    System.out.println("Luas Permukaan Kubus : " + luasKubus);
                    System.out.println("Keliling Kubus       : " + kelilingKubus);
                    break;

                case 5:
                    // Keluar dari program
                    System.out.println("Terima kasih! Program selesai.");
                    ulang = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }

            if (ulang) {
                System.out.print("\nApakah ingin menghitung lagi? (y/n): ");
                char lanjut = input.next().charAt(0);
                if (lanjut == 'n' || lanjut == 'N') {
                    ulang = false;
                    System.out.println("Terima kasih! Program selesai.");
                }
            }
        }

        input.close();
    }
}
