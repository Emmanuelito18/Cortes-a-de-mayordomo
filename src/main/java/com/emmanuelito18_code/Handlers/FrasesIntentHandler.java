/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emmanuelito18_code.Handlers;

//librerias de amazon alexa
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;
/**
 * @author Emmanuelito18
 */
public class FrasesIntentHandler implements RequestHandler{
    @Override
    public boolean canHandle(HandlerInput input){
        return input.matches(Predicates.intentName("FrasesIntent"));
    }
    
    @Override
    public Optional<Response> handle(HandlerInput input){
        String speechText="Esto es una prueba de mi skill de alexa";
        return input.getResponseBuilder().withSpeech(speechText)
                .withSimpleCard("Prueba de Mayordomo servicial", speechText).build();
    }
}
