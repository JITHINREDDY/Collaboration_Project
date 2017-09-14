package com.niit.collaborate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collaborate.model.ForumComment;

@Repository("forumcommentDAO")
@EnableTransactionManagement
public class ForumCommentDAOImpl implements ForumCommentDAO 
{

	@Autowired
	SessionFactory sessionFactory;
	
	public ForumCommentDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	@Transactional	
	@Override
	public boolean createForumComment(ForumComment forumcomment) 
	{
	
		// TODO Auto-generated method stub
		
		
		try
		{
		sessionFactory.getCurrentSession().saveOrUpdate(forumcomment);
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
	public ForumComment getForumComment(int forumcommentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ForumComment> getForumComments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean approveForumComment(ForumComment forumcomment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editForumComment(int forumcommentid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteForumComment(int forumcommentId) {
		// TODO Auto-generated method stub
		return false;
	}
	
		
	
}