package com.cesde.academico;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("hola mundo")
@RequestMapping("/hola_mundo")

public class HolaMundoController {

    @GetMapping
public String  imprimirholamundo(){
  return"hola mundo";
}

}
