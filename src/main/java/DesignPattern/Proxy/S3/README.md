1. `S3Service` is the actual class which puts object in bucker, gets object from bucket, lists the buckets, deletes the 
    object from bucket, etc. But this class is implemented in the server. Hence, the client must make an HTTP request 
    to this class. The user using the S3 bucket just cares about S3 related functionality and not the HTTP related 
    things. 
2. `S3Client` is the proxy object which implements the same interfaces as `S3Service`. But also adds functionalities
   which are not related to S3 itself, but are needed to make `S3Service` work like:
   1. HTTP request creation
   2. JSON/XML serialization
   3. TLS/SSL
   4. Retries and exponential backoff
   5. Metrics and tracing
   6. etc.
3. User just talks with S3Client as if he/she was talking to the actual `S3Service`.

```
+---------+        calls        +----------------------+
| Client  | ------------------> |   S3Client Proxy     |
+---------+                     +----------------------+
                                      |
                                      | HTTPS + SigV4
                                      v
                              +----------------------+
                              |   AWS S3 Service     |
                              +----------------------+

```