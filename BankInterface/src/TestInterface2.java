class TestInterface2{  
public static void main(String[] args){  
Bank b=new SBI(); // can't instantiated if I change to abstract class ( to implement OWN method other than the interface)
SBI test = new SBI();// must instantiated to access the method(which isnt available in the interface)
System.out.println("ROI: "+b.rateOfInterest() );
System.out.println(b.justoutput());
System.out.println(test.justout());

}}  