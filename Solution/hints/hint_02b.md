In the build method we need to tell the `LoadingCache` object how to retrieve the data if it is not already in the cache.
This is done by using a static method on the `CacheLoader` Class.

```java
CacheLoader.from(...)
```

The from method takes the class instance and method name of where to retrieve the data from. The format is: 
`classInstance::methodName`
