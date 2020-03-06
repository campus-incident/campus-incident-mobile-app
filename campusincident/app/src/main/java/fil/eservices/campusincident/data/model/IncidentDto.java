/**
 * Campus Incident API Documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package fil.eservices.campusincident.data.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

@ApiModel(description = "")
public class IncidentDto {

  @SerializedName("author")
  private String author = null;
  @SerializedName("categories")
  private List<String> categories = null;
  @SerializedName("createdAt")
  private Date createdAt = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("latitude")
  private Double latitude = null;
  @SerializedName("location")
  private Long location = null;
  @SerializedName("longitude")
  private Double longitude = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("title")
  private String title = null;

  /**
   * email
   **/
  @ApiModelProperty(required = true, value = "email")
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getCategories() {
    return categories;
  }
  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getLocation() {
    return location;
  }
  public void setLocation(Long location) {
    this.location = location;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentDto incidentDto = (IncidentDto) o;
    return (this.author == null ? incidentDto.author == null : this.author.equals(incidentDto.author)) &&
            (this.categories == null ? incidentDto.categories == null : this.categories.equals(incidentDto.categories)) &&
            (this.createdAt == null ? incidentDto.createdAt == null : this.createdAt.equals(incidentDto.createdAt)) &&
            (this.description == null ? incidentDto.description == null : this.description.equals(incidentDto.description)) &&
            (this.latitude == null ? incidentDto.latitude == null : this.latitude.equals(incidentDto.latitude)) &&
            (this.location == null ? incidentDto.location == null : this.location.equals(incidentDto.location)) &&
            (this.longitude == null ? incidentDto.longitude == null : this.longitude.equals(incidentDto.longitude)) &&
            (this.status == null ? incidentDto.status == null : this.status.equals(incidentDto.status)) &&
            (this.title == null ? incidentDto.title == null : this.title.equals(incidentDto.title));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.author == null ? 0: this.author.hashCode());
    result = 31 * result + (this.categories == null ? 0: this.categories.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.latitude == null ? 0: this.latitude.hashCode());
    result = 31 * result + (this.location == null ? 0: this.location.hashCode());
    result = 31 * result + (this.longitude == null ? 0: this.longitude.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.title == null ? 0: this.title.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentDto {\n");

    sb.append("  author: ").append(author).append("\n");
    sb.append("  categories: ").append(categories).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
