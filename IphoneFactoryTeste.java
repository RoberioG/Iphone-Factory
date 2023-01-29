package br.com.atividade1.iphone;

import java.util.Scanner;

public class IphoneFactoryTeste {

    public static void main(String[] args) throws IllegalAccessException {
        Iphone iphone1 = IphoneFactory.cadastrarIphone(TypeIphoneEnum.IPHONE_9);
        Iphone iphone2 = IphoneFactory.cadastrarIphone(TypeIphoneEnum.IPHONE_X);
        Iphone iphone3 = IphoneFactory.cadastrarIphone(TypeIphoneEnum.IPHONE_13_MINI);

        System.out.println(iphone1.toString());
        System.out.println(iphone2.toString());
        System.out.println(iphone3.toString());

        
    }

//    @Override
//    public static Iphone cadastrarIphone(TypeIphoneEnum typeIphoneEnum) {
//
//        switch (typeIphoneEnum){
//            case IPHONE_X:
//                return new IphoneX();
//            case IPHONE_9:
//                return new Iphone9();
//            case IPHONE_13_MINI:
//                return new Iphone13Mini();
//        }
//        return null;
//    }
//
//    public static Iphone principal(){
//        Scanner scanner = new Scanner(System.in);
//        TypeIphoneEnum typeIphoneEnum = null;
//
//        do{
//            menu();
//            Integer op = Integer.getInteger(scanner.nextLine());
//
//            if (op == 1 ) {
//                typeIphoneEnum = TypeIphoneEnum.IPHONE_X;
//            } else if (op == 2) {
//                typeIphoneEnum = TypeIphoneEnum.IPHONE_9;
//            } else if (op == 3) {
//                typeIphoneEnum = TypeIphoneEnum.IPHONE_13_MINI;
//            } else {
//                System.out.println("Operação inválida");
//                break;
//            }
//
//            //Iphone iphone = cadastrarIphone(typeIphoneEnum);
//
//        }while (true);
//
//
//    }
//
//    public static void menu(){
//        System.out.println("######## LOJA IPHONE ########");
//        System.out.println("1 - Comprar Iphone x");
//        System.out.println("2 - Comprar Iphone 9");
//        System.out.println("3 - Comprar Iphone 13 Mini");
//        System.out.println("0 - Sair da aplicação");
//        System.out.println("Escolha um dos comandos acima");
//    }
}
