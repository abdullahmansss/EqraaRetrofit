package softagi.eqraaretrofit.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BookModel
{
    @SerializedName("items")
    private List<Item> items = null;

    public BookModel(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
