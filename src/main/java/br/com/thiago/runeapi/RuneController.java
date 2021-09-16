package br.com.thiago.runeapi;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequiredArgsConstructor
@RequestMapping("/runes")
public class RuneController {

    private final RuneService runeService;

    @GetMapping("/elderFurthark")
    public ResponseEntity<String> getElderFurtharkPathParam(@PathParam(value = "texto") Texto texto) {
        return runeService.getElderFurhark(texto);
    }
}
