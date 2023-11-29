public class fakturOnline extends faktur {
    private String metodePembayaran;

    public fakturOnline(String nomorFaktur, String namaPelanggan, String nomorHp, String namaBarang, Integer hargaBarang, int jumlahBeli, String metodePembayaran) {
        super(nomorFaktur, namaPelanggan, nomorHp, namaBarang, hargaBarang, jumlahBeli);
        this.metodePembayaran = metodePembayaran;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }
    // Implementasi metode hitungTotalBayar dari interface
    @Override
    public Integer hitungTotalBayar(Integer harga, Integer jumlah) {
        return harga * jumlah;
    }

    // Metode untuk menampilkan detail faktur online
    public void tampilkanDetailFakturOnline() {
        tampilkanDetailFaktur();
        System.out.println("Metode Pembayaran: " + metodePembayaran);
    }
}
