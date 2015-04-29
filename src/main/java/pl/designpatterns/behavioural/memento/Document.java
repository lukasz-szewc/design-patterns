package pl.designpatterns.behavioural.memento;

import java.util.EnumMap;
import java.util.Map;

/**
 *
 */
public class Document implements DocumentOriginator {

    private final Map<DocumentPart, StringBuilder> contentMap;

    public Document() {
        this.contentMap = constructContentMap();
    }

    public void writeInto(DocumentPart documentPart, String content) {
        contentMap.get(documentPart).append(content);
    }

    public void clear(DocumentPart documentPart) {
        contentMap.put(documentPart, new StringBuilder());
    }

    public void printContent() {
        System.out.println(prepareContent());
    }

    public String getContent() {
        return prepareContent();
    }

    private EnumMap<DocumentPart, StringBuilder> constructContentMap() {
        EnumMap<DocumentPart, StringBuilder> map =
                new EnumMap<DocumentPart, StringBuilder>(DocumentPart.class);
        map.put(DocumentPart.HEADER, new StringBuilder());
        map.put(DocumentPart.FOOTER, new StringBuilder());
        map.put(DocumentPart.CONTENT, new StringBuilder());
        return map;
    }

    private String prepareContent() {
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

    @Override
    public DocumentMemento saveMemento() {
        DocumentMemento documentMemento = new DocumentMemento(
                contentMap.get(DocumentPart.HEADER).toString(),
                contentMap.get(DocumentPart.CONTENT).toString(),
                contentMap.get(DocumentPart.FOOTER).toString());
        return documentMemento;
    }

    @Override
    public void restoreState(DocumentMemento documentMemento) {
        contentMap.put(DocumentPart.HEADER, new StringBuilder(documentMemento.getHeader()));
        contentMap.put(DocumentPart.CONTENT, new StringBuilder(documentMemento.getContent()));
        contentMap.put(DocumentPart.FOOTER, new StringBuilder(documentMemento.getFooter()));
    }
}
