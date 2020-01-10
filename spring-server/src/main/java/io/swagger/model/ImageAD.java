package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ImageAD
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-09T13:04:02.667Z")

public class ImageAD   {
  @JsonProperty("imageUrl")
  private String imageUrl = null;

  @JsonProperty("width")
  private BigDecimal width = null;

  @JsonProperty("height")
  private BigDecimal height = null;

  @JsonProperty("actUrl")
  private String actUrl = null;

  public ImageAD imageUrl(String imageUrl) {
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

  public ImageAD width(BigDecimal width) {
    this.width = width;
    return this;
  }

  /**
   * 图片宽
   * @return width
  **/
  @ApiModelProperty(value = "图片宽")

  @Valid

  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  public ImageAD height(BigDecimal height) {
    this.height = height;
    return this;
  }

  /**
   * 图片高
   * @return height
  **/
  @ApiModelProperty(value = "图片高")

  @Valid

  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public ImageAD actUrl(String actUrl) {
    this.actUrl = actUrl;
    return this;
  }

  /**
   * 链接地址
   * @return actUrl
  **/
  @ApiModelProperty(value = "链接地址")


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
    ImageAD imageAD = (ImageAD) o;
    return Objects.equals(this.imageUrl, imageAD.imageUrl) &&
        Objects.equals(this.width, imageAD.width) &&
        Objects.equals(this.height, imageAD.height) &&
        Objects.equals(this.actUrl, imageAD.actUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUrl, width, height, actUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageAD {\n");
    
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

