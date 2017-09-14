package com.niit.collaborate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collaborate.model.Forum;

public class ForumDAOImpl implements ForumDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	public ForumDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	@Transactional
	@Override
	public boolean createForum(Forum forum) {
		
		// TODO Auto-generated method stub
		try
		{
		sessionFactory.getCurrentSession().saveOrUpdate(forum);
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
	public Forum getForum(int forumId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Forum> getForums() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean approveForum(Forum forum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editForum(int forumid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteForum(int forumId) {
		// TODO Auto-generated method stub
		return false;
	}
	
}