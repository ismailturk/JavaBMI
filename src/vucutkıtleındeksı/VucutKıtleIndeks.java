package vucutkýtleýndeksý;

import java.util.Scanner;

public class VucutKýtleIndeks {

	public static void main(String[] args) {
		Scanner veri = new Scanner(System.in);
		System.out.println("Lütfen boyunuzu cm cinsinden giriniz: ");
		int boy=veri.nextInt();
		System.out.println("Lütfen kilonuzu kg cinsinden giriniz: ");
		int kilo=veri.nextInt();
		System.out.println("Boyunuz: "+boy+ "cm  "  + "Kilonuz: "+ kilo+"kg" );
		float sonuc=boy/kilo;
		System.out.println("VÜCUT KÝTLE ÝNDEKSÝNÝZ: "+sonuc);
		if(sonuc>=2.5) {
			System.out.println("Zayýfsýnýz");
		}
		else if(sonuc<2.5 && sonuc>=2) {
			System.out.println("Ýdeal kilodasýnýz");
		}
		else {
			System.out.println("Kilonuz fazla ");
		}

	}

}
