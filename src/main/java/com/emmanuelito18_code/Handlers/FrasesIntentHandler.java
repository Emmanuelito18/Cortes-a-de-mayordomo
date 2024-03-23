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
import java.util.Random;//para generar números aleatorios
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
        Random random=new Random();
        Random seleccionador=new Random();
        //crea un objeto de la clase random
        int randomNumber=random.nextInt(100);
        if(randomNumber%2==0){//Se utiliza para frases simples
            //si el número generado es par
            String[] frasesSimples={""};
            int seleccionado=seleccionador.nextInt(frasesSimples.length);
            
            String frase;
            frase=frasesSimples[seleccionado];
        }
        else{//Se utiliza para frases que terminan en pregunta
            //si el número generado no es par
            String[] frasesConPregunta={""};
            int seleccionado=seleccionador.nextInt(frasesConPregunta.length);
            
            String frase;
            frase=frasesConPregunta[seleccionado];
        }
        String speechText="Esto es una prueba de mi skill de alexa";
        return input.getResponseBuilder().withSpeech(speechText)
                .withSimpleCard("Prueba de Mayordomo servicial", speechText).build();
    }
}
