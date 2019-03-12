package com.step.polymorphism;

public class PDFPage implements Renderable {
    private String content = "This is jsu dummy content";

    @Override
    public String render() {
        return this.content;
    }
}
