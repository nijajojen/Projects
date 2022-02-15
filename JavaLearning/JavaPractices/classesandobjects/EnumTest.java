package classesandobjects;

public class EnumTest {
    Flowers flower;
    
    public EnumTest(Flowers flower) {
        this.flower = flower;
    }
    public void tellItLikeItIs() {
        switch (flower) {
            case JASMINE:
                System.out.println("Jasmine are bad.");
                break;
                    
            case ROSE:
                System.out.println("Rose are better.");
                break;
                         
            case LILLY: 
                System.out.println("Lilly are best.");
                break;
                        
            default:
                System.out.println("flowers days are so-so.");
                break;
        }
    }
    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Flowers.LILLY);
        firstDay.tellItLikeItIs();
        EnumTest thirdDay = new EnumTest(Flowers.ROSE);
        thirdDay.tellItLikeItIs();
        EnumTest fifthDay = new EnumTest(Flowers.JASMINE);
        fifthDay.tellItLikeItIs();
        EnumTest sixthDay = new EnumTest(Flowers.LILLY);
        sixthDay.tellItLikeItIs();
        EnumTest seventhDay = new EnumTest(Flowers.ROSE);
        seventhDay.tellItLikeItIs();
    }
}