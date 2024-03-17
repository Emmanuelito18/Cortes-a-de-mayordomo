/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emmanuelito18_code.Handlers;

//Se importan las librerías para las alexa skills
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;
/**
 * @author Emmanuelito18
 */
public class LaunchRequestHandler implements RequestHandler{
    @Override
    public boolean canHandle(HandlerInput input){
        //devuelve verdadero si la solicitud entrante es LaunchRequest
        return input.matches(Predicates.requestType(LaunchRequest.class));
    }

    @Override
    public Optional<Response> handle(HandlerInput input){
        //genera y devuelve una respuesta de saludo básica con objetos de respuesta como Voz, Tarjeta y Repetición
        String speechText="Bienvenidos a Cortesía de mayordomo, esta skill ha dio crada por: Emmanuelito18";
        return input.getResponseBuilder().withSpeech(speechText)
                .withSimpleCard("Bienvenida", speechText)/*.withReprompt(speechText)*/.build();
        /*
        El método withRepromt() sirve para esperar una respuesta del usuario
        (se susele utiliar para confirmar cosas o preguntar cosas)
        */
    }
}
