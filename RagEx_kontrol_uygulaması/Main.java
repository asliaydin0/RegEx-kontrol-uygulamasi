package RagEx_kontrol_uygulaması;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Regex tanımları
        String plakaRegex = "^[0-9]{2}\\s?[A-Z]{1,3}\\s?[0-9]{2,4}$";  // Türk plaka formatlarını doğrular
        String urlRegex = "^https?:\\/\\/(www\\.)?[\\w\\-]+\\.[a-z]{2,6}(\\/.*)?$";  // URL adreslerini doğrular
        String isbnRegex = "^(97(8|9))?\\d{1,5}[- ]?\\d{2,7}[- ]?\\d{1,6}[- ]?\\d{1}$";  // ISBN formatlarını doğrular

        try {
        	
            // Plaka Numarası
            System.out.print("Plaka numarasını giriniz: ");
            String plaka = scanner.nextLine();
            if (RegEx.kontrol(plaka, plakaRegex)) {
                System.out.println("Plaka numarası geçerli.");
            } 
            else {
                System.out.println("Geçersiz plaka numarası!");
            }
            
            // URL
            System.out.print("URL adresini giriniz: ");
            String url = scanner.nextLine();
            if (RegEx.kontrol(url, urlRegex)) {
                System.out.println("URL geçerli.");
            } 
            else {
                System.out.println("Geçersiz URL!");
            }
            
            // ISBN
            System.out.print("ISBN numarasını giriniz: ");
            String isbn = scanner.nextLine();
            if (RegEx.kontrol(isbn, isbnRegex)) {
                System.out.println("ISBN numarası geçerli.");
            }
            else {
                System.out.println("Geçersiz ISBN numarası!");
            }

        } catch (Exception e) {  // Hata durumunda çalışacak blok
            System.out.println("Hata var: " + e.getMessage());
        } finally {
            scanner.close();  // Kaynak kapatma
        }
    }
}

	


