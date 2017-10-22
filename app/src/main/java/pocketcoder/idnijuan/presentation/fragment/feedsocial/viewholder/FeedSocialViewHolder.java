package pocketcoder.idnijuan.presentation.fragment.feedsocial.viewholder;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import pocketcoder.idnijuan.R;
import pocketcoder.idnijuan.business.module.fragment.feedsocial.FeedSocialContract;
import pocketcoder.idnijuan.business.module.fragment.feedsocial.adapter.FeedSocialAdapter;
import pocketcoder.idnijuan.presentation.base.adapter.PocketViewHolder;

/**
 * Created by jamesdeperio on 10/22/2017
 * pocketcoder.idnijuan.presentation.fragment.feedsocial.viewholder
 */
@RequiredArgsConstructor
public class FeedSocialViewHolder extends PocketViewHolder {
    @NonNull private FeedSocialAdapter adapter;
    @NonNull private FeedSocialContract.ViewMethod viewMethod;
    @Override
    public int initContentView() {
        return R.layout.list_social;
    }

    @BindView(R.id.author)
    TextView author;
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.desc)
    WebView desc;
    @BindView(R.id.attachment)
    ImageView attachment;

    @Override
    public void onBindEvent(View view, int i) {
        author.setText(adapter.getFiterSocialList().get(i).getMActor().getMDisplayName());
        title.setText(adapter.getFiterSocialList().get(i).getMTitle());
        desc.getSettings().setJavaScriptEnabled(true);
        desc.loadDataWithBaseURL("", adapter.getFiterSocialList().get(i).getMObject().getMContent(), "text/html", "UTF-8", "");
        if(adapter.getFiterSocialList().get(i).getMObject().getMAttachments()!=null){
            Glide.with(viewMethod.getFragmentActivity())
                    .load(adapter.getFiterSocialList().get(i).getMObject().getMAttachments().get(0).getImage().getUrl())
                    .crossFade().centerCrop()
                    .into(attachment);
        }else attachment.setVisibility(View.GONE);

    }
}
