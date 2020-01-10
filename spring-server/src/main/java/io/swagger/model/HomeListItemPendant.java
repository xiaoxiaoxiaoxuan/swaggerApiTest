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
 * 挂件
 */
@ApiModel(description = "挂件")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-09T13:04:02.667Z")

public class HomeListItemPendant   {
  @JsonProperty("imageUrl")
  private String imageUrl = null;

  @JsonProperty("actUrl")
  private String actUrl = null;

  public HomeListItemPendant imageUrl(String imageUrl) {
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

  public HomeListItemPendant actUrl(String actUrl) {
    this.actUrl = actUrl;
    return this;
  }

  /**
   * 页面地址
   * @return actUrl
  **/
  @ApiModelProperty(value = "页面地址")


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
    HomeListItemPendant homeListItemPendant = (HomeListItemPendant) o;
    return Objects.equals(this.imageUrl, homeListItemPendant.imageUrl) &&
        Objects.equals(this.actUrl, homeListItemPendant.actUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUrl, actUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HomeListItemPendant {\n");
    
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

