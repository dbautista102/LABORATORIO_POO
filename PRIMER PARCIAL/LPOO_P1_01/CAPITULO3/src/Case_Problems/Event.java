/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author bautista
**/

public class Event {
	
	public final static Integer pricePerGuest = 35;
	public final static Integer pricePerLargeEvent = 1750;
	private String eventNumber;
	private Integer numberOfGuestsForEvent;
	private Integer price;
	private boolean grande;	
	public void setEventNumber(String eventNumber) {
		this.eventNumber = eventNumber;
	}

	public void setNumberOfGuestsForEvent(Integer numberOfGuestsForEvent) {
		this.numberOfGuestsForEvent = numberOfGuestsForEvent;
		this.price = this.numberOfGuestsForEvent * pricePerGuest;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getEventNumber() {
		return eventNumber;
	}

	public Integer getNumberOfGuestsForEvent() {
		return numberOfGuestsForEvent;
	}
	
	
	public void setGrande() {
		if(price < pricePerLargeEvent) grande = false;
		else grande = true;
		
	}

	@Override
	public String toString() {
		setGrande() ;
		return "Event [eventNumber=" + eventNumber + ", numberOfGuestsForEvent=" + numberOfGuestsForEvent + " , pricePerGuest = "+ pricePerGuest + ", precio Total="
				+ price + " , La fiesta es grande : "+grande+ " ]";
	}

	

}
