package org.example.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class localdate {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        DateTimeFormatter formatadorComBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatadorComTraco = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data com barra: " + hoje.format(formatadorComBarra));
        System.out.println("Data com traco: " + hoje.format(formatadorComTraco));
    }
}
