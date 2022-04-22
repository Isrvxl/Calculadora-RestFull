package com.litiobyte.CalculadoraRestFull.Controllers;

import com.litiobyte.CalculadoraRestFull.Request.CalculadoraRequest;
import com.litiobyte.CalculadoraRestFull.Response.CalculadoraResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadoraLitiobyte")
public class SumaController {
    
    @PostMapping("/sumar")
    public CalculadoraResponse calcular(@RequestBody CalculadoraRequest rq) {

        CalculadoraResponse rs = new CalculadoraResponse();
        rs.setResultado(0.0);
        rs.setResultado(rq.getValor1() + rq.getValor2());
        return rs;
    }

}