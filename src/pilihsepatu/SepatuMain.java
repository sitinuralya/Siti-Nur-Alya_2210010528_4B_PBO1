package pilihsepatu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SepatuMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Informasi Pembelian Sepatu ===");

            System.out.print("Masukkan jenis sepatu: ");
            String jenis = scanner.nextLine();

            System.out.print("Masukkan jumlah sepatu: ");
            String jumlah = scanner.nextLine();

            SepatuDetail sepatu = new SepatuDetail(jenis, jumlah);

            System.out.println("\nInformasi Sepatu");
            System.out.println(sepatu.displayInfo());

        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan format jenis: "+e.getMessage());
        } catch(Exception e){
            System.out.println("Kesalahan umum: "+e.getMessage());
        }
    }
}