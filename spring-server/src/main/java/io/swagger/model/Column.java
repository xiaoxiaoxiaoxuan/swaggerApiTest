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
 * Column
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-09T13:04:02.667Z")

public class Column   {
  @JsonProperty("avatar")
  private String avatar = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("intro")
  private String intro = null;

  @JsonProperty("fans")
  private Long fans = null;

  @JsonProperty("isFollow")
  private Boolean isFollow = null;

  public Column avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

  /**
   * 头像
   * @return avatar
  **/
  @ApiModelProperty(value = "头像")


  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public Column name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 昵称
   * @return name
  **/
  @ApiModelProperty(value = "昵称")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Column intro(String intro) {
    this.intro = intro;
    return this;
  }

  /**
   * 介绍
   * @return intro
  **/
  @ApiModelProperty(value = "介绍")


  public String getIntro() {
    return intro;
  }

  public void setIntro(String intro) {
    this.intro = intro;
  }

  public Column fans(Long fans) {
    this.fans = fans;
    return this;
  }

  /**
   * 粉丝量
   * @return fans
  **/
  @ApiModelProperty(value = "粉丝量")


  public Long getFans() {
    return fans;
  }

  public void setFans(Long fans) {
    this.fans = fans;
  }

  public Column isFollow(Boolean isFollow) {
    this.isFollow = isFollow;
    return this;
  }

  /**
   * 是否关注
   * @return isFollow
  **/
  @ApiModelProperty(value = "是否关注")


  public Boolean isIsFollow() {
    return isFollow;
  }

  public void setIsFollow(Boolean isFollow) {
    this.isFollow = isFollow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Column column = (Column) o;
    return Objects.equals(this.avatar, column.avatar) &&
        Objects.equals(this.name, column.name) &&
        Objects.equals(this.intro, column.intro) &&
        Objects.equals(this.fans, column.fans) &&
        Objects.equals(this.isFollow, column.isFollow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatar, name, intro, fans, isFollow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Column {\n");
    
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    intro: ").append(toIndentedString(intro)).append("\n");
    sb.append("    fans: ").append(toIndentedString(fans)).append("\n");
    sb.append("    isFollow: ").append(toIndentedString(isFollow)).append("\n");
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

