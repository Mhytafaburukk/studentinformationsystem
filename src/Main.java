import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int y = 0;
        Scanner sca = new Scanner(System.in);
        studentmanagementsystm management = new studentmanagementsystm();
        ArrayList<student> students = new ArrayList<>();
        boolean devam = true;

        while (devam) {
            System.out.println("İşlem tipini seçiniz: 1-Öğrenci ekle 2-Öğrencileri listele 3-Öğrenci güncelle 4-Öğrenci sil 5-Çıkış");
            int secim = sca.nextInt();
            sca.nextLine();

            if (secim == 1) {

                student stu = new student();

                System.out.println("Öğrenci adı:");
                stu.name = sca.nextLine();

                System.out.println("Öğrenci maili:");
                stu.mail = sca.nextLine();

                System.out.println("Öğrenci id:");
                stu.id = sca.nextInt();
                sca.nextLine();

                students.add(stu);
                management.ogrenciekle(stu);
                y++;

            } else if (secim == 2) {

                management.ogrencileriListele(students);

            } else if (secim == 3) {

                System.out.println("Güncellemek istediğiniz öğrencinin ID'sini giriniz:");
                int id = sca.nextInt();
                management.ogrenciGuncelle(students, id);

            } else if (secim == 4) {

                System.out.println("Silmek istediğiniz öğrencinin ID'sini giriniz:");
                int id = sca.nextInt();
                management.ogrenciSil(students, id);

            } else if (secim == 5) {

                devam = false;
                System.out.println("Çıkış yapılıyor...");
            } else {
                System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }
    }
}





