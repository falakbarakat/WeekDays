package se.lexicon.WeekDays;

public enum WeekDays {
	monday(8),
	tuesday(7),
	wednwsday(7),
	thursday(7),
	friday(8),
	satarday(0) {
		
		        public void printInFo() { System.out.println("closed");};
		
	            }, 
	sunday(0){
		      public void printInFo() {System.out.println("closed");};
		
	         };
	
	private int startinghour;
	
	private WeekDays(int startinghour) {
		this.startinghour=startinghour;
			}
	
	
	public void printInFo() {
		System.out.println(this + ": opnning hours:\t"+ startinghour+" - "+(startinghour+8));
	}
	}
	
	
   
