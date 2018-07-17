package com.dyy.springcore.spel;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class SpelMethodApplication {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        //String中方法的解析(substring)
        String strName = (String) parser.parseExpression("'hello world'.substring(6)").getValue();
        System.out.println(strName);

        //静态方法System.currentTimeMillis()
        Long dateVal = parser.parseExpression("T(java.lang.System).currentTimeMillis()").getValue(Long.class);
        System.out.println(dateVal);

        //实例方法
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        EvaluationContext context = new StandardEvaluationContext(simpleDateFormat);
        String timeVal = parser.parseExpression("format(new java.util.Date())").getValue(context,String.class);
        System.out.println(timeVal);
    }
}
