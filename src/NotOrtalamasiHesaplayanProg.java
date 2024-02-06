import java.util.Scanner;

public class NotOrtalamasiHesaplayanProg {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Matemetik notunuzu girin: ");
		int mat = scanner.nextInt();

		System.out.print("Fizik notunuzu girin: ");
		int fizik = scanner.nextInt();

		System.out.print("Kimya notunuzu girin: ");
		int kimya = scanner.nextInt();

		System.out.print("Türkçe notunuzu girin: ");
		int türkce = scanner.nextInt();

		System.out.print("Tarih notunuzu girin: ");
		int tarih = scanner.nextInt();

		System.out.print("Müzik notunuzu girin: ");
		int muzik = scanner.nextInt();

		int top = mat + fizik + kimya + türkce + tarih + muzik;
		int ort = top / 6;

		System.out.println("Not ortalamnız: " + ort);

		String sonucString = (ort < 60) ? "Sınıfta kaldınız" : "Sınıfı geçtiniz";
		System.out.println(sonucString);
	}

}
