package Questions.FileSystem;

public class File extends FileSystemNode {
    private int size;
    private String content;
    public File(String name, int size){
        super(name);
        this.size = size;

    }

    @Override
    void ls() {
        System.out.println(name );
    }
}
