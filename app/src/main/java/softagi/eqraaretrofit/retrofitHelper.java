package softagi.eqraaretrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import softagi.eqraaretrofit.Models.BookModel;

public interface retrofitHelper
{
    @GET("books/v1/volumes")
    Call<BookModel> getBooks(@Query("q") String value);
}
