package pocketcoder.idnijuan.business.module.fragment.feedsocial.adapter;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import pocketcoder.idnijuan.business.model.social.Item;
import pocketcoder.idnijuan.business.module.fragment.feedsocial.FeedSocialContract;
import pocketcoder.idnijuan.presentation.base.adapter.PocketAdapter;
import pocketcoder.idnijuan.presentation.fragment.feedsocial.viewholder.FeedSocialViewHolder;

/**
 * Created by jamesdeperio on 10/22/2017
 * pocketcoder.idnijuan.business.module.fragment.feedsocial.adapter
 */

public class FeedSocialAdapter extends PocketAdapter {
    @Getter@Setter private List<Item> fiterSocialList=new ArrayList<>();
    @Getter@Setter private List<Item> socialList=new ArrayList<>();
    public FeedSocialAdapter(FeedSocialContract.ViewMethod viewMethod) {
        addViewHolder(new FeedSocialViewHolder(this,viewMethod));
    }
    @Override
    public int getDataCount() {
        return fiterSocialList.size();
    }
}
