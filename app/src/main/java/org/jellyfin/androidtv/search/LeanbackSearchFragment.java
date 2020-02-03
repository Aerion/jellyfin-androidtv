package org.jellyfin.androidtv.search;

import android.os.Bundle;

import org.jellyfin.androidtv.itemhandling.BaseRowItem;
import org.jellyfin.androidtv.itemhandling.ItemLauncher;
import org.jellyfin.androidtv.itemhandling.ItemRowAdapter;

import androidx.leanback.app.SearchSupportFragment;
import androidx.leanback.widget.ListRow;

public class LeanbackSearchFragment extends SearchSupportFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create provider
        SearchProvider searchProvider = new SearchProvider(getContext(), getActivity().getIntent().getBooleanExtra("MusicOnly", false));
        setSearchResultProvider(searchProvider);

        // Create click listener
        setOnItemViewClickedListener((itemViewHolder, item, rowViewHolder, row) -> {
            if (!(item instanceof BaseRowItem)) return;

            ItemLauncher.launch((BaseRowItem) item, (ItemRowAdapter) ((ListRow) row).getAdapter(), ((BaseRowItem) item).getIndex(), getActivity());
        });
    }
}

