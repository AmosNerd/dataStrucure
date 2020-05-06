package com.compute.demo.dataStructure.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Calculate {
    public static void main(String[] args) {

    }
    public static List<String> getListString(String suffix){

        String[]spilt=suffix.split(" ");
        List<String>list=new ArrayList<>();
        for(String ele:spilt){
            list.add(ele);
        }
        return list;
    }
//    public static int calculate(List<String>ls){
//        Stack<String> stack=new Stack<>();
//        for(String item:ls){
//            if(item.matches("\\d+")){
//                stack.push(item);
//            }else {
//                int num2=Integer.parseInt(stack.pop());
//                int num1=Integer.parseInt(stack.pop());
//                int res= 0;
//                if(item.equals("+")){
//                    res=num1+num2;
//                }else if(item.equals("-")){
//                    res=num1-num2;
//                }else if(item.equals("*")){
//                    res=num1*num2;
//                }
//                else if(item.equals(/)){
//                    res=num1/num2;
//                }
//                stack.push(String.valueOf(res));
//            }
//
//        }
//    }
}
