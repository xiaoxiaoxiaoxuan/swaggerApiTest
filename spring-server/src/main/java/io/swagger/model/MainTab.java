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
 * MainTab
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-09T13:04:02.667Z")

public class MainTab   {
  @JsonProperty("type")
  private Integer type = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("imageNormalUrl")
  private String imageNormalUrl = null;

  @JsonProperty("imageSelectedUrl")
  private String imageSelectedUrl = null;

  @JsonProperty("isActivity")
  private Boolean isActivity = null;

  @JsonProperty("needLogin")
  private Boolean needLogin = null;

  @JsonProperty("actUrl")
  private String actUrl = null;

  @JsonProperty("modalStyle")
  private Integer modalStyle = null;

  public MainTab type(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * 1：首页 2：视频 3：FM 4：我的
   * @return type
  **/
  @ApiModelProperty(value = "1：首页 2：视频 3：FM 4：我的")


  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public MainTab title(String title) {
    this.title = title;
    return this;
  }

  /**
   * tabbar title
   * @return title
  **/
  @ApiModelProperty(example = "首页", value = "tabbar title")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MainTab imageNormalUrl(String imageNormalUrl) {
    this.imageNormalUrl = imageNormalUrl;
    return this;
  }

  /**
   * 非选中状态下 tabbar icon
   * @return imageNormalUrl
  **/
  @ApiModelProperty(value = "非选中状态下 tabbar icon")


  public String getImageNormalUrl() {
    return imageNormalUrl;
  }

  public void setImageNormalUrl(String imageNormalUrl) {
    this.imageNormalUrl = imageNormalUrl;
  }

  public MainTab imageSelectedUrl(String imageSelectedUrl) {
    this.imageSelectedUrl = imageSelectedUrl;
    return this;
  }

  /**
   * 选中状态下 tabbbar icon
   * @return imageSelectedUrl
  **/
  @ApiModelProperty(value = "选中状态下 tabbbar icon")


  public String getImageSelectedUrl() {
    return imageSelectedUrl;
  }

  public void setImageSelectedUrl(String imageSelectedUrl) {
    this.imageSelectedUrl = imageSelectedUrl;
  }

  public MainTab isActivity(Boolean isActivity) {
    this.isActivity = isActivity;
    return this;
  }

  /**
   * 是否是活动状态
   * @return isActivity
  **/
  @ApiModelProperty(value = "是否是活动状态")


  public Boolean isIsActivity() {
    return isActivity;
  }

  public void setIsActivity(Boolean isActivity) {
    this.isActivity = isActivity;
  }

  public MainTab needLogin(Boolean needLogin) {
    this.needLogin = needLogin;
    return this;
  }

  /**
   * 是否需要登录
   * @return needLogin
  **/
  @ApiModelProperty(value = "是否需要登录")


  public Boolean isNeedLogin() {
    return needLogin;
  }

  public void setNeedLogin(Boolean needLogin) {
    this.needLogin = needLogin;
  }

  public MainTab actUrl(String actUrl) {
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

  public MainTab modalStyle(Integer modalStyle) {
    this.modalStyle = modalStyle;
    return this;
  }

  /**
   * 0：正常切换 1：侧边滑出
   * @return modalStyle
  **/
  @ApiModelProperty(value = "0：正常切换 1：侧边滑出")


  public Integer getModalStyle() {
    return modalStyle;
  }

  public void setModalStyle(Integer modalStyle) {
    this.modalStyle = modalStyle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainTab mainTab = (MainTab) o;
    return Objects.equals(this.type, mainTab.type) &&
        Objects.equals(this.title, mainTab.title) &&
        Objects.equals(this.imageNormalUrl, mainTab.imageNormalUrl) &&
        Objects.equals(this.imageSelectedUrl, mainTab.imageSelectedUrl) &&
        Objects.equals(this.isActivity, mainTab.isActivity) &&
        Objects.equals(this.needLogin, mainTab.needLogin) &&
        Objects.equals(this.actUrl, mainTab.actUrl) &&
        Objects.equals(this.modalStyle, mainTab.modalStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, imageNormalUrl, imageSelectedUrl, isActivity, needLogin, actUrl, modalStyle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainTab {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    imageNormalUrl: ").append(toIndentedString(imageNormalUrl)).append("\n");
    sb.append("    imageSelectedUrl: ").append(toIndentedString(imageSelectedUrl)).append("\n");
    sb.append("    isActivity: ").append(toIndentedString(isActivity)).append("\n");
    sb.append("    needLogin: ").append(toIndentedString(needLogin)).append("\n");
    sb.append("    actUrl: ").append(toIndentedString(actUrl)).append("\n");
    sb.append("    modalStyle: ").append(toIndentedString(modalStyle)).append("\n");
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

