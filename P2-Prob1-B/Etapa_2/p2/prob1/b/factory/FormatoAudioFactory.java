package Etapa_2.p2.prob1.b.factory;

import Etapa_2.p2.prob1.b.FormatoAudio;
import Etapa_2.p2.prob1.b.adapter.FormatoAudioAacAdapter;
import Etapa_2.p2.prob1.b.adapter.FormatoAudioAiffAdapter;
import Etapa_2.p2.prob1.b.adapter.FormatoAudioMP3Adapter;
import Etapa_2.p2.prob1.b.adapter.FormatoAudioWavAdapter;
import Etapa_2.p2.prob1.b.adapter.FormatoAudioWmaAdapter;

import java.security.InvalidParameterException;

public class FormatoAudioFactory {

   
    public static FormatoAudio getFormatoAudio(String arquivo) {
        if (arquivo != null) {
            String extensaoArquivo = arquivo.split("\\.")[1];

            switch (extensaoArquivo) {
                case "wma":
                    return new FormatoAudioWmaAdapter(arquivo);
                case "aiff":
                    return new FormatoAudioAiffAdapter(arquivo);
                case "wav":
                    return new FormatoAudioWavAdapter(arquivo);
                case "aac":
                    return new FormatoAudioAacAdapter(arquivo);
                case "mp3":
                    return new FormatoAudioMP3Adapter(arquivo);
                default:
                    throw new InvalidParameterException("Formato de arquivo invalido.");
            }
        }

        return null;
    }
}
