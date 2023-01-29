package br.com.atividade1.iphone;

public class IphoneFactory{
    public static Iphone cadastrarIphone(TypeIphoneEnum tipo) throws IllegalAccessException {
        if (tipo.equals(TypeIphoneEnum.IPHONE_9))
            return new Iphone9("11.0", "4.7", 3, 32, "12", 3200);

        else if (tipo.equals(TypeIphoneEnum.IPHONE_X))
            return new IphoneX("14.0", "5", 4, 64, "12", 4000);

        else if (tipo.equals(TypeIphoneEnum.IPHONE_13_MINI))
            return new Iphone13Mini("16.0", "6.2", 6, 128, "32", 4200);

        throw new IllegalAccessException("Tipo de iphone não identificado");
    }

}
