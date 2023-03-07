public class cla {
    public static void main(String args[]){
        if(args[0].equals("-u")){
                System.out.println(args[1].toUpperCase());
        }       
        else if(args[0].equals("-l")){
            System.out.println(args[1].toLowerCase());
        }
        else if(args[0].equals("-e")){
            System.out.println(args[1]);
        }
        else{
            System.out.println("Please provide proper option. [-u , -l , -e]");
        }
        
    }
}
