package Questions.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemNode{

    private List<FileSystemNode> children;

    public Directory(String name){
        super(name);
        this.children = new ArrayList<FileSystemNode>();
    }

    public void add(FileSystemNode child){
        child.parent = this;
        this.children.add(child);
    }
    public List<FileSystemNode> getChildren(){
        return this.children;
    }
    public void removeChild(FileSystemNode child){
        this.children.remove(child);
    }

    @Override
    void ls() {
        for (FileSystemNode node : children) {
            System.out.println(node.name);
        }
    }

}
