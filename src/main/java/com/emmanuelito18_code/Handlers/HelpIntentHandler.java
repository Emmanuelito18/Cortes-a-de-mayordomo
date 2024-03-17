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
/*
import static se utiliza para importar miembros estáticos de una clase 
directamente en otra clase, lo que permite acceder a esos miembros sin tener que
usar el nombre de la clase contenedora. Esto puede ayudar a mejorar la 
legibilidad del código y reducir la cantidad de escritura necesaria.
*/

import java.util.Optional;
/**
 * @author Emmanuelito18
 */
public class HelpIntentHandler implements RequestHandler{
    @Override
    public boolean canHandle(HandlerInput input){
        return input.matches(intentName("AMAZON.HelpIntent"));
    }
    
    @Override
    public Optional<Response> handle(HandlerInput input){
        String speechText="Esta alexa skill está diseñada especialmente para utilizarse en rutinas. "
                + "Debido a que esta skill solo dice una frase para luego cerrarse, por favor "
                + "configura esta skill en una rutina para usarla adecuadamente mediante la app de alexa";
        return input.getResponseBuilder().withSpeech(speechText)
                .withSimpleCard("Asbre esta skill", speechText).withReprompt(speechText)
                .build();
    }
}
