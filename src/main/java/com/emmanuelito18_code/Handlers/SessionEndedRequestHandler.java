/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emmanuelito18_code.Handlers;

//librerías de amazon alexa
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.SessionEndedRequest;
import static com.amazon.ask.request.Predicates.requestType;

import java.util.Optional;
/**
 * @author Emmanuelito18
 */
public class SessionEndedRequestHandler implements RequestHandler{
    //Este manipulador se utilizará para limpieza tras la ejecución de la skill
    @Override
    public boolean canHandle(HandlerInput input){
        return input.matches(requestType(SessionEndedRequest.class));
    }
    
    @Override
    public Optional<Response> handle(HandlerInput input){
        //cualquier logica de limpieza va aquí
        return input.getResponseBuilder().build();
    }
}
