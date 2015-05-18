package pl.designpatterns.structual.composite;

public class File implements FileSystemElement {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String getOwnStringRepresentation() {
        return name;
    }

    @Override
    public void presentName(int identation) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < identation; i++) {
            stringBuilder.append(" ");

        }
        stringBuilder.append(name);
        System.out.println(stringBuilder.toString());
    }

}
