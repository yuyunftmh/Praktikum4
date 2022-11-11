# Praktikum4
***Nama : Yuyun Fatimah***</br>
***NIM : 312110xxx***</br>
***Kelas : TI.21.xx***</br>
</br>

## UML Class Diagram
Mengimplementasikan UML class diagram menjadi java code : </br>
![uml](https://user-images.githubusercontent.com/94231436/201166750-d9a1a90e-1c5e-4dc5-91cd-50fdd9614726.JPG)
</br>

## Step 1
Membuat file `Main.java`
</br>


## Step 2
Membuat class BangunDatar dengan method luas dan keliling
</br>
```java
class BangunDatar {
  public float luas() {
    return 0;
  }

  public float keliling() {
    return 0;
  }
}
```

## Step 3
Membuat class 3 inheritance yang mewarisi dari class BangunDatar.
- Pertama class `Lingkaran`
  Pada class ini memiliki atribute 1 private yaitu r atau jari-jari, serta memiliki 3 method </br>
  Method yang Pertama adalah method constructor berfungsi untuk setValue dari private </br> 
  Method yang Kedua adalah method luas berfungsi untuk menghitung luas lingkaran </br>
  Method yang Ketiga adalah method keliling berfungsi untuk menghitung keliling lingkaran </br>
  ```java
  class Lingkaran extends BangunDatar {
    private int r;

    public Lingkaran(int r){
      this.r = r;
    }

    public float luas() {
      return (float) 3.14 * r * r;
    }

    public float keliling() {
      return (float) 3.14 * (r * 2);
    }
  }
  ```


- Kedua class `Segitiga`
  Pada class ini memiliki 2 atribute private yaitu alas dan tinggi, serta memiliki 3 method </br>
  Method yang Pertama adalah method constructor berfungsi untuk setValue dari private </br> 
  Method yang Kedua adalah method luas berfungsi untuk menghitung luas segitiga </br>
  Method yang Ketiga adalah method keliling berfungsi untuk menghitung keliling segitiga </br>
  ```java
  class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi){
      this.alas = alas;
      this.tinggi = tinggi;
    }

    public float luas() {
      return (float) 0.5 * alas * tinggi;
    }

    public float keliling() {
      return (float) alas * 3;
    }
  }
  ```
  
  
  
- Ketiga class `Persegi`
  Pada class ini memiliki 1 atribute private yaitu sisi, serta memiliki 3 method </br>
  Method yang Pertama adalah method constructor berfungsi untuk setValue dari private </br> 
  Method yang Kedua adalah method luas berfungsi untuk menghitung luas persegi </br>
  Method yang Ketiga adalah method keliling berfungsi untuk menghitung keliling persegi </br>
  ```java
  class Persegi extends BangunDatar {
    private int sisi;

    public Persegi(int sisi){
      this.sisi = sisi;
    }

    public float luas() {
      return (float) sisi * sisi;
    }

    public float keliling(){
      return (float) sisi * 4;
    }
  }
  ```


## Step 4
Membuat class utama dengan nama class `Main` serta membuat method main program 
saya membuat tambahan variable int r, alas, tinggi, dan sisi yang mana valuenya akan di set pada masing-masing class yang membutuhkan properti. Saya juga membuat 3 object yaitu gambar1, gambar2, gambar3 yang berurutan pada saat saya mendefinisikan object class baru. Lalu saya juga membuat output Screen pada masing-masing objectnya yaitu hasil perhitungan luas dan keliling.
```java
public class Main {

  public static void main(String[] args) {
    int r = 8;
    Lingkaran gambar1 = new Lingkaran(r);
    System.out.println("\n==== Lingkaran ====");
    System.out.println("Luas Lingkaran = "+gambar1.luas());
    System.out.println("Keliling Lingkaran = "+gambar1.keliling());

    int alas = 10;
    int tinggi = 13;
    Segitiga gambar2 = new Segitiga(alas,tinggi);
    System.out.println("\n==== Segitiga ====");
    System.out.println("Luas Segitiga = "+gambar2.luas());
    System.out.println("Keliling Segitiga = "+gambar2.keliling());

    int sisi = 5;
    Persegi gambar3 = new Persegi(sisi);
    System.out.println("\n==== Persegi ====");
    System.out.println("Luas Persegi = "+gambar3.luas());
    System.out.println("Keliling Persegi = "+gambar3.keliling());
  }
}
```

## Output Program
![uml](https://raw.githubusercontent.com/Akbaroke/joki-java/main/outputProgram.JPG?token=GHSAT0AAAAAAB25V73HJ43573UWDROZCED2Y3NIBJA)




