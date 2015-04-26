/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.structual.composite;

import java.util.ArrayList;

/**
 *
 */
public class Directory implements FileSystemElement {

    private final String name;
    private final ArrayList<FileSystemElement> composites;

    public Directory(String name) {
        this.name = name;
        this.composites = new ArrayList<FileSystemElement>();
    }

    public void addFileSystemElement(FileSystemElement... fileSystemElements) {
        for (FileSystemElement fileSystemElement : fileSystemElements) {
            composites.add(fileSystemElement);
        }
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
        stringBuilder.append(name.toUpperCase());
        System.out.println(stringBuilder.toString());
        int valueOfIdentation = identation + 1;
        for (FileSystemElement fileSystemElement : composites) {
            fileSystemElement.presentName(valueOfIdentation);
        }
    }
}
