package com.dis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ing. Diego Ignacio Severini on 21/7/2017.
 */
@Controller
public class TurnosController {

    @RequestMapping("/turno")
    public @ResponseBody String getTurno() {
        return "Hola";
    }

}
