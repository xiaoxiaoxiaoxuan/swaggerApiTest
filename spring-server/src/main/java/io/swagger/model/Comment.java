package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CommentReplyList;
import io.swagger.model.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 评论
 */
@ApiModel(description = "评论")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-09T13:04:02.667Z")

public class Comment   {
  @JsonProperty("user")
  private User user = null;

  @JsonProperty("time")
  private String time = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("replyList")
  @Valid
  private List<CommentReplyList> replyList = null;

  public Comment user(User user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")

  @Valid

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Comment time(String time) {
    this.time = time;
    return this;
  }

  /**
   * 评论时间
   * @return time
  **/
  @ApiModelProperty(value = "评论时间")


  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public Comment content(String content) {
    this.content = content;
    return this;
  }

  /**
   * 评论内容
   * @return content
  **/
  @ApiModelProperty(value = "评论内容")


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Comment replyList(List<CommentReplyList> replyList) {
    this.replyList = replyList;
    return this;
  }

  public Comment addReplyListItem(CommentReplyList replyListItem) {
    if (this.replyList == null) {
      this.replyList = new ArrayList<CommentReplyList>();
    }
    this.replyList.add(replyListItem);
    return this;
  }

  /**
   * Get replyList
   * @return replyList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CommentReplyList> getReplyList() {
    return replyList;
  }

  public void setReplyList(List<CommentReplyList> replyList) {
    this.replyList = replyList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.user, comment.user) &&
        Objects.equals(this.time, comment.time) &&
        Objects.equals(this.content, comment.content) &&
        Objects.equals(this.replyList, comment.replyList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, time, content, replyList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    replyList: ").append(toIndentedString(replyList)).append("\n");
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

