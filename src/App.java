//Created by Rahmat Riansyah - 41519010010

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {
        Scanner inputFunc = new Scanner(System.in);
        OddValue grade = new OddValue(); // inisialisasi class OddValue alias membuat Object baru
        int start, end; // inisialisasi variabel

        // menginput nilai awal
        System.out.print("Masukkan nilai awal : ");
        start = inputFunc.nextInt();

        // menginput nilai akhir
        System.out.print("Masukkan nilai akhir : ");
        end = inputFunc.nextInt();

        List<Integer> data = grade.genereteOdd(start, end); // memanggil function generateOdd dengan mengirimkan 2
                                                            // argumen

        System.out.println("\nBerikut adalah bilangan ganjil dari " + start + " sampai " + end + "  : "
                + data.toString().replace("[", "").replace("]", "")); // memampilkan nilai ganjil dari function
                                                                      // generateOdd yang berada di class OddValue
    }
}

class OddValue { // membuat class OddValue

    public List<Integer> genereteOdd(int start, int end) { // membuat function generateOdd dengan 2 parameter
        List<Integer> odds = new ArrayList<>(); // inisialisasi List untuk menampung nilai akhir

        for (int x = start; x <= end; x++) { // melakukan looping sesuai nilai dari parameter yang dimiliki
            if (x % 2 != 0) { // melakukan pengkondisian untuk membedakan bilangan ganjil dan yang bukan
                odds.add(x); // menambahkan bilangan ganjil
            }
        }
        return odds; // mengembalikan List nilai yang telah didapat
    }

}