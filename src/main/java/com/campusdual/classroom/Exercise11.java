package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        // Encender la TV
        blackRemote.turnOn();

        // Subir un canal
        blackRemote.channelUp();

        // Bajar un canal
        blackRemote.channelDown();

        // Establecer el canal en 0, intentar bajar un canal y comprobar que no se puede
        blackRemote.channelDown();

        // Subir el volumen
        blackRemote.volumeUp();

        // Bajar el volumen
        blackRemote.volumeDown();

        // Establecer el volumen en 0, intentar bajar el volumen y comprobar que no se puede
        blackRemote.volumeDown();

        // Obtener el color del mando a distancia y mostrarlo por pantalla
        System.out.println(blackRemote.getColor());

        // Apagar la TV
        blackRemote.turnOff();
    }

}
