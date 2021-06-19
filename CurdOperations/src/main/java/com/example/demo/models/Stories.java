package com.example.demo.models;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_story", schema="users")
public class Stories {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long storyNo;
		private String storyName;
		private String storyGenre;
	
	public long getStoryNo() {
		return storyNo;
	}
	public void setStoryNo(long storyNo) {
		this.storyNo = storyNo;
	}
	public String getStoryName() {
		return storyName;
	}
	public void setStoryName(String storyName) {
		this.storyName = storyName;
	}
	public String getStoryGenre() {
		return storyGenre;
	}
	public void setStoryGenre(String storyGenre) {
		this.storyGenre = storyGenre;
	}
	@Override
	public String toString() {
		return "Stories [storyNo=" + storyNo + ", storyName=" + storyName + ", storyGenre=" + storyGenre + "]";
	}

}
