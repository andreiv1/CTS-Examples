package DPrototype.entities;

import DPrototype.enums.TextDecorationType;

public class Paragraph implements Cloneable {
    private String content;
    private TextDecorationType textDecorationType;
    public Paragraph(String content) {
        this.content = content;
        textDecorationType = TextDecorationType.NORMAL;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public TextDecorationType getTextDecorationType() {
        return textDecorationType;
    }

    public void setTextDecorationType(TextDecorationType textDecorationType) {
        this.textDecorationType = textDecorationType;
    }

    @Override
    public Paragraph clone() throws CloneNotSupportedException {
        Paragraph clonedParagraph = (Paragraph) super.clone();
        clonedParagraph.content = new String(this.content);
        return clonedParagraph;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "content='" + content + '\'' +
                ", textDecorationType=" + textDecorationType +
                '}';
    }
}
