package pl.designpatterns.behavioural.memento;

import java.util.EnumMap;
import java.util.Map;

public class Document implements DocumentOriginator {

    private final Map<DocumentPart, StringBuilder> contentMap;

    public Document() {
        this.contentMap = constructContentMap();
    }

    public void writeHeader(String content) {
        contentMap.get(DocumentPart.HEADER).append(content);
    }

    public void writeContent(String content) {
        contentMap.get(DocumentPart.CONTENT).append(content);
    }

    public void writeFooter(String content) {
        contentMap.get(DocumentPart.FOOTER).append(content);
    }

    public void print() {
        System.out.println(prepareDocument());
    }

    public void clearContent() {
        contentMap.put(DocumentPart.CONTENT, new StringBuilder());
    }

    @Override
    public DocumentMemento saveMemento() {
        return new DocumentMemento(
                contentMap.get(DocumentPart.HEADER).toString(),
                contentMap.get(DocumentPart.CONTENT).toString(),
                contentMap.get(DocumentPart.FOOTER).toString());
    }

    @Override
    public void restoreState(DocumentMemento documentMemento) {
        contentMap.put(DocumentPart.HEADER, new StringBuilder(documentMemento.getHeader()));
        contentMap.put(DocumentPart.CONTENT, new StringBuilder(documentMemento.getContent()));
        contentMap.put(DocumentPart.FOOTER, new StringBuilder(documentMemento.getFooter()));
    }

    private EnumMap<DocumentPart, StringBuilder> constructContentMap() {
        EnumMap<DocumentPart, StringBuilder> map =
                new EnumMap<DocumentPart, StringBuilder>(DocumentPart.class);
        map.put(DocumentPart.HEADER, new StringBuilder());
        map.put(DocumentPart.FOOTER, new StringBuilder());
        map.put(DocumentPart.CONTENT, new StringBuilder());
        return map;
    }

    private String prepareDocument() {
        StringBuilder documentBuilder = new StringBuilder();
        documentBuilder.append(contentMap.get(DocumentPart.HEADER));
        final StringBuilder content = contentMap.get(DocumentPart.CONTENT);
        if (content.length() > 0) {
            documentBuilder.append("\n\n");
        }
        documentBuilder.append(content);
        final StringBuilder footer = contentMap.get(DocumentPart.FOOTER);
        if (footer.length() > 0) {
            documentBuilder.append("\n\n");
        }
        documentBuilder.append(footer);
        return documentBuilder.toString();
    }

    private static enum DocumentPart {
        HEADER, CONTENT, FOOTER
    }
}
