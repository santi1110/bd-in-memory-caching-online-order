package com.amazon.ata.inmemorycaching.prework.order.resources;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;

/**
 * Reuse this class and method throughout all Dynamo related activities that need a DynamoDBClient
 * ATA will provide another DynamoDBClientProvider class in this same package with a getDynamoDBClient() method
 * that returns a client with credentials specifically for each participant.
 *
 * Please do not add anything extra in here that is required for any coding activity.
 */
public class DynamoDbClientProvider {
    /**
     * Used to retrieve a DDB Client for use in creating a mapper object.
     * @param region the region the DynamoDB resides in.
     * @return DDB Client
     */
    public static AmazonDynamoDB getDynamoDBClient(Regions region) {
        return AmazonDynamoDBClientBuilder
                .standard()
                // this will use multiple providers to look for AWS credentials, most
                // convenient is ProfileCredentialsProvider since the CLI should be set up to deploy CloudFormation
                // https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/auth/profile/ProfileCredentialsProvider.html
                .withCredentials(DefaultAWSCredentialsProviderChain.getInstance())
                // This should be the same region the CloudFormation stack with tables was deployed in
                .withRegion(region)
                .build();
    }
}
