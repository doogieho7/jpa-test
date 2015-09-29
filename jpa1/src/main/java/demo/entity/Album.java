package demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Album { 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;	
	private String name;		//album name
	
	@ManyToOne(targetEntity=Category.class, fetch=FetchType.EAGER)
	private Category category;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="album_id")
	private List<Video> videoList;
	
	public Album() {}
	
	public Album(String name) {
		this.name = name; 
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	public void addVideo(Video video) {
		if (videoList == null)
			videoList = new ArrayList<Video>();
		this.videoList.add(video);
	}	
	
	public List<Video> getVideoList() {
		return videoList;
	}

	public void setVideoList(List<Video> videoList) {
		this.videoList = videoList;
	}

	@Override
	public String toString() {
		return "[" + id + "] name = " + name + "\nCategory: " + this.category.toString();
	}	
}
