package DPrototype.entities;

import java.util.List;

public class WordDocument extends Document {
    public WordDocument(String title, List<Paragraph> paragraphs) {
        super(title, paragraphs);
    }

    @Override
    public WordDocument clone() throws CloneNotSupportedException {
        return (WordDocument)super.clone();
    }
}
