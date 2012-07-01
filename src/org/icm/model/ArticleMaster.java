package org.icm.model;

// Generated 5 Jun, 2012 5:27:43 PM by Hibernate Tools 3.2.1.GA

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ArticleMaster generated by hbm2java
 */
@Entity
@Table(name = "article_master", catalog = "icm")
public class ArticleMaster implements java.io.Serializable {

	private Integer articleId;
	private LanguageMaster languageMaster;
	private UserMaster userMaster;
	private String title;
	private String article;
	private String keywords;
	private int status;
	private Date dateadded;
	private Date lastModifiedDate;

	public ArticleMaster() {
	}

	public ArticleMaster(LanguageMaster languageMaster, UserMaster userMaster,
			String title, String article, int status, Date dateadded,
			Date lastModifiedDate) {
		this.languageMaster = languageMaster;
		this.userMaster = userMaster;
		this.title = title;
		this.article = article;
		this.status = status;
		this.dateadded = dateadded;
		this.lastModifiedDate = lastModifiedDate;
	}

	public ArticleMaster(LanguageMaster languageMaster, UserMaster userMaster,
			String title, String article, String keywords, int status,
			Date dateadded, Date lastModifiedDate) {
		this.languageMaster = languageMaster;
		this.userMaster = userMaster;
		this.title = title;
		this.article = article;
		this.keywords = keywords;
		this.status = status;
		this.dateadded = dateadded;
		this.lastModifiedDate = lastModifiedDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "articleId", unique = true, nullable = false)
	public Integer getArticleId() {
		return this.articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "languageId", nullable = false)
	public LanguageMaster getLanguageMaster() {
		return this.languageMaster;
	}

	public void setLanguageMaster(LanguageMaster languageMaster) {
		this.languageMaster = languageMaster;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId", nullable = false)
	public UserMaster getUserMaster() {
		return this.userMaster;
	}

	public void setUserMaster(UserMaster userMaster) {
		this.userMaster = userMaster;
	}

	@Column(name = "title", nullable = false, length = 50)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "article", nullable = false, length = 65535)
	public String getArticle() {
		return this.article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	@Column(name = "keywords", length = 200)
	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	@Column(name = "status", nullable = false)
	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateadded", nullable = false, length = 19)
	public Date getDateadded() {
		return this.dateadded;
	}

	public void setDateadded(Date dateadded) {
		this.dateadded = dateadded;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lastModifiedDate", nullable = false, length = 19)
	public Date getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

}