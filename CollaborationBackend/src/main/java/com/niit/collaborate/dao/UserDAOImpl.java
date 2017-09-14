package com.niit.collaborate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.collaborate.model.User;


	@Repository("UserDAO")
	@EnableTransactionManagement
	public class UserDAOImpl  implements UserDAO
	{
		@Autowired
		SessionFactory sessionFactory;
		
		public UserDAOImpl(SessionFactory sessionFactory)
		{
			this.sessionFactory=sessionFactory;
}

		@Override
		public boolean createUser(User user) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public User getUser(int userId) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<User> getUsers() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean approveUser(User user) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean editUser(int userid) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean deleteUser(int userId) {
			// TODO Auto-generated method stub
			return false;
		}
}