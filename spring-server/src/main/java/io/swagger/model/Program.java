package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Tag;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Program
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-09T13:04:02.667Z")

public class Program   {
  @JsonProperty("imageUrl")
  private String imageUrl = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("lastUpdateTime")
  private String lastUpdateTime = null;

  @JsonProperty("tag")
  private Tag tag = null;

  public Program imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * 预览图
   * @return imageUrl
  **/
  @ApiModelProperty(value = "预览图")


  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public Program title(String title) {
    this.title = title;
    return this;
  }

  /**
   * 标题
   * @return title
  **/
  @ApiModelProperty(value = "标题")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Program lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  /**
   * 最后更新时间
   * @return lastUpdateTime
  **/
  @ApiModelProperty(value = "最后更新时间")


  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public Program tag(Tag tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Tag getTag() {
    return tag;
  }

  public void setTag(Tag tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Program program = (Program) o;
    return Objects.equals(this.imageUrl, program.imageUrl) &&
        Objects.equals(this.title, program.title) &&
        Objects.equals(this.lastUpdateTime, program.lastUpdateTime) &&
        Objects.equals(this.tag, program.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUrl, title, lastUpdateTime, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Program {\n");
    
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

