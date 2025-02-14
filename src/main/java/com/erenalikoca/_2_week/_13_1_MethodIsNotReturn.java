package com.erenalikoca._2_week;

public class _13_1_MethodIsNotReturn {

    // 1- Metotlar (Returnsuz Parametresiz)
    public void metotReturnsuzParametresiz(){
        System.out.println("metotReturnsuzParametresiz");
    }

    // 2- Metotlar (ReturnsuzParametreli)
    public static void metotReturnsuzParametreli(String a){
        System.out.println("metotReturnsuzParametreli" + a);
    }

    // Overloading(Aşırı Yüklemek)
    public static void metotReturnsuzParametreli(String name,String surname){
        System.out.println("metot Returnsuz Parametreli "+name+" "+surname);
    }


    public static void main(String[] args) {

        _13_1_MethodIsNotReturn methodIsNotReturn = new _13_1_MethodIsNotReturn();
        methodIsNotReturn.metotReturnsuzParametresiz();

        //instance (new) olmadan static ile çağırma
        _13_1_MethodIsNotReturn.metotReturnsuzParametreli("Eren", "Ali");
        _13_1_MethodIsNotReturn.metotReturnsuzParametreli("Eren");
    }
}
