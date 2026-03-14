package DesignPattern.Proxy.S3;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        S3Client s3Client = new S3Client();
        System.out.println(s3Client.listBuckets());
    }
}
