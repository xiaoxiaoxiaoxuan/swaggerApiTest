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
 * LaunchAd
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-09T13:04:02.667Z")

public class LaunchAd   {
  @JsonProperty("adImageMD5")
  private String adImageMD5 = null;

  @JsonProperty("adImageUrl")
  private String adImageUrl = null;

  @JsonProperty("adUrl")
  private String adUrl = null;

  @JsonProperty("startTime")
  private Long startTime = null;

  @JsonProperty("endTime")
  private Long endTime = null;

  @JsonProperty("isShowJump")
  private Boolean isShowJump = null;

  public LaunchAd adImageMD5(String adImageMD5) {
    this.adImageMD5 = adImageMD5;
    return this;
  }

  /**
   * 广告图 MD5，校验完整性
   * @return adImageMD5
  **/
  @ApiModelProperty(value = "广告图 MD5，校验完整性")


  public String getAdImageMD5() {
    return adImageMD5;
  }

  public void setAdImageMD5(String adImageMD5) {
    this.adImageMD5 = adImageMD5;
  }

  public LaunchAd adImageUrl(String adImageUrl) {
    this.adImageUrl = adImageUrl;
    return this;
  }

  /**
   * 广告图链接
   * @return adImageUrl
  **/
  @ApiModelProperty(value = "广告图链接")


  public String getAdImageUrl() {
    return adImageUrl;
  }

  public void setAdImageUrl(String adImageUrl) {
    this.adImageUrl = adImageUrl;
  }

  public LaunchAd adUrl(String adUrl) {
    this.adUrl = adUrl;
    return this;
  }

  /**
   * 广告跳转链接
   * @return adUrl
  **/
  @ApiModelProperty(value = "广告跳转链接")


  public String getAdUrl() {
    return adUrl;
  }

  public void setAdUrl(String adUrl) {
    this.adUrl = adUrl;
  }

  public LaunchAd startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * 开始时间
   * @return startTime
  **/
  @ApiModelProperty(example = "1573315200", value = "开始时间")


  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public LaunchAd endTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * 结束时间
   * @return endTime
  **/
  @ApiModelProperty(example = "1573315200", value = "结束时间")


  public Long getEndTime() {
    return endTime;
  }

  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public LaunchAd isShowJump(Boolean isShowJump) {
    this.isShowJump = isShowJump;
    return this;
  }

  /**
   * 是否展示跳过按钮
   * @return isShowJump
  **/
  @ApiModelProperty(value = "是否展示跳过按钮")


  public Boolean isIsShowJump() {
    return isShowJump;
  }

  public void setIsShowJump(Boolean isShowJump) {
    this.isShowJump = isShowJump;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LaunchAd launchAd = (LaunchAd) o;
    return Objects.equals(this.adImageMD5, launchAd.adImageMD5) &&
        Objects.equals(this.adImageUrl, launchAd.adImageUrl) &&
        Objects.equals(this.adUrl, launchAd.adUrl) &&
        Objects.equals(this.startTime, launchAd.startTime) &&
        Objects.equals(this.endTime, launchAd.endTime) &&
        Objects.equals(this.isShowJump, launchAd.isShowJump);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adImageMD5, adImageUrl, adUrl, startTime, endTime, isShowJump);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LaunchAd {\n");
    
    sb.append("    adImageMD5: ").append(toIndentedString(adImageMD5)).append("\n");
    sb.append("    adImageUrl: ").append(toIndentedString(adImageUrl)).append("\n");
    sb.append("    adUrl: ").append(toIndentedString(adUrl)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    isShowJump: ").append(toIndentedString(isShowJump)).append("\n");
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

