package app.entites;

import java.time.LocalDateTime;
import java.util.Objects;

public class Note {
	
	private static Integer count = 0;

	private Integer id;
	private String title;
	private String description;
	private LocalDateTime timeStamp;
	private Boolean isCompleted;

	public Note() {
		this.id = count++;
		this.isCompleted = false;
		this.timeStamp = LocalDateTime.now();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Boolean getIsCompleted() {
		return isCompleted;
	}

	public void setIsCompleted(Boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(description, id, isCompleted, timeStamp, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Note other = (Note) obj;
		return Objects.equals(description, other.description) && Objects.equals(id, other.id)
				&& Objects.equals(isCompleted, other.isCompleted) && Objects.equals(timeStamp, other.timeStamp)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Note [id=" + id + ", title=" + title + ", description=" + description + ", timeStamp=" + timeStamp
				+ ", isCompleted=" + isCompleted + "]";
	}


	public static void main(String[] args) {
		LocalDateTime currTimeStamp = LocalDateTime.now();
		System.out.println(currTimeStamp);
	}

}
