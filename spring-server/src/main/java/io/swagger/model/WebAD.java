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
 * WebAD
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-09T13:04:02.667Z")

public class WebAD   {
  @JsonProperty("webUrl")
  private String webUrl = null;

  @JsonProperty("width")
  private BigDecimal width = null;

  @JsonProperty("height")
  private BigDecimal height = null;

  public WebAD webUrl(String webUrl) {
    this.webUrl = webUrl;
    return this;
  }

  /**
   * Get webUrl
   * @return webUrl
  **/
  @ApiModelProperty(value = "")


  public String getWebUrl() {
    return webUrl;
  }

  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }

  public WebAD width(BigDecimal width) {
    this.width = width;
    return this;
  }

  /**
   * web 宽
   * @return width
  **/
  @ApiModelProperty(value = "web 宽")

  @Valid

  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  public WebAD height(BigDecimal height) {
    this.height = height;
    return this;
  }

  /**
   * web 高
   * @return height
  **/
  @ApiModelProperty(value = "web 高")

  @Valid

  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebAD webAD = (WebAD) o;
    return Objects.equals(this.webUrl, webAD.webUrl) &&
        Objects.equals(this.width, webAD.width) &&
        Objects.equals(this.height, webAD.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webUrl, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebAD {\n");
    
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

