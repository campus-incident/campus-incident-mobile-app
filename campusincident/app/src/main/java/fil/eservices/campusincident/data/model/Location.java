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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@ApiModel(description = "")
public class Location implements Serializable {
  
  @SerializedName("center")
  private Geolocation center = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("radius")
  private Double radius = null;
  @SerializedName("tzName")
  private String tzName = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Geolocation getCenter() {
    return center;
  }
  public void setCenter(Geolocation center) {
    this.center = center;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * In meters
   * minimum: 0
   **/
  @ApiModelProperty(value = "In meters")
  public Double getRadius() {
    return radius;
  }
  public void setRadius(Double radius) {
    this.radius = radius;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTzName() {
    return tzName;
  }
  public void setTzName(String tzName) {
    this.tzName = tzName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return (this.center == null ? location.center == null : this.center.equals(location.center)) &&
        (this.id == null ? location.id == null : this.id.equals(location.id)) &&
        (this.name == null ? location.name == null : this.name.equals(location.name)) &&
        (this.radius == null ? location.radius == null : this.radius.equals(location.radius)) &&
        (this.tzName == null ? location.tzName == null : this.tzName.equals(location.tzName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.center == null ? 0: this.center.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.radius == null ? 0: this.radius.hashCode());
    result = 31 * result + (this.tzName == null ? 0: this.tzName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("  center: ").append(center).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  radius: ").append(radius).append("\n");
    sb.append("  tzName: ").append(tzName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
