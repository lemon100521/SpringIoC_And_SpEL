package com.dyy.springcore.spel;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.Date;

public class SpelObjectAplication {
    public static void main(String[] args) {
        //创建user对象
        User user = new User();
        user.setUserName("lemon");
        user.setLastVisit(new Date());
        user.setCredits(10);
        PlaceOfBirth placeOfBirth = new PlaceOfBirth("陕西","渭南");
        user.setPlaceOfBirth(placeOfBirth);
        System.out.println(user);
        System.out.println(user.getPlaceOfBirth());



        //SpEL访问对象属性
        ExpressionParser parser = new SpelExpressionParser();
        //上下文
        EvaluationContext context = new StandardEvaluationContext(user);

        //访问用户姓名
        System.out.println();
        String strName = (String) parser.parseExpression("userName").getValue(context);
        System.out.println(strName);
        //访问出生地
        PlaceOfBirth placeOfBirth1 = parser.parseExpression("placeOfBirth").getValue(context,PlaceOfBirth.class);
        System.out.println(placeOfBirth1);
        //访问出生地中的省份
        String  strNation = parser.parseExpression("placeOfBirth.nation").getValue(context,String.class);
        System.out.println(strNation);

        //在不使用上下文时，也可达到与上述同样的效果，但是相比来说效率较低
        String strNation2 = parser.parseExpression("placeOfBirth.nation").getValue(user,String.class);
        System.out.println(strNation2);

    }
}
