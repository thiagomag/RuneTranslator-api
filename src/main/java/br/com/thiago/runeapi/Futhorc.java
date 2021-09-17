package br.com.thiago.runeapi;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class Futhorc {

    public ResponseEntity<String> getFuthorc(Texto texto) {
        StringBuilder rune = new StringBuilder();
        for (int i = 0; i < texto.getTextoParaTraduzir().length(); i++) {
            switch (texto.getTextoParaTraduzir().toLowerCase().charAt(i)) {
                case 'a':
                    if(texto.getTextoParaTraduzir().toLowerCase().charAt(i-1) == 'e') {
                        break;
                    } else {
                        rune.append("\u16AA");
                    }
                    break;
                case 'b':
                    rune.append("\u16D2");
                    break;
                case 'c':
                case 'k':
                case 'q':
                    rune.append("\u16B3");
                    break;
                case 'd':
                    rune.append("\u16DE");
                    break;
                case 'e':
                    if(texto.getTextoParaTraduzir().toLowerCase().charAt(i+1) == 'a') {
                        rune.append("\u16E0");
                    } else {
                        rune.append("\u16D6");
                    }
                    break;
                case 'f':
                    rune.append("\u16A0");
                    break;
                case 'g':
                case 'ȝ':
                    rune.append("\u16B7");
                    break;
                case 'h':
                    rune.append("\u16BB");
                    break;
                case 'i':
                    if(texto.getTextoParaTraduzir().toLowerCase().charAt(i+1) == 'o') {
                        rune.append("\u16E1");
                    } else {
                        rune.append("\u16C1");
                    }
                    break;
                case 'j':
                    rune.append("\u16C4");
                    break;
                case 'l':
                    rune.append("\u16DA");
                    break;
                case 'm':
                    rune.append("\u16D7");
                    break;
                case 'n':
                    rune.append("\u16BE");
                    break;
                case 'o':
                    if(texto.getTextoParaTraduzir().toLowerCase().charAt(i-1) == 'i') {
                        break;
                    } else {
                        rune.append("\u16A9");
                    }
                    break;
                case 'p':
                    rune.append("\u16C8");
                    break;
                case 'r':
                    rune.append("\u16B1");
                    break;
                case 's':
                    rune.append("\u16CB");
                    break;
                case 't':
                    rune.append("\u16CF");
                    break;
                case 'u':
                case 'v':
                    rune.append("\u16A2");
                    break;
                case 'x':
                    rune.append("\u16C9");
                    break;
                case 'z':
                    rune.append("\u16C9");
                    break;
                case 'þ':
                    rune.append("\u16A6");
                    break;
                case 'æ':
                    rune.append("\u16AB");
                    break;
                case 'ï':
                    rune.append("\u16C7");
                    break;
                case 'ŋ':
                    rune.append("\u16DD");
                    break;
                case 'y':
                    rune.append("\u16A3");
                    break;
                case 'w':
                    rune.append("\u16B9");
                    break;
                case 'œ':
                    rune.append("\u16DF");
                    break;
                case ' ':
                    rune.append(" ");
                    break;
                default:
                    rune.append(String.valueOf(texto.getTextoParaTraduzir().charAt(i)).toUpperCase());
            }
        }
        return ResponseEntity.ok(rune.toString());
    }
}
