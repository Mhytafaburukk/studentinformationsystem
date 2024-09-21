import java.util.ArrayList;
import java.util.Scanner;

public class studentmanagementsystm {
    void ogrenciekle(student stu) {
        System.out.println("Öğrenci başarıyla eklendi!");
        System.out.println("Öğrenci isim: " + stu.name);
        System.out.println("Öğrenci mail: " + stu.mail);
        System.out.println("Öğrenci id: " + stu.id);
    }

    void ogrencileriListele(ArrayList<student> students) {
        if (students.isEmpty()) {
            System.out.println("Listelenecek öğrenci yok.");
        } else {
            for (student stu : students) {
                System.out.println("Öğrenci isim: " + stu.name + ", Mail: " + stu.mail + ", ID: " + stu.id);
            }
        }
    }

    void ogrenciGuncelle(ArrayList<student> students, int id) {
        for (student stu : students) {
            if (stu.id == id) {
                Scanner sca = new Scanner(System.in);

                System.out.println("Yeni isim:");
                stu.name = sca.nextLine();

                System.out.println("Yeni mail:");
                stu.mail = sca.nextLine();

                System.out.println("Öğrenci başarıyla güncellendi.");
                return;
            }
        }
        System.out.println("Öğrenci bulunamadı.");
    }

    void ogrenciSil(ArrayList<student> students, int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                students.remove(i);
                System.out.println("Öğrenci başarıyla silindi.");
                return;
            }
        }
        System.out.println("Öğrenci bulunamadı.");
    }
}

