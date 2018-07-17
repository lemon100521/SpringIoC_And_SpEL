package com.dyy.springcore.spel;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import sun.plugin.javascript.navig.Array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class SpelCollectionApplicatio {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        //List集合
        List listValue  = (List) parser.parseExpression("{1,2,3}").getValue();
        System.out.println(listValue);
        List listValue2 = (List) parser.parseExpression("{'lemon','demon'}").getValue();
        System.out.println(listValue2);

        //数组
        int [] intArray = (int[]) parser.parseExpression("new int[]{1,2,3}").getValue();
        System.out.println(Arrays.toString(intArray));
        for (int i = 0; i < intArray.length;i++ ){
            System.out.print(" "+intArray[i]);
        }
        System.out.println();

        //Map集合
        Map mapVal = (Map) parser.parseExpression("{userName:'lemon',password:'lemon' }").getValue();
        System.out.println(mapVal);
//        Properties
    }
}
