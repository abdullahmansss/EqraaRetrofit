package softagi.eqraaretrofit.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VolumeInfo
{
    @SerializedName("title")
    private String title;
    @SerializedName("imageLinks")
    private ImageLinks imageLinks;

    public VolumeInfo(String title, ImageLinks imageLinks) {
        this.title = title;
        this.imageLinks = imageLinks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ImageLinks getImageLinks() {
        return imageLinks;
    }

    public void setImageLinks(ImageLinks imageLinks) {
        this.imageLinks = imageLinks;
    }
}
