package cs112.lab09.models;

public class Date {
	private String month;
	private int day;
	private int year;

	public Date(String date) {
		String[] parts = date.split("-");
		this.month = parts[0];
		this.day = Integer.parseInt(parts[1]);
		this.year = Integer.parseInt(parts[2]);
	}

	@Override
	public String toString() {
		return month + "/" + day + "/" + year;
	}
}