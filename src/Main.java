import java.util.Scanner;

public class Main {

    public static void main(String[] args) {









        Scanner scan = new Scanner(System.in);
        boolean out=true;




        while(out){
            System.out.println("Register child");
            System.out.println("Manage Ticket");
            System.out.println("Exit park");
            System.out.println("Exit");

            String s = scan.nextLine();
            s=s.toLowerCase();
            switch (s){
                case "register":
                    break;

                case "manageticket":
                    System.out.println("Add ride");
                    System.out.println("Remove ride");
                    s = scan.nextLine();
                    s=s.toLowerCase();
                    switch (s){
                        case "add":
                            break;

                        case "remove":
                            break;
                    }
                    break;

                case "exitpark":
                    break;

                case "exit":
                    out=false;
                    break;

            }

        }

    }
}
