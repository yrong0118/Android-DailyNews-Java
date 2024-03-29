package com.laioffer.tinnews.save;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.laioffer.tinnews.R;
import com.laioffer.tinnews.common.TinBasicFragment;
import com.laioffer.tinnews.common.TinFragmentManager;
import com.laioffer.tinnews.common.ViewModelAdapter;
import com.laioffer.tinnews.mvp.MvpFragment;
import com.laioffer.tinnews.retrofit.response.News;
import com.laioffer.tinnews.save.detail.SavedNewsDetailedFragment;

import java.util.LinkedList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SavedNewsFragment extends MvpFragment<SavedNewsContract.Presenter> implements SavedNewsContract.View {

    private ViewModelAdapter viewModelAdapter;
    private TextView indicator;

    public static SavedNewsFragment newInstance() {
        Bundle args = new Bundle();
        SavedNewsFragment fragment = new SavedNewsFragment();
        fragment.setArguments(args);
        return fragment;
    }



    //7.8
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //7.8
        View view = inflater.inflate(R.layout.fragment_saved_news, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        viewModelAdapter = new ViewModelAdapter();
        indicator = view.findViewById(R.id.empty_state);
        recyclerView.setAdapter(viewModelAdapter);
//        indicator = view.findViewById(R.id.empty_state);
        return view;
    }



    @Override
    public SavedNewsContract.Presenter getPresenter() {

        return new SavedNewsPresenter();
    }

    @Override
    public void loadSavedNews(List<News> newsList) {
//        if (viewModelAdapter.getItemCount() ==newsList.size()){
//            return;
//        }
        if (newsList.size() == 0) {
            indicator.setVisibility(View.VISIBLE);
        } else {
            indicator.setVisibility(View.GONE);
        }
        List<SavedNewsViewModel> models = new LinkedList<>();
        for (News news : newsList){
            models.add(new SavedNewsViewModel(news, tinFragmentManager));
        }
        viewModelAdapter.addViewModels(models);
    }

}
