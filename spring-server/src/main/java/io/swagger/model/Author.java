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
 * Author
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-09T13:04:02.667Z")

public class Author   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("avatar")
  private String avatar = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("intro")
  private String intro = null;

  @JsonProperty("isFollow")
  private Boolean isFollow = null;

  public Author id(String id) {
    this.id = id;
    return this;
  }

  /**
   * 作者id
   * @return id
  **/
  @ApiModelProperty(value = "作者id")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Author avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

  /**
   * 头像地址
   * @return avatar
  **/
  @ApiModelProperty(value = "头像地址")


  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public Author name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 名字
   * @return name
  **/
  @ApiModelProperty(value = "名字")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Author intro(String intro) {
    this.intro = intro;
    return this;
  }

  /**
   * 作者简介
   * @return intro
  **/
  @ApiModelProperty(value = "作者简介")


  public String getIntro() {
    return intro;
  }

  public void setIntro(String intro) {
    this.intro = intro;
  }

  public Author isFollow(Boolean isFollow) {
    this.isFollow = isFollow;
    return this;
  }

  /**
   * 关注
   * @return isFollow
  **/
  @ApiModelProperty(value = "关注")


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
    Author author = (Author) o;
    return Objects.equals(this.id, author.id) &&
        Objects.equals(this.avatar, author.avatar) &&
        Objects.equals(this.name, author.name) &&
        Objects.equals(this.intro, author.intro) &&
        Objects.equals(this.isFollow, author.isFollow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, avatar, name, intro, isFollow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Author {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    intro: ").append(toIndentedString(intro)).append("\n");
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

