package edx.exams;

public class Shoes {
   
	public Shoes() {

    }

	public static void main(String[] args) {
    	Shoes s = new Shoes();
        s.goodShoes();
        s.badShoes();
    }
    
    public String goodShoes() {
    	return "I really like your shoes!";
    }
    
    public String badShoes() {
    	return "What are THOSE?";
    }


}
