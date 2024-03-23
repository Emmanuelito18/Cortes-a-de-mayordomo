/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.emmanuelito18_code.mayordomoServicial;

//librerias de amazon alexa
import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;//libreria para decidir que debe hacer la skill

//importación de los manipuladores hechos
import com.emmanuelito18_code.Handlers.CancelandStopIntentHandler;
import com.emmanuelito18_code.Handlers.FallbackIntentHandler;
import com.emmanuelito18_code.Handlers.HelpIntentHandler;
import com.emmanuelito18_code.Handlers.LaunchRequestHandler;
import com.emmanuelito18_code.Handlers.SessionEndedRequestHandler;
import com.emmanuelito18_code.Handlers.FrasesIntentHandler;
/**
 * @author Emmanuelito18
 */
public class MayordomoServicial extends SkillStreamHandler {
    //Esta clase es la clase pincipal de la alexa skill y se conoce como controlador de transmision
    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new FrasesIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new FallbackIntentHandler())
                .build();
    }

    public MayordomoServicial() {
        super(getSkill());
    }

}
