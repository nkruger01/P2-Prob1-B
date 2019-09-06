package src.p2.prob1.b.factory;

import src.p2.prob1.b.FormatoAudio;
import src.p2.prob1.b.adapter.FormatoAudioAacAdapter;
import src.p2.prob1.b.adapter.FormatoAudioAiffAdapter;
import src.p2.prob1.b.adapter.FormatoAudioMP3Adapter;
import src.p2.prob1.b.adapter.FormatoAudioWavAdapter;
import src.p2.prob1.b.adapter.FormatoAudioWmaAdapter;

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
