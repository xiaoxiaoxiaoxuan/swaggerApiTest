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
 * RecommendsRecommend
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-09T13:04:02.667Z")

public class RecommendsRecommend   {
  @JsonProperty("imageUrl")
  private String imageUrl = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("btnTitle")
  private String btnTitle = null;

  @JsonProperty("actUrl")
  private String actUrl = null;

  public RecommendsRecommend imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
  **/
  @ApiModelProperty(value = "")


  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public RecommendsRecommend title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public RecommendsRecommend description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RecommendsRecommend btnTitle(String btnTitle) {
    this.btnTitle = btnTitle;
    return this;
  }

  /**
   * Get btnTitle
   * @return btnTitle
  **/
  @ApiModelProperty(value = "")


  public String getBtnTitle() {
    return btnTitle;
  }

  public void setBtnTitle(String btnTitle) {
    this.btnTitle = btnTitle;
  }

  public RecommendsRecommend actUrl(String actUrl) {
    this.actUrl = actUrl;
    return this;
  }

  /**
   * Get actUrl
   * @return actUrl
  **/
  @ApiModelProperty(value = "")


  public String getActUrl() {
    return actUrl;
  }

  public void setActUrl(String actUrl) {
    this.actUrl = actUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendsRecommend recommendsRecommend = (RecommendsRecommend) o;
    return Objects.equals(this.imageUrl, recommendsRecommend.imageUrl) &&
        Objects.equals(this.title, recommendsRecommend.title) &&
        Objects.equals(this.description, recommendsRecommend.description) &&
        Objects.equals(this.btnTitle, recommendsRecommend.btnTitle) &&
        Objects.equals(this.actUrl, recommendsRecommend.actUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUrl, title, description, btnTitle, actUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendsRecommend {\n");
    
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    btnTitle: ").append(toIndentedString(btnTitle)).append("\n");
    sb.append("    actUrl: ").append(toIndentedString(actUrl)).append("\n");
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

