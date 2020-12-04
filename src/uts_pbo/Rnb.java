package uts_pbo;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Rnb extends MusicGenre implements Blues, Jazz {
    public void genreJazz(String artistName){
        System.out.println(artistName + " adalah musisi Jazz");
    }

    public void genreBlues(String artistName){
        System.out.println(artistName + " adalah musisi Blues");
    }
}
