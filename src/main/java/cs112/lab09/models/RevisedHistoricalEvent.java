package cs112.lab09.models;

import javafx.scene.image.Image;

public class RevisedHistoricalEvent extends HistoricalEvent {
	private String revisedDescription;
	private String citation;

	public RevisedHistoricalEvent(String[] data) {
		super(data[0], data[1], data[2], new Date(data[3]));
		this.revisedDescription = data[4];
		this.citation = data[5];
	}

	public String getRevisedDescription() {
		return revisedDescription;
	}

	public String getCitation() {
		return citation;
	}

	@Override
	public String toString() {
		return super.toString() + "\nRevised: " + revisedDescription + "\nSource: " + citation;
	}
}