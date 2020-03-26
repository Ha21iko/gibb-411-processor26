import java.io.File;

public class main {
    public static void main(String[] args) {
        if(args.length >= 1){
            File file = new File(args[0]);
            if(file.exists()){

            }else{
                System.out.println("Error: File not found.");
            }
        }else{
            System.out.println("Error: Please specify a file path.");
        }
    }
}
