package courseenrolmentadmission.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="meeting_form")
public class MeetingTime {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@NotNull
	@Column(name="startdate")
	private String startdate ;
	@NotNull
	@Column(name="starttime")
	private String starttime;
	@NotNull
	@Column(name="enddate")
	private String enddate ;
	@NotNull
	@Column(name="endtime")
	private String endtime;
	
	
	public MeetingTime() {
		
	}
	
	
	
	public MeetingTime(String startdate, String starttime, String enddate, String endtime) {
		super();
		this.startdate = startdate;
		this.starttime = starttime;
		this.enddate = enddate;
		this.endtime = endtime;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	
	
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	@Override
	public String toString() {
		return "MeetingTime [id=" + id + ", startdate=" + startdate + ", starttime=" + starttime + ", enddate="
				+ enddate + ", endtime=" + endtime + "]";
	}
	
	
	
	
	
	

}
