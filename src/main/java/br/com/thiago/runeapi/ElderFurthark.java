package br.com.thiago.runeapi;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ElderFurthark {


    public ResponseEntity<String> getElderFurhark(Texto texto) {
        StringBuilder rune = new StringBuilder();
        for (int i = 0; i < texto.getTextoParaTraduzir().length(); i++) {
            switch (texto.getTextoParaTraduzir().toLowerCase().charAt(i)) {
                case 'a':
                    rune.append("\u16A8");
                    break;
                case 'b':
                    rune.append("\u16D2");
                    break;
                case 'c':
                case 'k':
                case 'q':
                    rune.append("\u16B2");
                    break;
                case 'd':
                    rune.append("\u16DE");
                    break;
                case 'e':
                    rune.append("\u16D6");
                    break;
                case 'f':
                    rune.append("\u16A0");
                    break;
                case 'g':
                    rune.append("\u16B7");
                    break;
                case 'h':
                    rune.append("\u16BA");
                    break;
                case 'i':
                case 'y':
                    rune.append("\u16C1");
                    break;
                case 'j':
                    rune.append("\u16C3");
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
                    rune.append("\u16DF");
                    break;
                case 'p':
                    rune.append("\u16C8");
                    break;
                case 'r':
                    rune.append("\u16B1");
                    break;
                case 's':
                    rune.append("\u16CA");
                    break;
                case 't':
                    rune.append("\u16CF");
                    break;
                case 'u':
                case 'v':
                    rune.append("\u16A2");
                    break;
                case 'x':
                    rune.append("\u16B2").append("\u16CA");
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
                    rune.append("\u16DC");
                    break;
                case 'w':
                    rune.append("\u16B9");
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
