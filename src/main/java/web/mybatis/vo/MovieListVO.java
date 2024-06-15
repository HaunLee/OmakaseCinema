package web.mybatis.vo;

public class MovieListVO {
	private String movie_code,// 
	movieCd,// 영화코드
	movieNm,//영화명(국문)
	movieNmE,// 영화명(영문)
	movieNmOg,// 영화명(원문)
	prdtYear,// 제작연도
	showTm,// 상영시간
	openDt,// 개봉연도
	prdtStatNm,// 제작상태명
	typeNm,// 영화유형명
	nations,// 제작국가
	nationNm,// 제작국가명
	genreNm,// 장르명
	directors,// 감독
	peopleNm,// 배우명
	peopleNmEn,// 배우명(영문)
	actors,// 배우
	cast,// 배우명
	castEn,// 배우명(영문)
	showTypes,// 상영형태 구분
	showTypeGroupNm,// 상영형태 구분
	showTypeNm,// 상영형태명
	audits,// 심의정보
	auditNo,// 심의번호
	watchGradeNm,// 관람등급 명칭
	companys,// 참여 영화사
	companyCd,// 관람등급 명칭
	companyNm,// 참여 영화사 코드
	companyNmEn,// 참여 영화사명(영문)
	companyPartNm,// 참여 영화사 분야명
	staffs,// 스텝
	staffRoleNm;// 스텝역할명
	
	public MovieListVO() {}

	public MovieListVO(String movie_code, String movieCd, String movieNm, String movieNmE, String movieNmOg,
			String prdtYear, String showTm, String openDt, String prdtStatNm, String typeNm, String nations,
			String nationNm, String genreNm, String directors, String peopleNm, String peopleNmEn, String actors,
			String cast, String castEn, String showTypes, String showTypeGroupNm, String showTypeNm, String audits,
			String auditNo, String watchGradeNm, String companys, String companyCd, String companyNm,
			String companyNmEn, String companyPartNm, String staffs, String staffRoleNm) {
		super();
		this.movie_code = movie_code;
		this.movieCd = movieCd;
		this.movieNm = movieNm;
		this.movieNmE = movieNmE;
		this.movieNmOg = movieNmOg;
		this.prdtYear = prdtYear;
		this.showTm = showTm;
		this.openDt = openDt;
		this.prdtStatNm = prdtStatNm;
		this.typeNm = typeNm;
		this.nations = nations;
		this.nationNm = nationNm;
		this.genreNm = genreNm;
		this.directors = directors;
		this.peopleNm = peopleNm;
		this.peopleNmEn = peopleNmEn;
		this.actors = actors;
		this.cast = cast;
		this.castEn = castEn;
		this.showTypes = showTypes;
		this.showTypeGroupNm = showTypeGroupNm;
		this.showTypeNm = showTypeNm;
		this.audits = audits;
		this.auditNo = auditNo;
		this.watchGradeNm = watchGradeNm;
		this.companys = companys;
		this.companyCd = companyCd;
		this.companyNm = companyNm;
		this.companyNmEn = companyNmEn;
		this.companyPartNm = companyPartNm;
		this.staffs = staffs;
		this.staffRoleNm = staffRoleNm;
	}

	public String getMovie_code() {
		return movie_code;
	}

	public void setMovie_code(String movie_code) {
		this.movie_code = movie_code;
	}

	public String getMovieCd() {
		return movieCd;
	}

	public void setMovieCd(String movieCd) {
		this.movieCd = movieCd;
	}

	public String getMovieNm() {
		return movieNm;
	}

	public void setMovieNm(String movieNm) {
		this.movieNm = movieNm;
	}

	public String getMovieNmE() {
		return movieNmE;
	}

	public void setMovieNmE(String movieNmE) {
		this.movieNmE = movieNmE;
	}

	public String getMovieNmOg() {
		return movieNmOg;
	}

	public void setMovieNmOg(String movieNmOg) {
		this.movieNmOg = movieNmOg;
	}

