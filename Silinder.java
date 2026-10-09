public class Silinder extends Lingkaran {
    private double tinggi;

    public Silinder(double tinggi, double radius, String warna) {
        super(radius, warna);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double t) {
        this.tinggi = t;
    }

    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }

    @Override
    public void printInfo() {
        System.out.println("Silinder warna " + warna + ", volume = " + hitungVolume());
    }

    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN LATIHAN 1 - 3 ===");
        
        // Pengujian Latihan 1: BujurSangkar
        BujurSangkar bs = new BujurSangkar(4.0, "Merah");
        bs.printInfo();

        // Pengujian Latihan 2: Lingkaran
        Lingkaran lk = new Lingkaran(7.0, "Hijau");
        lk.printInfo();

        // Pengujian Latihan 3: Silinder
        Silinder sil = new Silinder(10.0, 7.0, "Biru");
        sil.printInfo();
    }
}