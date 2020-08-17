package com.DesignPatterns.Momento.Exercise;

public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public DocumentState createState() {
        return new DocumentState(content, fontName, fontSize);
    }

    public void restore(DocumentState state) {
        content = state.getContent();
        fontSize = state.getFontSize();
        fontName = state.getFontName();
    }

    @Override
    public String toString() {
        return "Document = " + "content : " + content + ", fontName : " + fontName + ", fontSize : " + fontSize;
    }
}
