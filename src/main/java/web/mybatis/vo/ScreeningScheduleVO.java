package web.mybatis.vo;

public class ScreeningScheduleVO {
	private String ss_code, //상영시간표코드
	movie_code, //상영영화코드
	t_code, //상영관 코드
	ss_time; //시작시간
	
	public ScreeningScheduleVO() {}

	public ScreeningScheduleVO(String ss_code, String movie_code, String t_code, String ss_time) {
		super();
		this.ss_code = ss_code;
		this.movie_code = movie_code;
		this.t_code = t_code;
		this.ss_time = ss_time;
	}

	String getSs_code() {
		return ss_code;
	}

	void setSs_code(String ss_code) {
		this.ss_code = ss_code;
	}

	String getMovie_code() {
		return movie_code;
	}

	void setMovie_code(String movie_code) {
		this.movie_code = movie_code;
	}

	String getT_code() {
		return t_code;
	}

	void setT_code(String t_code) {
		this.t_code = t_code;
	}

	String getSs_time() {
		return ss_time;
	}

	void setSs_time(String ss_time) {
		this.ss_time = ss_time;
	}
	
	
}