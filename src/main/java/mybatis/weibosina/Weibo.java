package mybatis.weibosina;

public class Weibo {

	private String tablename;
	private String wid;
	private long username;
	private int resportscount;
	private int commentscount;
	private String text;
	private long createat;
	private String owid;
	private long ousername;
	private boolean favorited;
	private String originalpic;

	public Weibo() {
		//
	}

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public Weibo(String tablename, String wid, long username, int repostscount, int commentscount, String text,
			long createat, String owid, long ousername, boolean favorited, String originalpic) {
		this.tablename = tablename;
		this.wid = wid;
		this.username = username;
		this.resportscount = repostscount;
		this.commentscount = commentscount;
		this.text = text;
		this.createat = createat;
		this.owid = owid;
		this.ousername = ousername;
		this.favorited = favorited;
		this.originalpic = originalpic;
	}

	public String getWid() {
		return wid;
	}

	public void setWid(String wid) {
		this.wid = wid;
	}

	public long getUsername() {
		return username;
	}

	public void setUsername(long username) {
		this.username = username;
	}

	public int getRepostscount() {
		return resportscount;
	}

	public void setRepostscount(int repostscount) {
		this.resportscount = repostscount;
	}

	public int getCommentscount() {
		return commentscount;
	}

	public void setCommentscount(int commentscount) {
		this.commentscount = commentscount;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public long getCreateat() {
		return createat;
	}

	public void setCreateat(long createat) {
		this.createat = createat;
	}

	public String getOwid() {
		return owid;
	}

	public void setOwid(String owid) {
		this.owid = owid;
	}

	public long getOusername() {
		return ousername;
	}

	public void setOusername(long ousername) {
		this.ousername = ousername;
	}

	public boolean isFavorited() {
		return favorited;
	}

	public void setFavorited(boolean favorited) {
		this.favorited = favorited;
	}

	public String getOriginalpic() {
		return originalpic;
	}

	public void setOriginalpic(String originalpic) {
		this.originalpic = originalpic;
	}

}
