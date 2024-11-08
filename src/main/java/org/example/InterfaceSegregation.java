package org.example;

public class InterfaceSegregation {
    public static void main(String[] args) {

    }
}

interface ITextPrinter {
    void printText(String text);
}

interface IImagePrinter {
    void printImage(byte[] image);
}

interface ITablePrinter {
    void printTable(String[][] table);
}

interface IPdfPrinter {
    void printPdf();
}



class PdfPrinter implements IPdfPrinter {
    @Override
    public void printPdf() {

    }
}

class TextPrinter implements ITextPrinter {
    @Override
    public void printText(String text) {
        // ... логика печати текста ...
    }
}

class ImagePrinter implements IImagePrinter {

    @Override
    public void printImage(byte[] imageData) {
        // ... логика печати изображения ...
    }


}

class TablePrinter implements ITablePrinter {
    @Override
    public void printTable(String[][] tableData) {
        // ... логика печати таблицы ...
    }
}

class TextImagePrinter implements ITextPrinter, IImagePrinter {
    @Override
    public void printText(String text) {

    }

    @Override
    public void printImage(byte[] image) {

    }
}
