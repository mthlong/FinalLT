package com.hlong.finallt.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.hlong.finallt.R;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;


public class HomeFragment extends Fragment implements View.OnClickListener{
    GridView gridView;
    private CardView cardKhampha, cardGiaohang, cardDatcho;
    String[] food = {"Artisan Baked - Bánh Biscotti","Warning Zone - 72 Lý Tự Trọ...","Ritaki - Khoai Lang Mật - Kh...", "Nhà hàng Parsley - Steak, P...", "Thành Mập - Chân gà rút x...","Hello Pasta - Neffsteak - Mì..."
                        , "Quán TAMI - Ẩm thực Miền ...", "Bánh 9 Sạch - Bánh Sầu Riêng"};
    int [] numberImage = {R.drawable.food1,R.drawable.food2,R.drawable.food3,R.drawable.food4,R.drawable.food5,R.drawable.food6,R.drawable.food7,R.drawable.food8};
    String [] review1 = {"Rất lâu rồi mới thấy quán giảm mạnh 30%, tranh thủ mua 5-6 hộp về ăn dần","Cty đặt bàn 40 người mà xếp bàn không ngồi đủ 20??? Phản ánh ...",
                         "Ai ở Tân Bình mua ăn nha, khoai lang mật nướng chảy mật, được gói giấy...","Hnay mình với người yêu có ghé quán ở đây ăn sinh nhật, mình book quán...",
                        "Hồi xưa mướn phòng trọ gần đây hay ăn của quán. Chân gà thơm ngon...",
                         "Thứ 7 tuần trước tụi bạn ngẫu hứng rũ nhau đi ăn gì lạ lạ mà ngon...","Ngoài mì quảng ra còn có cơm gà xé, gỏi mít trộn rất ngon!","Khỏi phải bàn cãi vào quán toàn thấy Tây ngồi ăn chắc lần đầu ai cũng..."};

    SliderLayout sliderLayout;

    public HomeFragment() {

    }

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {


        View v=inflater.inflate(R.layout.fragment_home2, container, false);

        cardKhampha =v.findViewById(R.id.card_khampha);
        cardGiaohang =v.findViewById(R.id.card_giaohang);
        cardDatcho =v.findViewById(R.id.card_datcho);

        gridView = v.findViewById(R.id.gridview_trangchu);

        MainAdapter adapter = new MainAdapter(getActivity(), food, numberImage, review1);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 2) {
                Intent intent=new Intent(getActivity(),ProductDetail.class);
                startActivity(intent);}
                if (position == 0) {
                    Intent intent=new Intent(getActivity(),ProductDetail1.class);
                    startActivity(intent);}
                if (position == 1) {
                    Intent intent=new Intent(getActivity(),ProductDetail2.class);
                    startActivity(intent);}
                if (position == 3) {
                    Intent intent=new Intent(getActivity(),ProductDetail4.class);
                    startActivity(intent);}
            }
        });


        sliderLayout = v.findViewById(R.id.imageSlider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setScrollTimeInSec(1);

        setSlideViews();

        cardKhampha.setOnClickListener(this);
        cardGiaohang.setOnClickListener(this);
        cardDatcho.setOnClickListener(this);

        return v;
    }
    private void setSlideViews() {
        for (int i = 0; i <= 3; i++) {
            DefaultSliderView sliderView = new DefaultSliderView(getActivity());
            switch (i) {
                case 0:
                    sliderView.setImageDrawable(R.drawable.slide1);

                    break;
                case 1:
                    sliderView.setImageDrawable(R.drawable.slide2);

                    break;
                case 2:
                    sliderView.setImageDrawable(R.drawable.slide3);

                    break;
                case 3:
                    sliderView.setImageDrawable(R.drawable.slide4);

                    break;
            }

            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            final int finalI = i;
            sliderView.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(SliderView sliderView) {
                    Toast.makeText(getActivity(), "This is Slider" + (finalI + 1), Toast.LENGTH_SHORT);
                }
            });
            sliderLayout.addSliderView(sliderView);
        }

    }

    @Override
    public void onClick(View v) {
        Fragment fragment = null;
        switch (v.getId()) {
            case R.id.card_khampha:
                fragment = new KhamPhaFragment();
                replaceFragment(fragment);
                break;

            case R.id.card_giaohang:
                fragment = new GiaoHangFragment();
                replaceFragment(fragment);
                break;
            case R.id.card_datcho:
                fragment = new DatChoFragment();
                replaceFragment(fragment);
                break;
        }

    }
    public void replaceFragment(Fragment someFragment) {
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_layout, someFragment, "findThisFragment")
                .addToBackStack(null)
                .commit();
    }
}