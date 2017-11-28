public class Step1 {
    public static void main(String[] args){
        try{
            String str = "3．14";
            double value = Double.parseDouble(str);
        }catch (NumberFormatException e) {
            System.out.println(e + "が発生");
            System.out.println(e.getMessage());
        }
    }
}
