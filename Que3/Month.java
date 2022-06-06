package Que3;

public enum Month {

	JAN{
		@Override
		public void month() {
			// TODO Auto-generated method stub
			System.out.println("This is the 1st Month of the Year");	
		}
	},FEB{
		@Override
		public void month() {
			// TODO Auto-generated method stub
			System.out.println("This is the 2nd Month of the Year");	
		}
	},MAR{
		@Override
		public void month() {
			// TODO Auto-generated method stub
			System.out.println("This is the 3rd Month of the Year");	
		}
	},APR{
		@Override
		public void month() {
			// TODO Auto-generated method stub
			System.out.println("This is the 4th Month of the Year");	
		}
	},MAY{
		@Override
		public void month() {
			// TODO Auto-generated method stub
			System.out.println("This is the 5th Month of the Year");	
		}
	},JUN{
		@Override
		public void month() {
			// TODO Auto-generated method stub
			System.out.println("This is the 6th Month of the Year");	
		}
	},JUL{
		@Override
		public void month() {
			// TODO Auto-generated method stub
			System.out.println("This is the 7th Month of the Year");	
		}
	},AUG{
		@Override
		public void month() {
			// TODO Auto-generated method stub
			System.out.println("This is the 8th Month of the Year");	
		}
	},SEP{
		@Override
		public void month() {
			// TODO Auto-generated method stub
			System.out.println("This is the 9th Month of the Year");	
		}
	},OCT{
		@Override
		public void month() {
			// TODO Auto-generated method stub
			System.out.println("This is the 10th Month of the Year");	
		}
	},NOV{
		@Override
		public void month() {
			// TODO Auto-generated method stub
			System.out.println("This is the 11st Month of the Year");	
		}
	},DEC{
		@Override
		public void month() {
			// TODO Auto-generated method stub
			System.out.println("This is the 12st Month of the Year");		}
	};
	
	
	public void month() {
		System.out.println("This is the 0th Month of the Year ");
	}
}
