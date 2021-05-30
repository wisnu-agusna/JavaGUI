public class Mahasiswa {
    private String nama;
    private String nim;

    public void setNim(String nim) {

        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama(){ return this.nama; }
    public String getNim(){
        return this.nim;
    }

    //Jenjang pendidikan
    public String jenjangPendidikan(){

        char kodeJenjang = nim.charAt(0);

        if(kodeJenjang == '1'){
            return "S1(Sarjana)";
        }else if(kodeJenjang == '2'){
            return "S2(Megister)";
        }else if(kodeJenjang == '3'){
            return  "S3(Doktoral)";
        }else {
            return "Tidak Diketahui";
        }

    }

    //tahun masuk
    public String Angkatan(){

        char kodeTahun1 = nim.charAt(1);
        char kodeTahun2 = nim.charAt(2);

        return "20" + kodeTahun1 + kodeTahun2;

    }

    //Fakultas
    public String Fakultas(){

        char kodeFakultas = nim.charAt(3);

        if (kodeFakultas == '1') {
            return "Tarbiyah dan Keguruan";
        } else if (kodeFakultas == '2') {
            return "Syariah dan Hukum";
        } else if (kodeFakultas == '3') {
            return "Ushuluddin";
        } else if (kodeFakultas == '4') {
            return "Dakwah & Komunikasi";
        } else if (kodeFakultas == '5') {
            return "Sains dan Teknologi";
        } else if (kodeFakultas == '6') {
            return "Psikologi";
        } else if (kodeFakultas == '7') {
            return "Ekonomi dan Ilmu Sosial";
        } else if (kodeFakultas == '8') {
            return "Pertanian dan Peternakan";
        }
        return "Unknown";
    }

    //Prodi
    public String jurusan(){

        char kodeProdi1 = nim.charAt(4);
        char kodeProdi2 = nim.charAt(5);

        String kodeProdi = "" + kodeProdi1 +kodeProdi2;
        if (nim.equals("01")) {
            return "Teknik Informatika";
        } else if (nim.equals("02")) {
            return "Teknik Industri";
        } else if (nim.equals("03")) {
            return "Sistem Informasi";
        } else if (nim.equals("04")) {
            return " Matematika";
        } else if (nim.equals("05")) {
            return "Teknik Elektro";
        }
        return "Unknown";
    }

    //Jenis Kelamin
    public String jenisKelamin(){

        char kodeJk = nim.charAt(6);

        if(kodeJk == '1'){
            return "LAKI-LAKI";
        }else if(kodeJk == '2'){
            return "PEREMPUAN";
        }
        return "Tidak Diketahui";
    }

    //Nomor Mahasiswa
    public String nomorMahasiswa(){

        char kodeNoMhs1= nim.charAt(7);
        char kodeNoMhs2 = nim.charAt(8);
        char kodeNoMhs3 = nim.charAt(9);
        char kodeNoMhs4 = nim.charAt(10);

        return "" + kodeNoMhs1 + kodeNoMhs2 + kodeNoMhs3 + kodeNoMhs4;

    }

    @Override
    public String toString() {
        return " Nama = " + nama + "\n" +
                ", NIM = " + nim + "\n" +
                ", Jenjang Pendidikan = " + jenjangPendidikan() + "\n" +
                ", Angkatan = " + Angkatan() + "\n" +
                ", Fakultas = " + Fakultas() + "\n" +
                ", Jurusan = " + jurusan() + "\n" +
                ", Jenis Kelamin = " + jenisKelamin()+ "\n" +
                ", Nomor Mahasiswa = " + nomorMahasiswa() + "\n" +
                '}';
    }
}