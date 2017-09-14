package com.niit.collaborate.dao;

import java.util.List;

import com.niit.collaborate.model.BlogComment;

public interface BlogCommentDAO {

	public boolean createBlogComment(BlogComment blogcomment);
	public BlogComment getBlogComment(int blogcommentId);
	public List<BlogComment> getBlogComments();
	public boolean approveBlogComment(BlogComment blogcomment);
	public boolean editBlogComment(int blogcommentid);
	public boolean deleteBlogComment(int blogcommentId);
		
	
}