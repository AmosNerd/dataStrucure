package com.compute.demo.dataStructure.stack;

public class Calculator extends ArrayStack {
    public Calculator(int maxSize) {
        super(maxSize);
    }

    public static void main(String[] args) {
        String expression = "3+2*6-2";
        char ch = ' ';
        int num1 = 0;
        int num2 = 0;
        int oper = 0;
        int res = 0;
        int index = 0;
        Calculator numStack=new Calculator(10);
        Calculator operStack=new Calculator(10);

        while (true) {
            ch=expression.substring(index,index+1).charAt(0);
//            if(o perStack)

        }

    }

    public int priority(int operator) {
        if (operator == '*' || operator == '/') {
            return 1;
        } else if (operator == '+' || operator == '-') {
            return 0;
        } else
            return -1;
    }

    public boolean isOper(char val) {
        return val == '+' || val == '-' || val == '*' || val == '/';
    }

    public int cal(int num1, int num2, int oper) {
        int res = 0;
        switch (oper) {

            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
        }
        return res;
    }
}
