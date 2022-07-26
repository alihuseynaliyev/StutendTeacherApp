package org.alinazim.main;

import org.alinazim.bean.Config;
import org.alinazim.bean.Student;
import org.alinazim.bean.Teacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ne etmek isteyirsiniz?" +
                "1. Telebe Qeydiyyatdan kecirtmek" +
                "2. Giris etmek" +
                "3. Telebelerin hamisini gostermek" +
                "4. Telebe silmek" +
                "5. Telebe guncellemek" +
                "6.Sistemden cixmaq");

        int operations = sc.nextInt();

        if (operations == 1) {
            sc = new Scanner(System.in);
            System.out.println("Neche telebe qeydiyyatdan kecirmek isteyirsiniz? ");
            int telebeSayi = sc.nextInt();
            for (int i = 0; i < telebeSayi; i++) {
                System.out.println("Adi daxil edin");
                String name = sc.next();

                System.out.println("Soyadi daxil edin");
                String surname = sc.next();

                System.out.println("Yasi daxil edin");
                int age = sc.nextInt();

                System.out.println("Sinifi daxil edin");
                String className = sc.next();

                System.out.println("Muellimini daxil edin");
                Teacher teacher = null;
                Config.studentList.add(new Student(name, surname, age, className, teacher));
            }

        } else if (operations == 2) {

        } else if (operations == 3) {

        } else if (operations == 4) {

        } else if (operations == 5) {

        } else if (operations == 6) {

        }
    }
}
