package DPrototype.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Document implements Cloneable {
    private String title;
    private List<Paragraph> paragraphs;

    public Document() {
        paragraphs = new ArrayList<>();
    }

    public Document(String title, List<Paragraph> paragraphs) {
        this.title = title;
        this.paragraphs = paragraphs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }
    public void addParagraph(String content){
        paragraphs.add(new Paragraph(content));
    }
    public void editParagraph(int index, String newContent){
        if(index >= 0 && index < paragraphs.size()){
            Paragraph paragraph = paragraphs.get(index);
            paragraph.setContent(newContent);
        } else {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " does not exists in the list of paragraphs.");
        }
    }
    public void setParagraphs(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }
    @Override
    public Document clone() throws CloneNotSupportedException {
        Document clonedDocument = (Document)super.clone();
        List<Paragraph> paragraphs = new ArrayList<>(this.paragraphs.size());
        for(var p : this.paragraphs){
            paragraphs.add(p.clone());
        }
        clonedDocument.setParagraphs(paragraphs);
        return clonedDocument;
    }

    public void showParagraphs(){
        for(var p : paragraphs){
            System.out.println(p.toString());
        }
    }
}
