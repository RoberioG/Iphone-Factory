package br.com.atividade1.iphone;

public abstract class Iphone {

    String verIOS;
    String tela;
    Integer memoRAM;
    Integer memoROM;
    String camera;
    Integer bateria;

    public Iphone(String verIOS, String tela, Integer memoRAM, Integer memoROM, String camera, Integer bateria) {
        this.verIOS = verIOS;
        this.tela = tela;
        this.memoRAM = memoRAM;
        this.memoROM = memoROM;
        this.camera = camera;
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return
                "   Versão IOS: " + verIOS + "\n" +
                "   Tela :" + tela + "\"\n" +
                "   Memoria RAM: " + memoRAM + "Gb\n" +
                "   Memoria ROM: " + memoROM + "Gb\n" +
                "   Camera: " + camera + "Mpx\n" +
                "   Bateria: " + bateria + "MAh\n";
    }

}
