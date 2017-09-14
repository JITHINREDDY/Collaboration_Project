package com.niit.collaborate.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ForumComment
{

@Id
private int forumId;
private int Id,userId;
private String comment,username;
private Date CommentDate;
public int getForumId() {
	return forumId;
}
public void setForumId(int forumId) {
	this.forumId = forumId;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public Date getCommentDate() {
	return CommentDate;
}
public void setCommentDate(Date commentDate) {
	CommentDate = commentDate;
}

















}