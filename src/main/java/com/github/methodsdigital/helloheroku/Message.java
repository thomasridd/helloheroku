package com.github.methodsdigital.helloheroku;

import java.util.List;

/**
 * A simple Json message class.
 * This is a Plain Old Java Object (POJO) which can be automatically serialised and deserialised by the Restolino framework.
 */
public class Message {

    String message;
    List<String> greetings;
}
