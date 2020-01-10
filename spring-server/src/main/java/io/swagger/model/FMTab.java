package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * fm垂类
 */
@ApiModel(description = "fm垂类")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-09T13:04:02.667Z")

public class FMTab   {
  @JsonProperty("type")
  private Integer type = null;

  @JsonProperty("title")
  private String title = null;

  public FMTab type(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * 0：推荐 1：情感 2：社会
   * @return type
  **/
  @ApiModelProperty(value = "0：推荐 1：情感 2：社会")


  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public FMTab title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "推荐/情感/社会", value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FMTab fmTab = (FMTab) o;
    return Objects.equals(this.type, fmTab.type) &&
        Objects.equals(this.title, fmTab.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FMTab {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

