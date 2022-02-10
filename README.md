### Adding Caching to our Orders Manager

Expected time required: 20 min

Our online order system allows a user to view all of their recent orders. By providing a `String userId`, the 
`OnlineOrderDAO#getOrdersByUser` method will return a `List<Order>` object from the `OnlineOrders` DynamoDB Table. 
We would like to add caching to this system now so that the resulting orders are cached for each user. 

We have created a `CachingOnlineOrderDAO` class along with a method stub for `getOrdersByUser`. Please complete 
the implementation of this class by:
1. Adding an instance variable to store a `LoadingCache` instance set up with appropriate keys for the situation.
2. Initializing the `LoadingCache` correctly in the constructor.
3. Filling out the `getOrdersByUser` method to correctly access the cache to return a List of `Order` objects.
4. Ensure that all tests pass.

**Note:** The `OnlineOrdersDAO` and `Order` classes have been provided as resources. They should not need to be modified in 
any way for your solution. The import statements have already been added to `CachingOrdersDAO`.

A `main` method has been provided in the `OnlineOrderManager` as a way to use the caching DAO as you develop 
your solution. 

HINTS:
* [What should I use as the key/value structure for the cache?](./hints/hint-01.md)
* [How do I instantiate a LoadingCache object again?](./hints/hint-02.md)
* [How do I add an item to the cache?](./hints/hint-03.md)
* [How do I access an item once it's in the cache?](./hints/hint-04.md)

