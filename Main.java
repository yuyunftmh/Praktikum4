class BangunDatar {
  public float luas() {
    return 0;
  }

  public float keliling() {
    return 0;
  }
}

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