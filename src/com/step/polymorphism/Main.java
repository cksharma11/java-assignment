package com.step.polymorphism;

public class Main {

    public static void main(String[] args) {
        Displayable console = new Console();
        Displayable webPage = new WebPage();
        Displayable nonInteractiveWebPage = new NonInteractiveWebPage();

        Renderable webPage1 = new WebPage();
        Renderable nonInteractiveWebPage1 = new NonInteractiveWebPage();
        Renderable pdfPage = new PDFPage();

        console.display();
        webPage.display();
        nonInteractiveWebPage.display();

        System.out.println(webPage1.render());
        System.out.println(nonInteractiveWebPage1.render());
        System.out.println(pdfPage.render());

        ((WebPage) webPage).click();
        ((NonInteractiveWebPage) nonInteractiveWebPage).click();
    }
}
