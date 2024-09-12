package com.kodbook.services;
import java.util.List;
import com.kodbook.entities.Post;
public interface PostService {
	Post getPost(Long id);
	void updatePost(Post post);
	List<Post> fetchAllPosts();
	void createPost(Post post);
}

