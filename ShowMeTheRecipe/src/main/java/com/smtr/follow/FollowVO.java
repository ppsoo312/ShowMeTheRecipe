package com.smtr.follow;

public class FollowVO {
	private int followNo;
	private int followerMemNo; // 팔로워 memNo를 이용해 member 테이블 접근해서 닉네임가져오기 위해 사용
	private int followingMemNo; // 팔로잉 memNo를 이용해 member 테이블 접근해서 닉네임 가져오기 위해 사용
	
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
