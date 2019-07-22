package softagi.eqraaretrofit.Models;

import com.google.gson.annotations.SerializedName;

public class Item
{
    @SerializedName("volumeInfo")
    private VolumeInfo volumeInfo;

    public Item(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    public void setVolumeInfo(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }
}
