package Questions.FileSystem;


public class FileSystem {
    private Directory root;

    public FileSystem() {
        root = new Directory("root");
    }

    public Directory getRoot() {
        return root;
    }

    public void ls(Directory dir) {
        dir.ls();
    }
}

