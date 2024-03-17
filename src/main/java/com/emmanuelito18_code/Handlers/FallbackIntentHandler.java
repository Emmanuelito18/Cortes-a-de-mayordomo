/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emmanuelito18_code.Handlers;

//librerias de amazon alexa
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import static com.amazon.ask.request.Predicates.intentName;

import java.util.Optional;
/**
 * @author Emmanuelito18
 */
public class FallbackIntentHandler implements RequestHandler{
    @Override
    public boolean canHandle(HandlerInput input){
        return input.matches(intentName("AMAZON.FallbackIntent"));
    }
    
    @Override
    public Optional<Response> handle(HandlerInput input){
        String speechText="Lo siento, no lo sé. Prueba a decir ayuda para recibir ayuda sobre esta skill";
        return input.getResponseBuilder().withSpeech(speechText)
                .withSimpleCard("Cortesía de mayordomo", speechText).withReprompt(speechText)
                .build();
    }
}
