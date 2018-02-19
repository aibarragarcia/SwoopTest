package test;

public class Test {

    private final long n1;
    private final long n2;
    private long Total;

    public Test(long n1, long n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public long getSum() {
    	 	Total = this.n1 + this.n2;
        return Total;
    }
    
    
    
  
}
