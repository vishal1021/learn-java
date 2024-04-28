public class nested {
    public static void main(String[] args) {
        int weakday = 1;
        switch(weakday){
                case 1: System.out.println("sunday");
               int x= 1;
               switch (x) {
                case 1:System.out.println("Nested Switch");
                    
                    break;
               
                default: System.out.println("no case met in case  ");
                    break;
               }
                case 2: System.out.println("Monday");
                break;
                case 3: System.out.println("Tuesday");
                break;
                case 4: System.out.println("Wednesday");
                break;
                case 5: System.out.println("Thursday");
                break;
                case 6: System.out.println("Friday");
                break;
                default: System.out.println("saturday");
                
        }
    }
}
