package com.amazon.ata.inmemorycaching.prework.order;

import com.amazon.ata.inmemorycaching.prework.order.resources.OnlineOrdersDAO;
import com.amazon.ata.inmemorycaching.prework.order.resources.Order;

import java.util.ArrayList;
import java.util.List;

public class CachingOnlineOrderDAO {


    /**
     * Constructor.
     * PARTICIPANTS: Instantiate a LoadingCache instance
     * @param ordersDAO OnlineOrdersDAO that will be used by the cache to retrieve a miss.
     */
    public CachingOnlineOrderDAO(OnlineOrdersDAO ordersDAO) {

    }

    /**
     * Gets all the orders associated with a particular user.
     * PARTICIPANTS: call the cache to get the list of orders
     * @param userId user to retrieve orders for
     * @return List of orders
     */
    public List<Order> getOrdersByUser(String userId) {
        return new ArrayList<Order>();
    }
}
