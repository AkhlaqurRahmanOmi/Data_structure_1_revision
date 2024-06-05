package Stack_dataStructure.Stack_Problems.Expression;

import java.beans.Expression;

public class Main {
    public static void main(String[] args) {
        String str = "(1+2";
        Ecpression exp = new Ecpression();
        System.out.println(exp.isBalanced(str));
    }
}
