public class faktur implements hitungTotalBayar {
    private String nomorFaktur;
    private String namaPelanggan;
    private String nomorHp;
    private String namaBarang;
    private Integer hargaBarang;
    private Integer jumlahBeli;

    public faktur(String nomorFaktur, String namaPelanggan, String nomorHp, String namaBarang, Integer hargaBarang, Integer jumlahBeli) {
        this.nomorFaktur = nomorFaktur;
        this.namaPelanggan = namaPelanggan;
        this.nomorHp = nomorHp;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBeli = jumlahBeli;
    }

    public String getNomorFaktur() {
        return nomorFaktur;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getNomorHp() {
        return nomorHp;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public Integer getHargaBarang() {
        return hargaBarang;
    }

    public Integer getJumlahBeli() {
        return jumlahBeli;
    }

    public void tampilkanDetailFaktur() {
        System.out.println("\n--- Faktur ---");
        System.out.println("Nomor Faktur: " + nomorFaktur);
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Nomor HP: " + nomorHp);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + hargaBarang);
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total Bayar: " + hitungTotalBayar(hargaBarang, jumlahBeli));
    }

    @Override
    public Integer hitungTotalBayar(Integer harga, Integer jumlah) {
        throw new UnsupportedOperationException("Unimplemented method 'hitungTotalBayar'");
    }
}
