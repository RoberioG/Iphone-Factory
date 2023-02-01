package br.com.atividade1.iphone;

public interface IphoneInterface {
    String exibirDetalhes();
}

class Iphone9 extends Iphone implements IphoneInterface {

    public Iphone9(String verIOS, String tela, Integer memoRAM, Integer memoROM, String camera, Integer bateria) {
        super(verIOS,tela, memoRAM, memoROM, camera, bateria );
    }

    @Override
    public String toString() {
        return "Iphone9:\n" + super.toString();
    }

    @Override
    public String exibirDetalhes() {
        return toString();
    }
}

class IphoneX extends Iphone implements IphoneInterface {

    public IphoneX(String verIOS, String tela, Integer memoRAM, Integer memoROM, String camera, Integer bateria) {
        super(verIOS,tela, memoRAM, memoROM, camera, bateria );
    }

    @Override
    public String toString() {
        return "IphoneX:\n" + super.toString();
    }

    @Override
    public String exibirDetalhes() {
        return toString();
    }
}

class Iphone13Mini extends Iphone implements IphoneInterface {

    public Iphone13Mini(String verIOS, String tela, Integer memoRAM, Integer memoROM, String camera, Integer bateria) {
        super(verIOS,tela, memoRAM, memoROM, camera, bateria );
    }

    @Override
    public String toString() {
        return "Iphone 13 Mini:\n" + super.toString();
    }

    @Override
    public String exibirDetalhes() {
        return toString();
    }
}
