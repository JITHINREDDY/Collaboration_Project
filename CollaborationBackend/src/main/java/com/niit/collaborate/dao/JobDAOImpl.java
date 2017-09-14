package com.niit.collaborate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.collaborate.model.Job;

@Repository("jobDAO")
@EnableTransactionManagement 
public class JobDAOImpl implements JobDAO
{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public JobDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	
	}

	@Override
	public boolean createJob(Job job) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Job getJob(int jobId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Job> getJobs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean approveJob(Job job) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editJob(int jobid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteJob(int jobId) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}