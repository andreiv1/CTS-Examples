package DPrototype;

import DPrototype.entities.Document;
import DPrototype.entities.Paragraph;
import DPrototype.entities.WordDocument;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Paragraph> paragraphs = new ArrayList<>();
        for(int i = 1; i <= 5; i++){
            paragraphs.add(new Paragraph("This is the paragraph " + i));
        }

        Document doc = new WordDocument("New Word Document", paragraphs);
        Document docClone = doc.clone();

        System.out.println("Original document: ");
        doc.showParagraphs();

        System.out.println();
        System.out.println("Copied document: ");
        docClone.showParagraphs();
        System.out.println("**************************");
        System.out.println("Changing content in copied document...");

        docClone.editParagraph(3, "Edited paragraph 4 only in the clone!");

        System.out.println("Original document: ");
        doc.showParagraphs();

        System.out.println();
        System.out.println("Copied document: ");
        docClone.showParagraphs();


    }
}
