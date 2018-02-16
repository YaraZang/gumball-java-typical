public class GumballMachine3 extends superGumball
{

    public GumballMachine3( int size )
    {
        // initialise instance variables
    		super(size);
    }

    
    public void insertQuarter(int coin)
    {
    		// accept all kinds of coins. 
    		// But if the coins value exceed the value needed (50 - sum), will not accept the value.
        if ( this.coin_sum + coin <= 50 )
        		this.coin_sum += coin;
    }
    
    public void turnCrank()
    {
	    	if ( this.coin_sum == 50 )
	    	{
	    		if ( this.num_gumballs > 0 )
	    		{
	    			this.num_gumballs-- ;
	    			this.coin_sum = 0;
	    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
	    		}
	    		else
	    		{
	    			System.out.println( "No More Gumballs!  Sorry, can't return your coin." ) ;
	    		}
	    	}
	    	else 
	    	{
	    		System.out.println( "Please insert some coins, " + (50 - this.coin_sum) +" cents needed" ) ;
	    	}        
    }
}


