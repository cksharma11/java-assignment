package com.step.polymorphism;

public class Main {

    public static void main(String[] args) {
        Display console = new Console();
        Display webPage = new WebPage();
        Display nonInteractiveWebPage = new NonInteractiveWebPage();

        Fetch webPage1 = new WebPage();
        Fetch nonInteractiveWebPage1 = new NonInteractiveWebPage();
        Fetch pdfPage = new PDFPage();

        console.display();
        webPage.display();
        nonInteractiveWebPage.display();

        System.out.println(webPage1.fetchContent());
        System.out.println(nonInteractiveWebPage1.fetchContent());
        System.out.println(pdfPage.fetchContent());

        ((WebPage) webPage).click();
        ((NonInteractiveWebPage) nonInteractiveWebPage).click();
    }
}
