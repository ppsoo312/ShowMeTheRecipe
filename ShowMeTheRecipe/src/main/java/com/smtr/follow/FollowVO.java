package com.smtr.follow;

public class FollowVO {
	private int followNo;
	private int followerMemNo; // 
	private int followingMemNo; // 
	
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
