
public class ComicKeeper {

	public ComicKeeper()
	{
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
		// TODO learn what the hecky is going on here
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Application();
            }
        });

	}

}
