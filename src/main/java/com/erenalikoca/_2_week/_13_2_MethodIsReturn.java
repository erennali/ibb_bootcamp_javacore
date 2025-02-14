package com.erenalikoca._2_week;

public class _13_2_MethodIsReturn {

    public String methodIsReturn() {
        return "Hello World";
    }

    public String methodIsReturn(String name) {
        return name;
    }

    public static void main(String[] args) {

        _13_2_MethodIsReturn methodIsReturn = new _13_2_MethodIsReturn();

        String result = methodIsReturn.methodIsReturn();
        System.out.println(result);

        String result2 = methodIsReturn.methodIsReturn("Er<NAME>");
        System.out.println(result2);
    }
}
