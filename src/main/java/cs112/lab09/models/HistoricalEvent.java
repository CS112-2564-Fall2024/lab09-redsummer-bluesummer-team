package cs112.lab09.models;

public class HistoricalEvent {
	private String imageName;
	private String location;
	private String description;
	private Date eventDay;

	public HistoricalEvent(String imageName, String location, String description, Date eventDay) {
		this.imageName = imageName;
		this.location = location;
		this.description = description;
		this.eventDay = eventDay;
	}

	public String getImageName() {
		return imageName;
	}

	public String getLocation() {
		return location;
	}

	public String getDescription() {
		return description;
	}

	public Date getEventDay() {
		return eventDay;
	}

	@Override
	public String toString() {
		return "On " + eventDay + " in " + location + ": " + description;
	}
}