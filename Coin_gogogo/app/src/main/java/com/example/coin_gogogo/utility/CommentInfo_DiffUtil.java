package com.example.coin_gogogo.utility;

import android.util.Log;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

import com.example.coin_gogogo.info.CommentInfo;
import com.example.coin_gogogo.info.PostInfo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static com.example.coin_gogogo.utility.Named.HOUR;
import static com.example.coin_gogogo.utility.Named.MIN;
import static com.example.coin_gogogo.utility.Named.SEC;

public class CommentInfo_DiffUtil extends DiffUtil.Callback {

    private final ArrayList<CommentInfo> OldComments;
    private final ArrayList<CommentInfo> NewComments;
    private final PostInfo OldPost;
    private final PostInfo NewPost;

    public CommentInfo_DiffUtil(PostInfo OldPost, PostInfo NewPost) {
        this.OldPost = OldPost;
        this.NewPost = NewPost;
        this.OldComments = this.OldPost.getComments();
        this.NewComments = this.NewPost.getComments();
        Log.d("같z나zxc","old: " + OldPost.hashCode() + " new: "+ NewPost.hashCode());
    }

    @Override
    public int getOldListSize() {
        return OldComments.size();
    }

    @Override
    public int getNewListSize() {
        return NewComments.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        final CommentInfo oldpost = OldComments.get(oldItemPosition);
        final CommentInfo newpost = NewComments.get(newItemPosition);

        return oldpost.getKey().equals(newpost.getKey());
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) { //item이 같아도 수정된다면 내용이 다르다는 것을 인식시켜줘야 내용이 바뀜
        final CommentInfo oldpost = OldComments.get(oldItemPosition);
        final CommentInfo newpost = NewComments.get(newItemPosition);

        return oldpost.getContents().equals(newpost.getContents()) && oldpost.getPublisher().equals(newpost.getPublisher())
                && oldpost.getGood() == newpost.getGood();
    }

    @Nullable
    @Override
    public Object getChangePayload(int oldItemPosition, int newItemPosition) {
        //Implement method if you're going to use ItemAnimator
        return super.getChangePayload(oldItemPosition, newItemPosition);
    }

    public static String formatTimeString(Date postdate, Date nowDate){

        long ctime = nowDate.getTime();
        long regTime = postdate.getTime();

        long diffTime = (ctime - regTime) / 1000;
        String msg = null;

        if (diffTime < SEC) {
            msg = "방금 전";
        } else if ((diffTime /= SEC) < MIN) {
            msg = diffTime + "분 전";
        } else if ((diffTime /= MIN) < HOUR) {
            msg = new SimpleDateFormat("HH:mm").format(postdate);
//        } else if ((diffTime /= TIME_MAXIMUM.HOUR) < TIME_MAXIMUM.DAY) {
//            msg = (diffTime) + "일 전";
//        } else if ((diffTime /= TIME_MAXIMUM.DAY) < TIME_MAXIMUM.MONTH) {
//            msg = (diffTime) + "달 전";
        } else {
            msg = new SimpleDateFormat("MM월dd일").format(postdate);
        }
        return msg;
    }
}