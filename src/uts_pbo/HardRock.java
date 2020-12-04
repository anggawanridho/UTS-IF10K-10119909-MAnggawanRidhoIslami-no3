package uts_pbo;

/**
 * @author NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class HardRock extends Rnb implements PopRock, ProgressiveRock, PsychedellicRock {
    public void genreHardRock(String artistName){
        System.out.println(artistName + " adalah musisi HardRock");
    }

    public void genrePopRock(String artistName){
        System.out.println(artistName + " adalah musisi PopRock");
    }

    public void genrePsycehedellic(String artistName){
        System.out.println(artistName + " adalah musisi Psycehedellic");
    }

    public void genreProgressiveRock(String artistName){
        System.out.println(artistName + " adalah musisi ProgressiveRock");
    }
}
