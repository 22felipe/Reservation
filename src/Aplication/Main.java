package Aplication;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int room =  sc.nextInt();


        /*
        System.out.print("Check-in data (dd/MM/yyyy: ");
        Date checkin = sdf.parse(sc.next());

        System.out.print("Check-out data (dd/MM/yyyy: ");
        Date checkout =  sdf.parse(sc.next());*/




        sc.close();
    }
}