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
            String[] frasesSimples={"Es mi deber servirle.","Por supuesto señor.","Enseguida, señor.","Por supuesto, amo.",
            "Lo haré de inmediato.","Estoy en ello.","Ha sido un placer servirle.","Mi señor su solicitud se ha cumplido.",
            "Mi señor, su solicitud se ha cumplido como lo solicitó.","Sus deseos se han realizado.","He atendido su solicitud.",
            "muy bien.","Excelente.","Está hecho.","Considérelo hecho.","Voy corriendo.","Ya esstá hecho.","En un pizpáz.",
            "En un santiamén.","Así será.","Un momento por favor.","Un momento por favor. Está listo.",
            "Un momento por favor. Ya está.","Un momento por favor. Ya está listo.","Un momento por favor. Está hecho.",
            "Un momento por favor. Su solicitud se ha completado con éxito.","Espere un momento por favor.",
            "Espere un momento por favor. Está listo.","Espere un momento por favor. Ya está.",
            "Espere un momento por favor. Ya está listo.","Espere un momento por favor. Está hecho.",
            "Espere un momento por favor. Su solicitud se ha completado con éxito."};
            int seleccionado=seleccionador.nextInt(frasesSimples.length);
            //genera un número al azar tomando como máximo número a generar el tamaño del arreglo frasesSimples
            
            String frase;
            frase=frasesSimples[seleccionado];
            //Selecciona una frase del arreglo
            
            return input.getResponseBuilder().withSpeech(frase)
                .withSimpleCard("Prueba de Mayordomo servicial", frase).withShouldEndSession(true).build();
            //hace que Alexa diga la frase seleccionada
        }
        else{//Se utiliza para frases que terminan en pregunta
            //si el número generado no es par
            String[] frasesConPregunta={"Solicitud completada, ¿hay algo más en lo que le pueda servir?.",
                "¿Algo más en lo que le pueda servir señor?","¿Alguna otra cosa más?","¿Necesita algo más?","¿algo más que necesite?",
            ""};
            int seleccionado=seleccionador.nextInt(frasesConPregunta.length);
             //genera un número al azar tomando como máximo número a generar el tamaño del arreglo frasesConPregunta
            
            String frase;
            frase=frasesConPregunta[seleccionado];
            //Selecciona una frase del arreglo
            
            return input.getResponseBuilder().withSpeech(frase)
                .withSimpleCard("Prueba de Mayordomo servicial", frase).withReprompt(frase).withShouldEndSession(true).build();
            //hace que Alexa diga la frase seleccionada y espere a una respuesta del usuario
        }
    }
}
