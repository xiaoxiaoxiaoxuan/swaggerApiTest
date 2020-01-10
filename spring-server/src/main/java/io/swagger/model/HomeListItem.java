package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Author;
import io.swagger.model.HomeListItemPendant;
import io.swagger.model.Tag;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HomeListItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-09T13:04:02.667Z")

public class HomeListItem   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("collectionId")
  private String collectionId = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("imageUrl")
  private String imageUrl = null;

  @JsonProperty("url")
  @Valid
  private List<String> url = null;

  @JsonProperty("width")
  private BigDecimal width = null;

  @JsonProperty("height")
  private BigDecimal height = null;

  @JsonProperty("tag")
  private Tag tag = null;

  @JsonProperty("pendant")
  private HomeListItemPendant pendant = null;

  @JsonProperty("author")
  private Author author = null;

  @JsonProperty("reviews")
  private Long reviews = null;

  @JsonProperty("shareUrl")
  private String shareUrl = null;

  public HomeListItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * fm id
   * @return id
  **/
  @ApiModelProperty(value = "fm id")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HomeListItem collectionId(String collectionId) {
    this.collectionId = collectionId;
    return this;
  }

  /**
   * 合集 id，属于剧集、节目的返回，详情页是否展示往期回顾
   * @return collectionId
  **/
  @ApiModelProperty(value = "合集 id，属于剧集、节目的返回，详情页是否展示往期回顾")


  public String getCollectionId() {
    return collectionId;
  }

  public void setCollectionId(String collectionId) {
    this.collectionId = collectionId;
  }

  public HomeListItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * 标题
   * @return title
  **/
  @ApiModelProperty(value = "标题")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public HomeListItem imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * 封面图片地址
   * @return imageUrl
  **/
  @ApiModelProperty(value = "封面图片地址")


  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public HomeListItem url(List<String> url) {
    this.url = url;
    return this;
  }

  public HomeListItem addUrlItem(String urlItem) {
    if (this.url == null) {
      this.url = new ArrayList<String>();
    }
    this.url.add(urlItem);
    return this;
  }

  /**
   * 音视频地址
   * @return url
  **/
  @ApiModelProperty(value = "音视频地址")


  public List<String> getUrl() {
    return url;
  }

  public void setUrl(List<String> url) {
    this.url = url;
  }

  public HomeListItem width(BigDecimal width) {
    this.width = width;
    return this;
  }

  /**
   * 宽
   * @return width
  **/
  @ApiModelProperty(value = "宽")

  @Valid

  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  public HomeListItem height(BigDecimal height) {
    this.height = height;
    return this;
  }

  /**
   * 高
   * @return height
  **/
  @ApiModelProperty(value = "高")

  @Valid

  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public HomeListItem tag(Tag tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Tag getTag() {
    return tag;
  }

  public void setTag(Tag tag) {
    this.tag = tag;
  }

  public HomeListItem pendant(HomeListItemPendant pendant) {
    this.pendant = pendant;
    return this;
  }

  /**
   * Get pendant
   * @return pendant
  **/
  @ApiModelProperty(value = "")

  @Valid

  public HomeListItemPendant getPendant() {
    return pendant;
  }

  public void setPendant(HomeListItemPendant pendant) {
    this.pendant = pendant;
  }

  public HomeListItem author(Author author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public HomeListItem reviews(Long reviews) {
    this.reviews = reviews;
    return this;
  }

  /**
   * 评论数
   * @return reviews
  **/
  @ApiModelProperty(value = "评论数")


  public Long getReviews() {
    return reviews;
  }

  public void setReviews(Long reviews) {
    this.reviews = reviews;
  }

  public HomeListItem shareUrl(String shareUrl) {
    this.shareUrl = shareUrl;
    return this;
  }

  /**
   * 分享链接
   * @return shareUrl
  **/
  @ApiModelProperty(value = "分享链接")


  public String getShareUrl() {
    return shareUrl;
  }

  public void setShareUrl(String shareUrl) {
    this.shareUrl = shareUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HomeListItem homeListItem = (HomeListItem) o;
    return Objects.equals(this.id, homeListItem.id) &&
        Objects.equals(this.collectionId, homeListItem.collectionId) &&
        Objects.equals(this.title, homeListItem.title) &&
        Objects.equals(this.imageUrl, homeListItem.imageUrl) &&
        Objects.equals(this.url, homeListItem.url) &&
        Objects.equals(this.width, homeListItem.width) &&
        Objects.equals(this.height, homeListItem.height) &&
        Objects.equals(this.tag, homeListItem.tag) &&
        Objects.equals(this.pendant, homeListItem.pendant) &&
        Objects.equals(this.author, homeListItem.author) &&
        Objects.equals(this.reviews, homeListItem.reviews) &&
        Objects.equals(this.shareUrl, homeListItem.shareUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, collectionId, title, imageUrl, url, width, height, tag, pendant, author, reviews, shareUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HomeListItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    pendant: ").append(toIndentedString(pendant)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    reviews: ").append(toIndentedString(reviews)).append("\n");
    sb.append("    shareUrl: ").append(toIndentedString(shareUrl)).append("\n");
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

