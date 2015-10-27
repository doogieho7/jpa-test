ckage com.samsung.spdg.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="album")
public class Album {
    @Id
    @Column(length=20, columnDefinition = "BIGINT")
    private Long id;    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="categoryId")
    private Category category;
    private Integer sets;
    @Column(length=255)
    private String albumName;
    @Lob
    @Column(columnDefinition="TEXT")
    private String desc;
    @Column(length=1000)
    private String albumUrl;
    @Column(length=1000)
    private String picUrl;
    @Column(length=1000)
    private String posterPicUrl;
    @Column(length=255)
    private String companyName;
    @Column(length=255)
    private String keyword;
    @Column(length=255)
    private String subTitle;
    private Float score;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
    private Integer timeLength;    
    @OneToMany(mappedBy="album")
    List<Video> videos = new ArrayList<Video>();
    @ManyToMany
    @JoinTable(name="album_three_ctg_relation",
        joinColumns = @JoinColumn(name="album_id", referencedColumnName="id"),
        inverseJoinColumns = @JoinColumn(name="three_ctg_id", referencedColumnName="id"))
    List<ThreeCategory> threeCtgs = new ArrayList<ThreeCategory>();

    public Album() {}
 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getSets() {
        return sets;
    }

    public void setSets(Integer sets) {
        this.sets = sets;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAlbumUrl() {
        return albumUrl;
    }

    public void setAlbumUrl(String albumUrl) {
        this.albumUrl = albumUrl;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPosterPicUrl() {
        return posterPicUrl;
    }

    public void setPosterPicUrl(String posterPicUrl) {
        this.posterPicUrl = posterPicUrl;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getTimeLength() {
        return timeLength;
    }

    public void setTimeLength(Integer timeLength) {
        this.timeLength = timeLength;
    }
    
    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public List<ThreeCategory> getThreeCtgs() {
        return threeCtgs;
    }

    public void setThreeCtgs(List<ThreeCategory> threeCtgs) {
        this.threeCtgs = threeCtgs;
    }   
}

