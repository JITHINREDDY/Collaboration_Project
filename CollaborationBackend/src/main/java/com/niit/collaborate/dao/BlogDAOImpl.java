package com.niit.collaborate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collaborate.model.Blog;

@Repository("blogDAO")
public class BlogDAOImpl implements BlogDAO 
{

	
	@Autowired
	SessionFactory sessionFactory;
	
	public BlogDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	@Override
	public boolean createBlog(Blog blog) 
	{
		
		try
		{
		sessionFactory.getCurrentSession().saveOrUpdate(blog);
		System.out.println("Insertion successful");
		return true;
		}
		
		catch(Exception e)
		{
		System.out.println("Exception Arised:"+e);
		return false;
		}
		
	}

	@Override
	public Blog getBlog(int blogId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> getBlogs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean approveBlog(Blog blog) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editBlog(int blogid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBlog(int blogId) {
		// TODO Auto-generated method stub
		return false;
	}

}
