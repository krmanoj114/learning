public class MyNewClass {

        public static void main(String args[]) {
            MyFunctionalInterface sum = (a, b) -> a + b;
            MyFunctionalInterface mul = (a, b) -> a * b;
            MyFunctionalInterface div = (a, b) -> a / b;
            System.out.println("Result sum: "+sum.addMethod(12, 100));
            System.out.println("Result mul: "+mul.addMethod(12, 100));
            System.out.println("Result div: "+div.addMethod(12, 10));

        }
    }
