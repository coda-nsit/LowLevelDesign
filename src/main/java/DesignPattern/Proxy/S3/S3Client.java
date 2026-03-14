package DesignPattern.Proxy.S3;

import java.io.IOException;
import java.util.List;

public class S3Client implements S3 {

    private final S3Service s3Service;

    S3Client() {
        this.s3Service = new S3Service();
    }
    @Override
    public void putObject(String bucket, String key, String content) throws IOException {
        // authenticate
        // create http request
        this.s3Service.putObject(bucket, key, content);
    }

    @Override
    public String getObject(String bucket, String key) throws IOException {
        // authenticate
        // create http request
        return this.s3Service.getObject(bucket, key);
    }

    @Override
    public List<String> listBuckets() throws IOException {
        // authenticate
        // create http request
        return this.s3Service.listBuckets();
    }
}
