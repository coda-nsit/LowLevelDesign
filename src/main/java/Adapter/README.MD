`Client` calls the `Service` APIs. But they are incompatible. 
In our example, client only passes the `userId` and expects the username.
But the service expects the client to pass in the `age` as well.
`getUserNameFromDbWithinAge(userId)` -> `getUserNameFromDbWithinAge(userId, age)`

The adapter sits in the middle converting the client call to service call by adding the age parameter.