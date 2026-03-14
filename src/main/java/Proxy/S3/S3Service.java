package Proxy.S3;

import java.io.IOException;
import java.util.List;

public class S3Service implements S3 {
    @Override
    public void putObject(String bucket, String key, String content) throws IOException {

    }

    @Override
    public String getObject(String bucket, String key) throws IOException {
        return "";
    }

    @Override
    public List<String> listBuckets() throws IOException {
        return List.of();
    }
}
