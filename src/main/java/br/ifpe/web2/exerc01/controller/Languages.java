package br.ifpe.web2.exerc01.controller;

public enum Languages {

    PORTUGUESE("Povo de informática"),
    FRENCH("les gens de l'informatique"),
    ENGLISH("People of informatics"),
    GERMAN("Leute der Informatik"),
    SPANISH("Gente de informatica"),
    ITALIAN("Gente di informatica"),
    FINNISH("Informatiikan ihmiset");

    private String text;

    Languages(String text) {
        this.text = text;
    }

    public String getTexto() {
        return text;
    }
}
