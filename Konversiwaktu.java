/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*NIM           : 13020200123
 *NAMA          : NURAZISAH AHMAD
 *HARI/TANGGAL  : Selasa/22-Maret-2022
 */

import java.util.Scanner;

public class Konversiwaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int totalDetik, detikSekarang, totalMenit, menitSekarang, totalJam, jamSekarang;
        
        System.out.print("Berapa totalDetik yang ingin anda konversikan : ");
        totalDetik = input.nextInt();
        
        detikSekarang   = totalDetik%60;
        totalMenit      = totalDetik/60;
        menitSekarang   = totalMenit%60;
        totalJam        = totalMenit/60;
        jamSekarang     = totalJam%24;
        
        System.out.println("totalDetik dari : "+totalDetik+" detikSekarang, Adalah : ");
        System.out.println(totalJam+" jamSekarang, ");
        System.out.println(+totalMenit+" menitSekarang, ");
        System.out.println(+totalDetik+" detikSekarang");
    }
}