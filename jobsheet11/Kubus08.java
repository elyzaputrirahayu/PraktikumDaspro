package jobsheet11;

public class Kubus08 {
    
    public static double hitungVolume(double sisi) {
        return sisi*sisi*sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6*sisi*sisi;
    }

    public static void main(String[] args) {
        double sisi = 5;

        double volume = hitungVolume(sisi);
        double luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("sisi kubus : " + sisi);
        System.out.println("volume kubus :" + volume);
        System.out.println("luas permukaan kubus : " + luasPermukaan);
    }
}
