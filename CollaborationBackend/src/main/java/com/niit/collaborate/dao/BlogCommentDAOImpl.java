package com.niit.collaborate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.collaborate.model.BlogComment;

@Repository("blogcommentDAO")
@EnableTransactionManagement
public class BlogCommentDAOImpl implements BlogCommentDAO
{

	@Autowired
	SessionFactory sessionFactory;
	
	public BlogCommentDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	@Override
	public boolean createBlogComment(BlogComment blogcomment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BlogComment getBlogComment(int blogcommentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BlogComment> getBlogComments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean approveBlogComment(BlogComment blogcomment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editBlogComment(int blogcommentid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBlogComment(int blogcommentId) {
		// TODO Auto-generated method stub
		return false;
	}	
	
	
	
}