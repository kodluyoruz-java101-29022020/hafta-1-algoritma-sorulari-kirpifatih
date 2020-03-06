package soru6;

public class Printer {
	
    public static void printPDFDocument(){
        PDFDocument pdfDocument = new PDFDocument("PDF Document");
        System.out.println(pdfDocument.getBody());
    }
    public static void printWordDocument(){
        WordDocument wordDocument = new WordDocument("Word Document");
        System.out.println(wordDocument.getBody());
    }

    public static void main(String[] args) {

        printPDFDocument();
        printWordDocument();


    }
}
