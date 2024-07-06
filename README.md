# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini merupakan aplikasi sederhana untuk pengelolaan informasi sepatu berbasis Java, sebagai bagian dari tugas akhir mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini memungkinkan pengguna untuk menginput jenis dan jumlah sepatu yang ingin dibeli, dan menampilkan informasi detail mengenai sepatu tersebut seperti deskripsi, stok, dan harga. Deskripsi setiap jenis sepatu didapat berdasarkan jenis yang dimasukkan, dan harga serta stok sudah ditetapkan sesuai dengan jenis sepatu.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, IO Sederhana, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Sepatu`, `SepatuDetail`, dan `SepatuMain` adalah contoh dari class.

```bash
public class Sepatu {
    ...
}

public class SepatuDetail extends Sepatu {
    ...
}

public class SepatuMain {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `SepatuDetail sepatu = new SepatuDetail(jenis, jumlah);` adalah contoh pembuatan object.

```bash
SepatuDetail sepatu = new SepatuDetail(jenis, jumlah);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `jenis` dan `jumlah` adalah contoh atribut.

```bash
String jenis;
String jumlah;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Sepatu` dan `SepatuDetail`.

```bash
public Sepatu(String jenis, String jumlah) {
        this.jenis = jenis;
        this.jumlah = jumlah;
}

public SepatuDetail(String jenis, String jumlah) {
        super(jenis, jumlah);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setJenis` dan `setJumlah` adalah contoh method mutator.

```bash
public void setJenis(String jenis) {
        this.jenis = jenis;
}

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getJenis`, `getJumlah`, `getDeskripsi`, `getStok`, dan `getHarga`adalah contoh method accessor.

```bash
public String getJenis() {
        return jenis;
}

    public String getJumlah() {
        return jumlah;
}

public String getDeskripsi() {
        String jenis = getJenis().toLowerCase()
  ...
}

public int getStok() {
        String jenis = getJenis().toLowerCase();
  ...
}

public double getHarga() {
        String jenis = getJenis().toLowerCase();
  ...
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `jenis` dan `jumlah` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String jenis;
private String jumlah;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `SepatuDetail` mewarisi `Sepatu` dengan sintaks `extends`.

```bash
 public class SepatuDetail extends Sepatu {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Sepatu` merupakan overriding method `displayInfo` dan `displayInfo` di `SepatuDetail` juga merupakan overriding dari method `displayInfo` di `Sepatu`.

```bash
public String displayInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("Jenis: ").append(jenis).append("\n");
        sb.append("Jumlah: ").append(jumlah).append("\n");
        return sb.toString();
}

@Override
public String displayInfo() {
      return super.displayInfo() +
      "Deskripsi: " + getDeskripsi() + "\n" +
      "Stok: " + getStok() + "\n" +
      "Harga: Rp. " + String.format("%.2f", getHarga());
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `getDeskripsi`, `getStok`, dan `getHarga` .

```bash
public String getDeskripsi() {
        String jenis = getJenis().toLowerCase();
        switch (jenis) {
            case "running":
                return "Dirancang khusus untuk aktivitas lari, sepatu ini ringan dan memiliki bantalan yang baik untuk menyerap benturan.";
            case "canvas":
                return "Sepatu yang nyaman dan ringan, biasanya terbuat dari kanvas, cocok untuk dipakai sehari-hari atau suasana santai.";
            case "football":
                return "Dirancang khusus untuk sepak bola, sepatu ini memiliki tapak khusus untuk memberikan cengkeraman optimal di lapangan rumput.";
            case "hiking":
                return "Sepatu yang kokoh dan tahan air, dirancang untuk mendaki gunung atau berjalan di alam bebas.";
            default:
                return "Deskripsi tidak tersedia untuk jenis sepatu ini.";
        }
    }

public int getStok() {
        String jenis = getJenis().toLowerCase();
        switch (jenis) {
            case "running":
                return 15;
            case "canvas":
                return 3;
            case "football":
                return 6;
            case "hiking":
                return 2;
            default:
                return 0;
        }
    }

public double getHarga() {
        String jenis = getJenis().toLowerCase();
        switch (jenis) {
            case "running":
                return 500000;
            case "canvas":
                return 300000;
            case "football":
                return 700000;
            case "hiking":
                return 800000;
            default:
                return 0;
        }
    }
```


11. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan jenis sepatu: ");
String jenis = scanner.nextLine();

System.out.print("Masukkan jumlah sepatu: ");
String jumlah = scanner.nextLine();
```


12. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (InputMismatchException e) {
  System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
} catch (StringIndexOutOfBoundsException e){
  System.out.println("Kesalahan format jenis: "+e.getMessage());
} catch(Exception e){
  System.out.println("Kesalahan umum: "+e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    -    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |    -    |
| 14  | Error Handling |   15    |
|     |   **TOTAL**    | **80**  |

## Pembuat

Nama: Siti Nur Alya
NPM: 2210010528
