package DesignPatterns.CompositeDesignPattern.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    String name;
    List<FileSystem> fileSystems;

    public Directory(String name) {
        this.name = name;
        this.fileSystems = new ArrayList<>();
    }

    public void add(FileSystem fileSystem) {
        this.fileSystems.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory Name " + name);
        for(FileSystem file: fileSystems) {
            file.ls();
        }
    }
}
