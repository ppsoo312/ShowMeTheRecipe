package com.smtr.follow;

public class FollowVO {
	private int followNo; // 팔로워 시퀀스
	private int followerMemNo; // 팔로워 아이디 - 주체를 팔로우하는사람
	private int followingMemNo; // 팔로잉 아이디 - 주체가 팔로우하는사람
	
	public FollowVO() {
		
	}
	public FollowVO(int followNo, int followerMemNo, int followingMemNo) {
		this.followNo = followNo;
		this.followerMemNo = followerMemNo;
		this.followingMemNo = followingMemNo;
	}

	public int getFollowNo() {
		return followNo;
	}

	public void setFollowNo(int followNo) {
		this.followNo = followNo;
	}

	public int getFollowerMemNo() {
		return followerMemNo;
	}

	public void setFollowerMemNo(int followerMemNo) {
		this.followerMemNo = followerMemNo;
	}

	public int getFollowingMemNo() {
		return followingMemNo;
	}

	public void setFollowingMemNo(int followingMemNo) {
		this.followingMemNo = followingMemNo;
	}
}
