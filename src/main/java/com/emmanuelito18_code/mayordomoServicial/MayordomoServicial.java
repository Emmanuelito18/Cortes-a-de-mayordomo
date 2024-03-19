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
/**
 * @author Emmanuelito18
 */
public class MayordomoServicial extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        //new HelloWorldIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler())
                .build();
    }

    public MayordomoServicial() {
        super(getSkill());
    }

}
