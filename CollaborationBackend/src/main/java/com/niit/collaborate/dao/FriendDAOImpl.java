package com.niit.collaborate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collaborate.model.Friend;
@Repository("friendDAO")
@EnableTransactionManagement
public class FriendDAOImpl  implements FriendDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	public FriendDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	@Override
	public boolean createFriend(Friend friend) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Friend getFriend(int friendId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Friend> getFriends() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean approveFriend(Friend friend) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editFriend(int friendid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteFriend(int friendId) {
		// TODO Auto-generated method stub
		return false;
	}
		
	
}