	public String getPrdtYear() {
		return prdtYear;
	}

	public void setPrdtYear(String prdtYear) {
		this.prdtYear = prdtYear;
	}

	public String getShowTm() {
		return showTm;
	}

	public void setShowTm(String showTm) {
		this.showTm = showTm;
	}

	public String getOpenDt() {
		return openDt;
	}

	public void setOpenDt(String openDt) {
		this.openDt = openDt;
	}

	public String getPrdtStatNm() {
		return prdtStatNm;
	}

	public void setPrdtStatNm(String prdtStatNm) {
		this.prdtStatNm = prdtStatNm;
	}

	public String getTypeNm() {
		return typeNm;
	}

	public void setTypeNm(String typeNm) {
		this.typeNm = typeNm;
	}

	public String getNations() {
		return nations;
	}

	public void setNations(String nations) {
		this.nations = nations;
	}

	public String getNationNm() {
		return nationNm;
	}

	public void setNationNm(String nationNm) {
		this.nationNm = nationNm;
	}

	public String getGenreNm() {
		return genreNm;
	}

	public void setGenreNm(String genreNm) {
		this.genreNm = genreNm;
	}

	public String getDirectors() {
		return directors;
	}

	public void setDirectors(String directors) {
		this.directors = directors;
	}

	public String getPeopleNm() {
		return peopleNm;
	}

	public void setPeopleNm(String peopleNm) {
		this.peopleNm = peopleNm;
	}

	public String getPeopleNmEn() {
		return peopleNmEn;
	}

	public void setPeopleNmEn(String peopleNmEn) {
		this.peopleNmEn = peopleNmEn;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getCastEn() {
		return castEn;
	}

	public void setCastEn(String castEn) {
		this.castEn = castEn;
	}

	public String getShowTypes() {
		return showTypes;
	}

	public void setShowTypes(String showTypes) {
		this.showTypes = showTypes;
	}

	public String getShowTypeGroupNm() {
		return showTypeGroupNm;
	}

	public void setShowTypeGroupNm(String showTypeGroupNm) {
		this.showTypeGroupNm = showTypeGroupNm;
	}

	public String getShowTypeNm() {
		return showTypeNm;
	}

	public void setShowTypeNm(String showTypeNm) {
		this.showTypeNm = showTypeNm;
	}

	public String getAudits() {
		return audits;
	}

	public void setAudits(String audits) {
		this.audits = audits;
	}

	public String getAuditNo() {
		return auditNo;
	}

	public void setAuditNo(String auditNo) {
		this.auditNo = auditNo;
	}

	public String getWatchGradeNm() {
		return watchGradeNm;
	}

	public void setWatchGradeNm(String watchGradeNm) {
		this.watchGradeNm = watchGradeNm;
	}

	public String getCompanys() {
		return companys;
	}

	public void setCompanys(String companys) {
		this.companys = companys;
	}

	public String getCompanyCd() {
		return companyCd;
	}

	public void setCompanyCd(String companyCd) {
		this.companyCd = companyCd;
	}

	public String getCompanyNm() {
		return companyNm;
	}

	public void setCompanyNm(String companyNm) {
		this.companyNm = companyNm;
	}

	public String getCompanyNmEn() {
		return companyNmEn;
	}

	public void setCompanyNmEn(String companyNmEn) {
		this.companyNmEn = companyNmEn;
	}

	public String getCompanyPartNm() {
		return companyPartNm;
	}

	public void setCompanyPartNm(String companyPartNm) {
		this.companyPartNm = companyPartNm;
	}

	public String getStaffs() {
		return staffs;
	}

	public void setStaffs(String staffs) {
		this.staffs = staffs;
	}

	public String getStaffRoleNm() {
		return staffRoleNm;
	}

	public void setStaffRoleNm(String staffRoleNm) {
		this.staffRoleNm = staffRoleNm;
	}
	
	
	
	
}