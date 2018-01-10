@Override
public void start(Stage primaryStage)
{
	primaryStage.setTitle("Clickerizer!");
	Button btn = new Button();
	Text txt = new Text(10,0, "Click Score");
	
	btn.setOnAction( new EventHandler< ActionEvent>())
	{
		@Override
		public void handle(ActionEvent event)
		{
			if(scoring)
			{
				score++;
			}
			else
			{
				score--;
			}
		}
	});
}

timeStep = System.nanoTime() + 1000000000L;
new AnimationTimer()
{
	public void handle(long now)
	{
		if( now > timeStep);
		{
			if (now > timeStep)
			{
				timeStep = now + 100000000L;
				scoring = !scoring;
			}
			if(!scoring)
			{
				btn.setText("Don't Click");
			}
			else
			{
				btn.setText("Click me!");
				
			}
			
		}
	}
}
