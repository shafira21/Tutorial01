public class Mahasiswa{
    public Mahasiswa (String nama, int npm,){
        this.nama=nama;
        this.npm=npm;
    
    }

    public String getNama(){
        return nama;
    }

    public int getNpm(){
        return npm;
    }

    public String setNama(nama){
        this.nama=nama;
    }

    public int setNpm(int npm){
        this.npm = npm;
    }
}