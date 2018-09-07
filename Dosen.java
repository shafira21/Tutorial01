public class Dosen{
    public Dosen (String nama, int nidn,){
        this.nama=nama;
        this.nidn=nidn;
    
    }

    public String getNama(){
        return nama;
    }

    public int getnidn(){
        return nidn;
    }

    public String setNama(nama){
        this.nama=nama;
    }

    public int setnidn(int nidn){
        this.nidn = nidn;
    }
}