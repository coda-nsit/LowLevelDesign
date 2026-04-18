package Questions.FileSystem;

abstract class FileSystemNode {
    protected String name;
    protected Directory parent;
    protected long createdAt;

    public FileSystemNode(String name) {
        this.name = name;
        this.createdAt = System.currentTimeMillis();
    }

    abstract void ls();

}
