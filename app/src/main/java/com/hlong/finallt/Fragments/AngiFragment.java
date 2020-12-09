package com.hlong.finallt.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hlong.finallt.Fragments.book.Book;
import com.hlong.finallt.Fragments.category.Category;
import com.hlong.finallt.Fragments.category.CategoryAdapter;
import com.hlong.finallt.R;

import java.util.ArrayList;
import java.util.List;


public class AngiFragment extends Fragment {

   private RecyclerView rcvCategory;
   private CategoryAdapter categoryAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment_angi,container,false);

        rcvCategory = view.findViewById(R.id.rcv_cattegory);

        categoryAdapter = new CategoryAdapter(getActivity());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false);
        rcvCategory.setLayoutManager(linearLayoutManager);
        categoryAdapter.setData(getListCategory());

        rcvCategory.setAdapter(categoryAdapter);


        return view;
    }

    private List<Category> getListCategory(){
        List<Category> listCategory = new ArrayList<>();

        List<Book> listBook = new ArrayList<>();

        listBook.add(new Book(R.drawable.food10, "Trà sữa Opera"));
        listBook.add(new Book(R.drawable.food11, "Đệ nhất cơm chiên 73"));
        listBook.add(new Book(R.drawable.food12, "Ốc - Luizjk Ngã tư"));
        listBook.add(new Book(R.drawable.food13, "Sò điệp nướng mỡ hành"));
        listBook.add(new Book(R.drawable.food14, "Sữa chua nếp cẩm"));

        listBook.add(new Book(R.drawable.food15, "Ốc siêu cay"));
        listBook.add(new Book(R.drawable.food16, "Sinh tố trái cây"));
        listBook.add(new Book(R.drawable.food17, "Sữa chua - sữa trân châu"));
        listBook.add(new Book(R.drawable.food18, "Phở chả bò"));
        listBook.add(new Book(R.drawable.food19, "Lottle "));

        listCategory.add(new Category("Đồ ăn", listBook));

        return listCategory;
    }
}
