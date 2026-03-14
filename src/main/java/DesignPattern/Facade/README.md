```
                          +----------------+
                          |    Client      |
                          +----------------+
                                   |
                                   v
                          +----------------+
                          |    Facade      |
                          +----------------+
                                   |
       -------------------------------------------------------------------------
       |                               |                                      |
       v                               v                                      v
    +---------------+             +----------------+                     +----------------+
    | Subsystem A   |             |  Subsystem B   |                     |  Subsystem C   |
    | (Auth Module) |             | (Billing Core) |                     | (Inventory)    |
    +---------------+             +----------------+                     +----------------+
    |                               |                                      |
    | uses                          | triggers                             | queries
    v                               v                                      v
    +---------------+             +----------------+                     +----------------+
    | A.Helper1     |<----------->| B.Validator    |<------------------>| C.CacheManager |
    +---------------+   cross-     +----------------+      cross-       +----------------+
    |           dependency          |             dependency              |
    |                                \                                     |
    | calls                           \ calls                              | invalidates
    v                                  v                                    v
    +---------------+             +----------------+                     +----------------+
    | A.TokenStore  |<----------->| B.RateLimiter  |------------------->| C.DBAdapter    |
    +---------------+   shared     +----------------+      shared       +----------------+
    |           resource            |             resource               |
    |                                |                                    |
    | updates                        | logs                                | fetches
    v                                v                                    v
    +---------------+             +----------------+                     +----------------+
    | AuditLogger   |<----------->| MetricsEngine  |<------------------>| EventBus       |
    +---------------+   global     +----------------+      global       +----------------+
```

1. Facade pattern is a very basic design pattern used to hide the madness of a underlying system from the client.
2. The client just interacts with the `Facade` class. What the `Facade` class does it totally dependent on the scenario
   and not really important to the design pattern itself. For example, in this case whatever happens under the `Facade`
   class is irrelevant to this design pattern.
3. The functions in the Facade class will be mostly private.

```
class Facade {
    private void createSubsystemA() {
        ...
    }
    
    private void createSubsystemB() {
        ...
    }
    ....
}
class Client {
    public static void main(String args[]) {
        Facade facade = new Facade();
        // thats it. Facade pattern ends here.
    }
}
```
