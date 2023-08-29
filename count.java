class Time
{
	public static void main(String args[])
	{
		int starting_year=2002;
		int current_year =2023;
		int year=current_year-starting_year;
		int days=365;
		int total_days=days*year;
		int hours=24;
		int total_hours=hours*total_days;
		int minutes=24*60;
		int total_minutes=minutes*total_days;
		int seconds=24*60*60;
		int total_seconds=seconds*total_days;
		System.out.println(total_days);
		System.out.println(total_hours);
		System.out.println(total_minutes);
		System.out.println(total_seconds);
	}
}