package com.smtr.member;

public class MemberVO {
	private int memNo; // 회원 시퀀스
	private String email; // 이메일 -> 아이디로 사용
	private String password; // 비밀번호
	private String nickName; // 닉네임
	private String photoPath; // 프로필사진 경로
	private int kind; // 0-카카오, 1-네이버, 2-구글, 3-페이스북
	
	public MemberVO(int memNo, String email, String password,
			String nickName, String photoPath, int kind) {
		this.memNo = memNo;
		this.email = email;
		this.password = password;
		this.nickName = nickName;
		this.photoPath = photoPath;
		this.kind = kind;
	}

	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}
}
