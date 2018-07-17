package com.dyy.springcore.spel;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelTextApplication {
    public static void main(String[] args) {
        //文本字符解析

        //构造表达式的解析实例
        ExpressionParser  parser = new SpelExpressionParser();
        //字符串需要使用单引号引起来
        String strVal = parser.parseExpression("'hello world'").getValue(String.class);
        System.out.println(strVal);

        //字符串使用双引号则需要转义
        String strVal2 = parser.parseExpression("\"hello world\"").getValue(String.class);
        System.out.println(strVal2);

        //给出数字解析成int类型
        Integer intVal = parser.parseExpression("110").getValue(Integer.class);
        System.out.println(intVal);

        //解析boolean
        Boolean booVal = parser.parseExpression("true").getValue(Boolean.class);
        System.out.println(booVal);

    }
}
