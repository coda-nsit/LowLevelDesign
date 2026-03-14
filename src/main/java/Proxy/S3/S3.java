package Proxy.S3;

import java.io.IOException;
import java.util.List;

public interface S3 {
    void putObject(String bucket, String key, String content) throws IOException;
    String getObject(String bucket, String key) throws IOException;
    List<String> listBuckets() throws IOException;
}
