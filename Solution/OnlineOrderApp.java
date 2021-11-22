package com.amazon.ata.inmemorycaching.prework.order;

import com.amazon.ata.inmemorycaching.prework.order.resources.DynamoDbClientProvider;
import com.amazon.ata.inmemorycaching.prework.order.resources.OnlineOrdersDAO;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

public class OnlineOrderApp {

    /**
     * Main method to instantiate and run CachingOnlineOrderDAO.
     * @param args Main method parameter
     */
    public static void main(String[] args) {
        // Instantiate DynamoDB Mapper
        DynamoDBMapper mapper = new DynamoDBMapper(DynamoDbClientProvider.getDynamoDBClient(Regions.US_WEST_2));
        // Instantiate the OnlineOrderDAO with mapper
        OnlineOrdersDAO orderDAO = new OnlineOrdersDAO(mapper);

        // Instantiate the CachingOnlineOrderDAO with orderDAO
        CachingOnlineOrderDAO cachingDAO = new CachingOnlineOrderDAO(orderDAO);

        // Make several requests to the cachingDAO using the following userIds:
        // "62da86ba"
        // "d1a93bea"
        // The ordersDAO will write to the console whenever it makes a call out to the DynamoDB for data.

        // Sample call
        System.out.println("Orders by user 62da86ba: " + cachingDAO.getOrdersByUser("62da86ba").toString());
    }
}
