package hesapmk;

import java.util.Scanner;

public class Hesap {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		String islemler="1.toplama ��lemi\n"
				       +"2.��karma ��lemi\n"
				       +"3.B�lme ��lemi\n"
				       +"4.�arpma ��lemi";
		System.out.println(islemler);
		System.out.println("�slem se�iniz:");
		String islem= input.nextLine();
		int birinci_Sayi;
		int ikinci_Sayi;
		
		switch(islem) {
		case "1":
			System.out.println("Birinci say�y� giriniz:\n");
			 birinci_Sayi=input.nextInt();
			
			System.out.println("�kinci say�y� giriniz:");
			 ikinci_Sayi=input.nextInt();
			System.out.println("Toplama: 2"+(birinci_Sayi+ikinci_Sayi));
			break;
		case "2":
			System.out.println("Birinci say�y� giriniz:\n");
			 birinci_Sayi=input.nextInt();
			
			System.out.println("�kinci say�y� giriniz:");
			 ikinci_Sayi=input.nextInt();
			System.out.println("Fark: "+(birinci_Sayi-ikinci_Sayi));
		case "3":
			System.out.println("Birinci say�y� giriniz:\n");
			 birinci_Sayi=input.nextInt();
			
			System.out.println("�kinci say�y� giriniz:");
			 ikinci_Sayi=input.nextInt();
			System.out.println("B�l�m: "+(birinci_Sayi/ikinci_Sayi));
		case "4":
			System.out.println("Birinci say�y� giriniz:\n");
			 birinci_Sayi=input.nextInt();
			
			System.out.println("�kinci say�y� giriniz:");
			 ikinci_Sayi=input.nextInt();
			System.out.println("�arp�m "+(birinci_Sayi*ikinci_Sayi));
					
			
					
		
		}

		
		
		
		
		
		
		
	}

}
