package softagi.eqraaretrofit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import softagi.eqraaretrofit.Models.BookModel;
import softagi.eqraaretrofit.Models.ImageLinks;
import softagi.eqraaretrofit.Models.Item;
import softagi.eqraaretrofit.Models.VolumeInfo;

public class MainActivity extends AppCompatActivity
{
    RecyclerView recyclerView;
    ProgressBar progressBar;

    RecyclerView.LayoutManager layoutManager;
    DividerItemDecoration dividerItemDecoration;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        progressBar = findViewById(R.id.progressbar);

        progressBar.setVisibility(View.VISIBLE);

        layoutManager = new LinearLayoutManager(getApplicationContext(), RecyclerView.VERTICAL, false);
        dividerItemDecoration = new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(dividerItemDecoration);

        getBooks();
    }

    private void getBooks()
    {

    }

    class bookAdapter extends RecyclerView.Adapter<bookAdapter.bookVH>
    {
        List<Item> list;

        public bookAdapter(List<Item> list)
        {
            this.list = list;
        }

        @NonNull
        @Override
        public bookVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
        {
            View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.book_item, parent, false);
            return new bookVH(view);
        }

        @Override
        public void onBindViewHolder(@NonNull bookVH holder, int position)
        {
            Item item = list.get(position);
            VolumeInfo volumeInfo = item.getVolumeInfo();

            String title = volumeInfo.getTitle();

            ImageLinks imageLinks = volumeInfo.getImageLinks();

            String image = imageLinks.getThumbnail();

            holder.book_title.setText(title);

            if (image.isEmpty())
            {
                holder.book_image.setImageResource(R.drawable.ic_launcher_background);
            } else
                {
                    Picasso.get()
                            .load(image)
                            .into(holder.book_image);
                }
        }

        @Override
        public int getItemCount()
        {
            return list.size();
        }

        class bookVH extends RecyclerView.ViewHolder
        {
            TextView book_title;
            ImageView book_image;

            public bookVH(@NonNull View itemView)
            {
                super(itemView);

                book_title = itemView.findViewById(R.id.book_title);
                book_image = itemView.findViewById(R.id.book_image);
            }
        }
    }
}
