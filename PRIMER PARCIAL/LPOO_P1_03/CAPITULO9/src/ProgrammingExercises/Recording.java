/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

/**
 *
 * @author bautista
 */

public class Recording {
    
	private String Title;
	private String Artist;
	private Integer PlayingTime;
	public Recording(String title, String artist, Integer playingTime) {
		this.Title = title;
		this.Artist = artist;
		this.PlayingTime = playingTime;
	}
	public void setTitle(String title) {
		this.Title = title;
	}
	public void setArtist(String artist) {
		this.Artist = artist;
	}
	public void setplayingTime(Integer playingTime) {
		this.PlayingTime = playingTime;
	}
	public String getTitle() {
		return Title;
		
	}
	public String getArtist() {
		return Artist;
	}
	public Integer getPlayingTime() {
		return PlayingTime;
	}

    
}
