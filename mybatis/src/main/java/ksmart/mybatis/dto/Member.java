package ksmart.mybatis.dto;

import java.util.List;

public class Member {
	private String MemberId;
	private String MemberPw;
	private String MemberLevel;
	private String MemberEmail;
	private String MemberName;
	private String MemberAddr;
	private String MemberRegDate;
	
	//DTO 객체 참조 
	private MemberLevel levelInfo;  
	
	//1:N 관계
	private List<Goods> goodsList;
	
	public List<Goods> getGoodsList() {
		return goodsList;
	}
	public void setGoodsList(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}
	
	public MemberLevel getLevelInfo() {
		return levelInfo;
	}
	public void setLevelInfo(MemberLevel levelInfo) {
		this.levelInfo = levelInfo;
	}
	public String getMemberId() {
		return MemberId;
	}
	public void setMemberId(String memberId) {
		MemberId = memberId;
	}
	public String getMemberPw() {
		return MemberPw;
	}
	public void setMemberPw(String memberPw) {
		MemberPw = memberPw;
	}
	public String getMemberLevel() {
		return MemberLevel;
	}
	public void setMemberLevel(String memberLevel) {
		MemberLevel = memberLevel;
	}
	public String getMemberEmail() {
		return MemberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		MemberEmail = memberEmail;
	}
	public String getMemberName() {
		return MemberName;
	}
	public void setMemberName(String memberName) {
		MemberName = memberName;
	}
	public String getMemberAddr() {
		return MemberAddr;
	}
	public void setMemberAddr(String memberAddr) {
		MemberAddr = memberAddr;
	}
	public String getMemberRegDate() {
		return MemberRegDate;
	}
	public void setMemberRegDate(String memberRegDate) {
		MemberRegDate = memberRegDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Member [MemberId=");
		builder.append(MemberId);
		builder.append(", MemberPw=");
		builder.append(MemberPw);
		builder.append(", MemberLevel=");
		builder.append(MemberLevel);
		builder.append(", MemberEmail=");
		builder.append(MemberEmail);
		builder.append(", MemberName=");
		builder.append(MemberName);
		builder.append(", MemberAddr=");
		builder.append(MemberAddr);
		builder.append(", MemberRegDate=");
		builder.append(MemberRegDate);
		builder.append(", levelInfo=");
		builder.append(levelInfo);
		builder.append(", goodsList=");
		builder.append(goodsList);
		builder.append("]");
		return builder.toString();
	}
	
}
