package sampleprograms;

class Indentation {

    public static void main(String args[]) {
        System.out.println("Hello World");
        String input = "public class PrettyPrint { public static void main(String args[]) { System.out.println(\"Hello World\"); String input = \"This is a sample code\"; System.out.println(Indent(input)); } public static String Indent(String input) { return \"Indented: \" + input; } }";
        System.out.println(Indent(input));

    }

    public static String Indent(String input) {
        StringBuilder indentedOutput = new StringBuilder();
        //Code goes here
   
        for (int i = 0; i < input.length(); i++) {
         
             indentedOutput.append(input.charAt(i));
            if(input.charAt(i)=='{')
            {
                indentedOutput.append("\n"+ " "+ " "+" "+" ");
                if(input.charAt(i+1)=='{')
                    indentedOutput.append("\n"+" "+" "+" "+" "+" "+" "+" "+" ");
            } 
            else if(input.charAt(i)==';')
            {
                indentedOutput.append("\n" + " "+" " + " "+" "+" "+" "+" "+" ");
               
            } 
            else if(input.charAt(i)=='}')
            {
                indentedOutput.append("\n" +" "+" "+" "+" ");
            }
        } 
        return indentedOutput.toString();
    }
}

