package demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import demo.entity.Album;
import demo.entity.Category;
import demo.entity.Member;
import demo.entity.Video;
import demo.repository.AlbumRepository;
import demo.repository.CategoryRepository;
import demo.repository.MemberRepository;

@EntityScan(basePackages="demo.entity")
@EnableJpaRepositories(basePackages="demo.repository")
@SpringBootApplication
public class Jpa1Application implements CommandLineRunner {
	@Autowired
	MemberRepository memberRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	AlbumRepository albumRepository;

    public static void main(String[] args) {
        SpringApplication.run(Jpa1Application.class, args);
    }
    
    public void testMember() {
		memberRepository.save(new Member("a", 10));
		memberRepository.save(new Member("b", 15));
		memberRepository.save(new Member("c", 10));
		memberRepository.save(new Member("a", 5));
		
		Iterable<Member> list1 = memberRepository.findAll();
		
		System.out.println("findAll() Method");
		for (Member m : list1) {
			System.out.println(m.toString());
		}
		
		System.out.println("findByNameAndAgeLessThan() Mehtod");
		List<Member> list2 = memberRepository.findByNameAndAgeLessThan("a", 10);
		for (Member m : list2) {
			System.out.println(m.toString());
		}    	
    }
    
    public void testAlbumAndVide() {
		Category ca1 = categoryRepository.findOne(1);
		
		Video v1 = new Video("video1");
		Video v2 = new Video("video1");
		
		Album a1 = new Album("album1");
		a1.setCategory(ca1);
		a1.addVideo(v1);
		a1.addVideo(v2);
		
		albumRepository.save(a1);
    }

	@Override
	public void run(String... args) throws Exception {

		Category ca2 = categoryRepository.findOne(2);
		System.out.println("Category: " + ca2.toString());
		
		Album ab1 = albumRepository.findOne((long)1);
		System.out.println("Album: " + ab1.toString());
/*		
		for (Video v : ab1.getVideoList()) {
			System.out.println("Video: " + v.toString());
		}
*/
	}
}
