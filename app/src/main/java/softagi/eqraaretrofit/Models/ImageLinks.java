package softagi.eqraaretrofit.Models;

import com.google.gson.annotations.SerializedName;

public class ImageLinks
{
    @SerializedName("thumbnail")
    private String thumbnail;

    public ImageLinks(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
