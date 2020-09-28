package com.example.quizgame2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.quizgame2.model.WordItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAdapter adapter = new MyAdapter();
        LinearLayoutManager lm = new LinearLayoutManager(MainActivity.this);
        RecyclerView rv = findViewById(R.id.word_list_recycler_view);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
    }

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

        WordItem[] items = {
                new WordItem(R.drawable.flower_sakura, "Cherry Blossom", "ดอกซากุระ"),
                new WordItem(R.drawable.flower_canna, "Canna Indica", "ดอกพุทธรักษา"),
                new WordItem(R.drawable.flower_paradise, "Bird of Paradise", "ดอกปักษาสวรรค์"),
                new WordItem(R.drawable.flower_hydrangea, "Hydrangea", "ดอกไฮเดรนเยีย"),
                new WordItem(R.drawable.flower_lily, "Calla Lily", "ดอกคาลล่า ลิลลี่"),
                new WordItem(R.drawable.flower_susan, "Black Eyed Susan", "ดอกซูซานตาดำ"),
                new WordItem(R.drawable.flower_bleedingheart, "Bleeding Heart", "ดอกหทัยหยาดทิพย์"),
                new WordItem(R.drawable.flower_bluebells, "Blue Bells", "ดอกระฆัง"),
                new WordItem(R.drawable.flower_lantana, "Lantana", "ดอกผกากรอง"),
                new WordItem(R.drawable.flower_rose, "Rose", "ดอกกุหลาบ")
        };

        public MyAdapter() {

        }

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.word_item, parent, false);
            MyViewHolder vh = new MyViewHolder(v);
            return vh;
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.imageView.setImageResource(items[position].imageResId);
            holder.mainwordTextView.setText(items[position].mainword);
            holder.subwordTextView.setText(items[position].subword);
        }

        @Override
        public int getItemCount() {
            return items.length;
        }

        class MyViewHolder extends RecyclerView.ViewHolder{
            ImageView imageView;
            TextView mainwordTextView;
            TextView subwordTextView;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.image_view);
                mainwordTextView = itemView.findViewById(R.id.main_text_view);
                subwordTextView = itemView.findViewById(R.id.sub_text_view);
            }
        }
    }
}