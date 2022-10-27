package hesapmk;

import java.util.Scanner;

public class Hesap {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		String islemler="1.toplama Ýþlemi\n"
				       +"2.Çýkarma Ýþlemi\n"
				       +"3.Bölme Ýþlemi\n"
				       +"4.Çarpma Ýþlemi";
		System.out.println(islemler);
		System.out.println("Ýslem seçiniz:");
		String islem= input.nextLine();
		int birinci_Sayi;
		int ikinci_Sayi;
		
		switch(islem) {
		case "1":
			System.out.println("Birinci sayýyý giriniz:\n");
			 birinci_Sayi=input.nextInt();
			
			System.out.println("Ýkinci sayýyý giriniz:");
			 ikinci_Sayi=input.nextInt();
			System.out.println("Toplama: 2"+(birinci_Sayi+ikinci_Sayi));
			break;
		case "2":
			System.out.println("Birinci sayýyý giriniz:\n");
			 birinci_Sayi=input.nextInt();
			
			System.out.println("Ýkinci sayýyý giriniz:");
			 ikinci_Sayi=input.nextInt();
			System.out.println("Fark: "+(birinci_Sayi-ikinci_Sayi));
		case "3":
			System.out.println("Birinci sayýyý giriniz:\n");
			 birinci_Sayi=input.nextInt();
			
			System.out.println("Ýkinci sayýyý giriniz:");
			 ikinci_Sayi=input.nextInt();
			System.out.println("Bölüm: "+(birinci_Sayi/ikinci_Sayi));
		case "4":
			System.out.println("Birinci sayýyý giriniz:\n");
			 birinci_Sayi=input.nextInt();
			
			System.out.println("Ýkinci sayýyý giriniz:");
			 ikinci_Sayi=input.nextInt();
			System.out.println("Çarpým "+(birinci_Sayi*ikinci_Sayi));
					
			
					
		
		}

		
		
		
		
		
		
		
	}

}
