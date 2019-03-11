package com.step.polymorphism;

public class PDFPage implements Fetch {
    private String content = "This is jsu dummy content";

    @Override
    public String fetchContent() {
        return this.content;
    }
}
