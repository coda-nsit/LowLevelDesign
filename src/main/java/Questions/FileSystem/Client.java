package Questions.FileSystem;

public class Client {

    public static void main(String[] args) {
        FileSystem fs = new FileSystem();

        Directory root = fs.getRoot();

        Directory docs = new Directory("Documents");
        File file1 = new File("resume.pdf", 100);

        root.add(docs);
        docs.add(file1);

        fs.ls(root);       // Documents
        fs.ls(docs);       // resume.pdf
    }
}
