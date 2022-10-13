package DesignPatterns.CompositeDesignPattern.FileSystem;

public class File implements FileSystem{
    private String fileName;

    public File(String name) {
        this.fileName = name;
    }

    @Override
    public void ls() {
        System.out.println("FileName " + fileName);
    }
}
