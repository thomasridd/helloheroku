package com.github.davidcarboni.hellojava;

import com.github.davidcarboni.restolino.framework.Api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import java.util.ArrayList;

/**
 * Example REST handler.
 */
@Api // This marks a class so that the framework picks it up and adds methods to the service.
public class Rest {

    /**
     * This method will be called for GET requests.
     * The name of the method can be anything you like, but you need the {@code GET} Java annotation.
     * The parameters must start with {@link javax.servlet.http.HttpServletRequest HttpServletRequest}
     * and {@link javax.servlet.http.HttpServletResponse HttpServletResponse}
     */
    @GET
    public Message getMessage(HttpServletRequest req, HttpServletResponse res) {

        Message message = new Message();

        message.message = "Hello world!";

        message.greetings = new ArrayList<>();
        message.greetings.add("Ho ho ho!");
        message.greetings.add("Simple REST rocks");

        return message;
    }

    /**
     * This method will be called for POST requests.
     * The name of the method can be anything you like, but you need the {@code POST} Java annotation.
     * The parameters must start with {@link javax.servlet.http.HttpServletRequest HttpServletRequest}
     * and {@link javax.servlet.http.HttpServletResponse HttpServletResponse}. The additional
     * {@link Message} parameter means the framework will attempt to read the request body and deserialise
     * from Json into a {@link Message} object.
     */
    @POST
    public Message postMessage(HttpServletRequest req, HttpServletResponse res, Message message) {

        Message result = message;

        if (result == null) {

            message.message = "No message provided";

            message.greetings = new ArrayList<>();
            message.greetings.add("Try posting a message");
            message.greetings.add("{message:\"Hello, world!\", greetings: [\"Ho ho ho!\", \"Simple REST rocks\"]}");
        }

        return result;
    }
}
