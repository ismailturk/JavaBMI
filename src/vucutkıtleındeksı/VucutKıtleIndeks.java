package vucutk�tle�ndeks�;

import java.util.Scanner;

public class VucutK�tleIndeks {

	public static void main(String[] args) {
		Scanner veri = new Scanner(System.in);
		System.out.println("L�tfen boyunuzu cm cinsinden giriniz: ");
		int boy=veri.nextInt();
		System.out.println("L�tfen kilonuzu kg cinsinden giriniz: ");
		int kilo=veri.nextInt();
		System.out.println("Boyunuz: "+boy+ "cm  "  + "Kilonuz: "+ kilo+"kg" );
		float sonuc=boy/kilo;
		System.out.println("V�CUT K�TLE �NDEKS�N�Z: "+sonuc);
		if(sonuc>=2.5) {
			System.out.println("Zay�fs�n�z");
		}
		else if(sonuc<2.5 && sonuc>=2) {
			System.out.println("�deal kilodas�n�z");
		}
		else {
			System.out.println("Kilonuz fazla ");
		}

	}

}
