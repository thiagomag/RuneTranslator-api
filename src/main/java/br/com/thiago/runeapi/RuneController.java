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

    private final ElderFurthark elderFurthark;
    private final Futhorc futhorc;

    @GetMapping("/elderFurthark")
    public ResponseEntity<String> getElderFurtharkPathParam(@PathParam(value = "texto") Texto texto) {
        return elderFurthark.getElderFurhark(texto);
    }

    @GetMapping("/futhorc")
    public ResponseEntity<String> getFuthorcPathParam(@PathParam(value = "texto") Texto texto) {
        return futhorc.getFuthorc(texto);
    }
}
