package com.company;
import com.company.momentoExercise.Document;
import com.company.momentoExercise.History;

public class Main {

    public static void main(String[] args) {

        Document document = new Document();
        com.company.momentoExercise.History history = new History();

        document.setContent("Hello");
        history.push(document.createState());

        document.setFontName("Font 1");
        history.push(document.createState());

        document.setFontSize(10);

        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);

    }
}
