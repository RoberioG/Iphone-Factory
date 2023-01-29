package br.com.atividade1.iphone;

public interface Iphone {
    String exibirDetalhes();
}

class Iphone9 implements Iphone{

    String verIOS;
    String tela;
    Integer memoRAM;
    Integer memoROM;
    String camera;
    Integer bateria;

    public Iphone9(String verIOS, String tela, Integer memoRAM, Integer memoROM, String camera, Integer bateria) {
        this.verIOS = verIOS;
        this.tela = tela;
        this.memoRAM = memoRAM;
        this.memoROM = memoROM;
        this.camera = camera;
        this.bateria = bateria;
    }


    @Override
    public String toString() {
        return "Iphone9:\n" +
                " Versão IOS :" + verIOS + "\n" +
                " Tela :" + tela + "\"\n" +
                " Memoria RAM :" + memoRAM + "Gb\n" +
                " Memoria ROM :" + memoROM + "Gb\n" +
                " Camera :" + camera + "Mpx\n" +
                " Bateria :" + bateria + "MAh";
    }

    @Override
    public String exibirDetalhes() {
        return toString();
    }
}

class IphoneX implements Iphone{

    String verIOS;
    String tela;
    Integer memoRAM;
    Integer memoROM;
    String camera;
    Integer bateria;

    public IphoneX(String verIOS, String tela, Integer memoRAM, Integer memoROM, String camera, Integer bateria) {
        this.verIOS = verIOS;
        this.tela = tela;
        this.memoRAM = memoRAM;
        this.memoROM = memoROM;
        this.camera = camera;
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "IphoneX:\n" +
                " Versão IOS :" + verIOS + "\n" +
                " Tela :" + tela + "\"\n" +
                " Memoria RAM :" + memoRAM + "Gb\n" +
                " Memoria ROM :" + memoROM + "Gb\n" +
                " Camera :" + camera + "Mpx\n" +
                " Bateria :" + bateria + "MAh";
    }

    @Override
    public String exibirDetalhes() {
        return toString();
    }
}

class Iphone13Mini implements Iphone{

    String verIOS;
    String tela;
    Integer memoRAM;
    Integer memoROM;
    String camera;
    Integer bateria;

    public Iphone13Mini(String verIOS, String tela, Integer memoRAM, Integer memoROM, String camera, Integer bateria) {
        this.verIOS = verIOS;
        this.tela = tela;
        this.memoRAM = memoRAM;
        this.memoROM = memoROM;
        this.camera = camera;
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Iphone9:\n" +
                " Versão IOS :" + verIOS + "\n" +
                " Tela :" + tela + "\"\n" +
                " Memoria RAM :" + memoRAM + "Gb\n" +
                " Memoria ROM :" + memoROM + "Gb\n" +
                " Camera :" + camera + "Mpx\n" +
                " Bateria :" + bateria + "MAh";
    }

    @Override
    public String exibirDetalhes() {
        return toString();
    }
}
