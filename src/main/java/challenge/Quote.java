package challenge;

import javax.persistence.*;


@Table(name = "scripts")
@Entity
public class Quote {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private Integer episode;

	@Column
	private String episode_name;

	@Column
	private String segment;

	@Column
	private String type;

	@Column
	private String actor;

	@Column
	private String character;

	@Column
	private String detail;

	@Column
	private String recordDate;

	@Column
	private String series;

	@Column
	private String transmissionDate;


	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActor() {
		return this.actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getQuote() {
		return this.detail;
	}

	public void setQuote(String quote) {
		this.detail = quote;
	}

}
