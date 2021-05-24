public class Mahasiswa {
      private String nama;
      private String nim;
      private String JenjangPendidikan;
      private String Angkatan;
      private String Fakultas;
      private String Jurusan;
      private String JenisKelamin;
      private String NomorMahasiswa;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim, String jenjangPendidikan,
                     String angkatan, String fakultas, String jurusan,
                     String jenisKelamin, String nomorMahasiswa) {
        this.nama = nama;
        this.nim = nim;
        JenjangPendidikan = jenjangPendidikan;
        Angkatan = angkatan;
        Fakultas = fakultas;
        Jurusan = jurusan;
        JenisKelamin = jenisKelamin;
        NomorMahasiswa = nomorMahasiswa;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenjangPendidikan() {
        return JenjangPendidikan;
    }

    public void setJenjangPendidikan(String jenjangPendidikan) {
        JenjangPendidikan = jenjangPendidikan;
    }

    public String getAngkatan() {
        return Angkatan;
    }

    public void setAngkatan(String angkatan) {
        Angkatan = angkatan;
    }

    public String getFakultas() {
        return Fakultas;
    }

    public void setFakultas(String fakultas) {
        Fakultas = fakultas;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String jurusan) {
        Jurusan = jurusan;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        JenisKelamin = jenisKelamin;
    }

    public String getNomorMahasiswa() {
        return NomorMahasiswa;
    }

    public void setNomorMahasiswa(String nomorMahasiswa) {
        NomorMahasiswa = nomorMahasiswa;
    }

    @Override
    public String toString() {
        return "Mahasiswa { " + "\n" +
                " nama = " + nama + "\n" +
                " nim = " + nim + "\n" +
                " Jenjang Pendidikan = " + JenjangPendidikan + "\n" +
                " Angkatan = " + Angkatan + "\n" +
                " Fakultas = " + Fakultas + "\n" +
                " Jurusan = " + Jurusan + "\n" +
                " Jenis Kelamin = " + JenisKelamin + "\n" +
                " Nomor Mahasiswa = " + NomorMahasiswa + "\n" +
                '}';
    }
}