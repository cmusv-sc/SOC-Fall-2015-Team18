/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package models;

import java.util.List;
import javax.persistence.*;


@Entity
public class Workflow {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(unique = true)
	private String title;
	private String description;
	private String image;
	private String contributor;
	private String instruction;
	private String dataset;
	private Long userId;
	// for popularity
	private int viewCount = 0;
	private int usageCount = 0;
	private int commentCount = 0;
	private int downloadCount = 0;
	private int referenceCount = 0;

	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
	@JoinTable(name = "WorkflowAndTag", joinColumns = { @JoinColumn(name ="workflowId", referencedColumnName = "id")}, inverseJoinColumns = { @JoinColumn(name = "tagId", referencedColumnName = "id") })
	private List<Tag> tagList;

	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
	@JoinTable(name = "WorkflowAndLevel", joinColumns = { @JoinColumn(name ="workflowId", referencedColumnName = "id")}, inverseJoinColumns = { @JoinColumn(name = "levelId", referencedColumnName = "id") })
	private List<Level> levelList;



	public Workflow() {
	}

	public Workflow(String title, String description, String image, String contributor, String instruction, String dataset, List<Tag> tagList, List<Level> levelList, Long userId
					, int viewCount, int usageCount, int commentCount, int downloadCount, int referenceCount) {
		this.title = title;
		this.description = description;
		this.image = image;
		this.contributor = contributor;
		this.instruction = instruction;
		this.dataset = dataset;
		this.tagList = tagList;
		this.levelList = levelList;
		this.userId = userId;

		this.viewCount =viewCount;
		this.usageCount = usageCount;
		this.commentCount = commentCount;
		this.downloadCount = downloadCount;
		this.referenceCount = referenceCount;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public int getUsageCount() {
		return usageCount;
	}

	public void setUsageCount(int usageCount) {
		this.usageCount = usageCount;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public int getDownloadCount() {
		return downloadCount;
	}

	public void setDownloadCount(int downloadCount) {
		this.downloadCount = downloadCount;
	}

	public int getReferenceCount() {
		return referenceCount;
	}

	public void setReferenceCount(int referenceCount) {
		this.referenceCount = referenceCount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getContributor() {
		return contributor;
	}

	public void setContributor(String contributor) {
		this.contributor = contributor;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public List<Tag> getTagList() {
		return tagList;
	}

	public void setTagList(List<Tag> tagList) {
		this.tagList = tagList;
	}

	public List<Level> getLevelList() {
		return levelList;
	}

	public void setLevelList(List<Level> levelList) {
		this.levelList = levelList;
	}

	public String getDataset() {
		return dataset;
	}

	public void setDataset(String dataset) {
		this.dataset = dataset;
	}

	public List<Tag> getTags() {
		return tagList;
	}

	public void setTags(List<Tag> tags) {
		this.tagList = tags;
	}

	@Override
	public String toString() {
		return "Workflow{" +
				"id=" + id +
				", title='" + title + '\'' +
				", description='" + description + '\'' +
				", image='" + image + '\'' +
				", contributor='" + contributor + '\'' +
				", instruction='" + instruction + '\'' +
				", dataset='" + dataset + '\'' +
				'}';
	}
}