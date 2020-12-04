package uts_pbo;

/**
 * @author NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Metal implements HeavyMetal  {
    public void genreMetal(String artistName){
        System.out.println(artistName + " adalah musisi Metal");
    }

    @Override
    public void genreHeavyMetal(String artistName) {
        System.out.println(artistName + " adalah musisi HeavyMetal");
    }

    @Override
    public void genrePunk(String artistName) {
        System.out.println(artistName + " adalah musisi Punk");
    }

    public void genreGrunge(String artistName){
        System.out.println(artistName + " adalah musisi Grunge");
    }
}
