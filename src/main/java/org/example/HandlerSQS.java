package org.example;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class HandlerSQS implements RequestHandler<SQSEvent, Void> {

    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Override
    public Void handleRequest(SQSEvent event, Context context) {

        LambdaLogger logger = context.getLogger();

        String response = new String("SUCCESS");

        logger.log("ENVIRONMENT VARIABLES: "+gson.toJson(System.getenv()));

        logger.log("CONTEXT: "+ gson.toJson(context));

        logger.log("EVENT: "+gson.toJson(event));

        return null;
    }
}
