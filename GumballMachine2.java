public class GumballMachine2 extends superGumball
{

  

    public GumballMachine2( int size )
    {
        // initialise instance variables
    		super(size);
    }

    
    public void insertQuarter(int coin)
    {
    		// only when the coin is a quarter and less than 2 coins, accept the coin
        if ( coin == 25 && this.coin_sum + coin <= 50)
        		this.coin_sum += coin;
        // else will not accept the coin
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
	    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
	    		}
	    	}
	    	else 
	    	{
	    		System.out.println( "Please insert a quarter" ) ;
	    	}        
    }
}

