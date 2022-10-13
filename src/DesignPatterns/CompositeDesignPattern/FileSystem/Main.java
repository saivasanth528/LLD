package DesignPatterns.CompositeDesignPattern.FileSystem;

public class Main {
    public static void main(String args[]) {
        Directory movieDirectory = new Directory("Movies");
        Directory comedy = new Directory("Comedy");
        Directory horror = new Directory("horror");
        File jaathiratnalu = new File("Jaathiratnalu");
        comedy.add(jaathiratnalu);
        File adavi = new File("Adavi");
        horror.add(adavi);

        movieDirectory.add(comedy);
        movieDirectory.add(horror);
        movieDirectory.ls();

    }
}
