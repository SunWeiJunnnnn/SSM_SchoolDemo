package com.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import java.io.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 * 日志增强
 */
@Aspect
public class LogAdvice {

    /**
     *
     * @return
     */
    @AfterThrowing(pointcut = "execution(* com.service.impl.*.*(..))",throwing = "tb")
    public Object doAround(JoinPoint pj, Throwable tb) throws Throwable {
        //获得日志生成时间时间
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar date = Calendar.getInstance();

        //获得类
       String className =  pj.getTarget().getClass().getName();
       //获得方法名
        String methodName = pj.getSignature().getName();
        StringBuilder log = new StringBuilder();
        String mes = tb.getMessage();
        log.append(format.format(date) + ":" + className + "执行了" + "出错："+ tb.getMessage());


        File logFile = new File("C:\\Users\\junan\\Desktop\\log"+date.get(Calendar.MONTH)+date.get(Calendar.DAY_OF_MONTH)+".log");
        FileWriter writer = new FileWriter(logFile,true);
        BufferedWriter bw = new BufferedWriter(writer);
        try {
            tb.printStackTrace(new PrintWriter(bw));
            bw.write(log.toString());
            bw.newLine();
            bw.flush();
        }finally {
            bw.close();
            writer.close();
        }
        return  null;
    }

    /**
     * 写入日志的操作
     * @param loaMsg
     * @throws IOException
     */
    public static void doLog(String loaMsg) throws IOException {
        File logFile = new File("C:\\Users\\junan\\Desktop\\log.log");
        FileWriter writer = new FileWriter(logFile,true);
        BufferedWriter bw = new BufferedWriter(writer);
        try {
            bw.write(loaMsg);
            bw.newLine();
            bw.flush();
        }finally {
            bw.close();
            writer.close();
        }


    }
}
