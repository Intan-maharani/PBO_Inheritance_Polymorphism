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