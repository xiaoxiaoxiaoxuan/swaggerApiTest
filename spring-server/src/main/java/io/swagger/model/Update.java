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
 * Update
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-09T13:04:02.667Z")

public class Update   {
  @JsonProperty("version")
  private String version = null;

  @JsonProperty("apkMD5")
  private String apkMD5 = null;

  @JsonProperty("apkUrl")
  private String apkUrl = null;

  @JsonProperty("updateType")
  private Integer updateType = null;

  @JsonProperty("updateTitle")
  private String updateTitle = null;

  @JsonProperty("updateContent")
  private String updateContent = null;

  @JsonProperty("updateImageUrl")
  private String updateImageUrl = null;

  @JsonProperty("updateUrl")
  private String updateUrl = null;

  public Update version(String version) {
    this.version = version;
    return this;
  }

  /**
   * 版本号
   * @return version
  **/
  @ApiModelProperty(example = "1.0.0", value = "版本号")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Update apkMD5(String apkMD5) {
    this.apkMD5 = apkMD5;
    return this;
  }

  /**
   * 安卓 apk MD5 文件，检验完整性
   * @return apkMD5
  **/
  @ApiModelProperty(value = "安卓 apk MD5 文件，检验完整性")


  public String getApkMD5() {
    return apkMD5;
  }

  public void setApkMD5(String apkMD5) {
    this.apkMD5 = apkMD5;
  }

  public Update apkUrl(String apkUrl) {
    this.apkUrl = apkUrl;
    return this;
  }

  /**
   * 安卓 apk 下载地址
   * @return apkUrl
  **/
  @ApiModelProperty(value = "安卓 apk 下载地址")


  public String getApkUrl() {
    return apkUrl;
  }

  public void setApkUrl(String apkUrl) {
    this.apkUrl = apkUrl;
  }

  public Update updateType(Integer updateType) {
    this.updateType = updateType;
    return this;
  }

  /**
   * 0：弱更新，不弹更新弹窗 1：普通更新，更新弹窗可关闭 2：强制更新，更新弹窗不可关闭
   * @return updateType
  **/
  @ApiModelProperty(value = "0：弱更新，不弹更新弹窗 1：普通更新，更新弹窗可关闭 2：强制更新，更新弹窗不可关闭")


  public Integer getUpdateType() {
    return updateType;
  }

  public void setUpdateType(Integer updateType) {
    this.updateType = updateType;
  }

  public Update updateTitle(String updateTitle) {
    this.updateTitle = updateTitle;
    return this;
  }

  /**
   * 更新弹窗标题
   * @return updateTitle
  **/
  @ApiModelProperty(example = "V1.0.1 版本为您做了这些：", value = "更新弹窗标题")


  public String getUpdateTitle() {
    return updateTitle;
  }

  public void setUpdateTitle(String updateTitle) {
    this.updateTitle = updateTitle;
  }

  public Update updateContent(String updateContent) {
    this.updateContent = updateContent;
    return this;
  }

  /**
   * 更新弹窗标题
   * @return updateContent
  **/
  @ApiModelProperty(example = "V1.0.1 版本为您做了这些：", value = "更新弹窗标题")


  public String getUpdateContent() {
    return updateContent;
  }

  public void setUpdateContent(String updateContent) {
    this.updateContent = updateContent;
  }

  public Update updateImageUrl(String updateImageUrl) {
    this.updateImageUrl = updateImageUrl;
    return this;
  }

  /**
   * 更新弹窗内容
   * @return updateImageUrl
  **/
  @ApiModelProperty(example = "1.新增xxx功能； 2.修复一些已知问题。", value = "更新弹窗内容")


  public String getUpdateImageUrl() {
    return updateImageUrl;
  }

  public void setUpdateImageUrl(String updateImageUrl) {
    this.updateImageUrl = updateImageUrl;
  }

  public Update updateUrl(String updateUrl) {
    this.updateUrl = updateUrl;
    return this;
  }

  /**
   * iOS appStore 地址
   * @return updateUrl
  **/
  @ApiModelProperty(value = "iOS appStore 地址")


  public String getUpdateUrl() {
    return updateUrl;
  }

  public void setUpdateUrl(String updateUrl) {
    this.updateUrl = updateUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Update update = (Update) o;
    return Objects.equals(this.version, update.version) &&
        Objects.equals(this.apkMD5, update.apkMD5) &&
        Objects.equals(this.apkUrl, update.apkUrl) &&
        Objects.equals(this.updateType, update.updateType) &&
        Objects.equals(this.updateTitle, update.updateTitle) &&
        Objects.equals(this.updateContent, update.updateContent) &&
        Objects.equals(this.updateImageUrl, update.updateImageUrl) &&
        Objects.equals(this.updateUrl, update.updateUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, apkMD5, apkUrl, updateType, updateTitle, updateContent, updateImageUrl, updateUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Update {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    apkMD5: ").append(toIndentedString(apkMD5)).append("\n");
    sb.append("    apkUrl: ").append(toIndentedString(apkUrl)).append("\n");
    sb.append("    updateType: ").append(toIndentedString(updateType)).append("\n");
    sb.append("    updateTitle: ").append(toIndentedString(updateTitle)).append("\n");
    sb.append("    updateContent: ").append(toIndentedString(updateContent)).append("\n");
    sb.append("    updateImageUrl: ").append(toIndentedString(updateImageUrl)).append("\n");
    sb.append("    updateUrl: ").append(toIndentedString(updateUrl)).append("\n");
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

