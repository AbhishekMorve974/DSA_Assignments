package Assignment3_Q2;



import java.util.Stack;


public class Evaluation {

    // ---------- Evaluate Postfix ----------
    public static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = exp.split("\\s+");  // supports multi-digit numbers

        for (String token : tokens) {
            if (token.matches("-?\\d+")) {  // check if number
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                    case "%": stack.push(a % b); break;
                    default: System.out.println("Invalid Operator!");
                }
            }
        }
        return stack.pop();
    }

    // ---------- Evaluate Prefix ----------
    public static int evaluatePrefix(String exp) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = exp.trim().split("\\s+");

        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];
            if (token.matches("-?\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int a = stack.pop();
                int b = stack.pop();
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                    case "%": stack.push(a % b); break;
                    default: System.out.println("Invalid Operator!");
                }
            }
        }
        return stack.pop();
    }

    
}


