package Stack_dataStructure.Stack_Problems.Expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Ecpression {

    private final List<Character> leftBracket = Arrays.asList('(','{','[');
    private final List<Character> rightBracket = Arrays.asList(')','}',']');

    public boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()){
            if(isLeftBracket(c))
                stack.push(c);
            if (isRightBracket(c)){
                if(stack.isEmpty()){
                    return false;
                }
                var top = stack.pop();
                if(bracketMatching(top, c)){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    private boolean isLeftBracket(char ch){
        return leftBracket.contains(ch);
    }

    private boolean isRightBracket(char ch){
        return rightBracket.contains(ch);
    }
    private boolean bracketMatching(char left, char right){
        return leftBracket.indexOf(left) == rightBracket.indexOf(right);
    }
}
