package day1;


public class StringCalculate {

    //本方法只适用于两个数字和一个运算符号的运算符,其他形式的输入都会抛异常
    //仅仅考虑了int大小的数字计算
    public int calculate(String str) {
        int result = 0;
        char[] chars = str.toCharArray();
        StringBuilder firstString = new StringBuilder();
        StringBuilder secondString = new StringBuilder();

        //第一个字符如果不是数字的话,直接退出
        if (chars[0] < 48 || chars[0] > 57) {
            System.out.println("第一个数值不是数字,不能计算");
            throw new RuntimeException("第一个数值不是数字,不能计算,请重新输入合适的字符串");
        }

        int index=0;
        for (int i = 0; i < chars.length; i++) {
            index = i;
            if (chars[i] >= 48 && chars[i] <= 57) {
                firstString.append(chars[i]);
                continue;
            }
            break;
        }


        //char[i]是运算符,所以从char[i+1]开始判断是否还有内容,没有内容直接退出
        if ((index + 1) >= chars.length) {
            throw new RuntimeException("字符串格式不正确,缺少运算符或者第二个数字");
        }
        for (int j=index+1; j < chars.length; j++) {
            if (chars[j] >= 48 && chars[j] <= 57) {
                secondString.append(chars[j]);
                continue;
            }
            break;
        }


        //判断运算符是不是  + - * / %
        /**
         * Char("42") *　 乘法运算符
         * Char("43") +   加法运算符
         * Char("45") -   减法运算符
         * Char("47") /   除法运算符
         * Char("37") %   求余运算符
         */

        switch (chars[index]){
            case 43:
                result = Integer.valueOf(firstString.toString())+Integer.valueOf(secondString.toString());
                break;
            case 45:
                result = Integer.valueOf(firstString.toString())-Integer.valueOf(secondString.toString());
                break;
            case 42:
                result = Integer.valueOf(firstString.toString())*Integer.valueOf(secondString.toString());
                break;
            case 47:
                result = Integer.valueOf(firstString.toString())/Integer.valueOf(secondString.toString());
                break;
            case 37:
                result = Integer.valueOf(firstString.toString())%Integer.valueOf(secondString.toString());
                break;
            default:
                throw new RuntimeException("运算符输入错误,请重新输入");
        }


        return result;
    }

    public static void main(String[] args) {
//        String str = "5+45";    //9
//        String str = "55/5";    //11
//        String str = "55*12";     //660
//        String str = "55/0";    //java.lang.ArithmeticException: / by zero
//        String str = "55%50";    //5
//        String str = "55=50";  //java.lang.RuntimeException: 运算符输入错误,请重新输入
//        String str = "+234";  //java.lang.RuntimeException: 第一个数值不是数字,不能计算,请重新输入合适的字符串
        String str = Integer.MAX_VALUE+"+2345";   //-2147481304   超过了int最大值,结果明显是个错误的,尽量避免这种方式
        StringCalculate stringCalculate = new StringCalculate();
        int result = stringCalculate.calculate(str);
        System.out.println(result);
    }

}
