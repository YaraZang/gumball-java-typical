
abstract class superGumball {
	
	int num_gumballs;
	int coin_sum;
	
	
	public superGumball( int size ) {
		
		this.num_gumballs = size;
		this.coin_sum = 0;
        
	}
	
	public abstract void insertQuarter(int coin);
	
	public abstract void turnCrank();
	
	

}
