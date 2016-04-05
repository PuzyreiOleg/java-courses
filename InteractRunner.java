import java.util.Scanner;

public class InteractRunner{

    public static void main(String[]args){
        Scanner reader=new Scanner(System.in);
        try{
        Calculator calc = new Calculator();
        int firstint = 0;
        int secondint = 0;
        String first;
        String second;
        String clearresult="no";
        String exit="no";
        String operation;
            while(!exit.equals("yes")){

                if(clearresult.equals("yes")){
                firstint = calc.getResult();
                }else{
                    System.out.println("input first argument");
                    first = reader.next();
                    firstint = Integer.valueOf(first);
                }

        System.out.println("input second argument");
        second = reader.next();
        secondint = Integer.valueOf(second);
        System.out.println("input operation: / * - + ");
        operation =  reader.next();
        switch(operation){
            case "+":
                calc.add(firstint,secondint);
                break;

            case "-":
                calc.sub(firstint,secondint);
                break;

            case "/":
                calc.div(firstint,secondint);
                break;

            case "*":
                calc.mult(firstint,secondint);
                break;

        }
                System.out.println(calc.getResult());
                System.out.println("save result for next calculation? yes/no");
                clearresult = reader.next();
                    if(clearresult.equals("no"))
                        calc.clearResult();

                System.out.println("Quit? yes/no");
                exit = reader.next();

                    }
                }finally{
                reader.close();
        }
            }
        }