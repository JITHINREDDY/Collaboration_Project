package com.niit.collaborate.dao;

import java.util.List;

import com.niit.collaborate.model.ForumComment;

public interface ForumCommentDAO {


	public boolean createForumComment(ForumComment forumcomment);
	public ForumComment getForumComment(int forumcommentId);
	public List<ForumComment> getForumComments();
	public boolean approveForumComment(ForumComment forumcomment);
	public boolean editForumComment(int forumcommentid);
	public boolean deleteForumComment(int forumcommentId);
		
}