package com.example.coin_gogogo.adapter;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coin_gogogo.R;
import com.example.coin_gogogo.activity.PostActivity;
import com.example.coin_gogogo.info.CommentInfo;
import com.example.coin_gogogo.info.PostInfo;
import com.example.coin_gogogo.utility.CommentInfo_DiffUtil;

import java.util.ArrayList;
import java.util.Date;

import static com.example.coin_gogogo.adapter.Post_Adapter.Time_to_String;

public class Comment_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final ArrayList<CommentInfo> comments;
    private PostInfo postInfo;
    private final PostActivity activity;

    public void CommentInfo_DiffUtil(PostInfo NewPostInfo) {
        Log.d("CommentInfo_DiffUtil","post:" + postInfo);
        Log.d("CommentInfo_DiffUtil","post:" + postInfo.getComments().size());
        final CommentInfo_DiffUtil diffCallback = new CommentInfo_DiffUtil(this.postInfo, NewPostInfo);
        final DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(diffCallback);

        this.comments.clear();
        this.comments.addAll(NewPostInfo.getComments());

        diffResult.dispatchUpdatesTo(this);
    }

    public Comment_Adapter(PostActivity activity,PostInfo postInfo) {
        this.activity = activity;
        this.comments = postInfo.getComments();
        this.postInfo = postInfo;
    }

    //holder
    public static class CommentsHolder extends RecyclerView.ViewHolder { //홀더에 담고싶은 그릇(이미지뷰)를 정함

        //R.layout.item_comments에 존재하지 않는 뷰는 일반적으로는 설정하나마나임
        TextView contentT;
        TextView dateT;
        TextView goodNum;
        TextView nicknameT;
        ImageButton good_btn;
        ImageButton option_btn;
        LinearLayout commentbody;
        LinearLayout commentbody_goodframe;
        RecyclerView recyclerView;
        LinearLayout goodNum_Layout;

        public CommentsHolder(@NonNull View itemView) {
            super(itemView);

            nicknameT = itemView.findViewById(R.id.nickname_commentT);
            contentT = itemView.findViewById(R.id.comment_commentT);
            dateT = itemView.findViewById(R.id.date_commentT);
            goodNum = itemView.findViewById(R.id.goodNum_commentT);
            good_btn = itemView.findViewById(R.id.good_comment_comments);
            option_btn = itemView.findViewById(R.id.opt_comment);
            recyclerView = itemView.findViewById(R.id.recommentRecycler);
            commentbody = itemView.findViewById(R.id.commentbody_comments);
            commentbody_goodframe = itemView.findViewById(R.id.good_btn_Frame);
            goodNum_Layout = itemView.findViewById(R.id.comment_GoodLayout);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { //비어있는 홀더에 비어있는 이미지뷰를 만들어줌
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comments, parent, false);
        CommentsHolder commentsHolder = new CommentsHolder(view);

        commentsHolder.good_btn.setOnClickListener(new View.OnClickListener() { //좋아요
            @Override
            public void onClick(View v) {
//                postControler.Press_Good_Comment(postInfo, commentsHolder.getAbsoluteAdapterPosition(), new PostControler.Listener_Complete_GoodPress() {
//                    @Override
//                    public void onComplete_Good_Press(PostInfo NewPostInfo) {
//                        listener_pressed_goodbtn.onClicked_goodbtn(NewPostInfo);
//                        Toast("좋아요!");
//                    }
//                    @Override
//                    public void onFailed() {Toast("존재하지 않는 게시물/댓글입니다.");}
//                    @Override
//                    public void AlreadyDone() {Toast("이미 눌렀어요!"); }
//                    @Override
//                    public void CannotSelf() {Toast("자신의 댓글에는 '좋아요'를 누를 수 없습니다.");}
//                });
            }
        });
        return commentsHolder;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder commentsHolder, int position) { //포지션에 맞게 이미지 셋업

        CommentsHolder holder = (CommentsHolder) commentsHolder;

        CommentInfo commentInfo = comments.get(position);

        holder.contentT.setText(commentInfo.getContents());
        holder.dateT.setText(Time_to_String(commentInfo.getCreatedAt(), new Date()));
        holder.goodNum.setText(commentInfo.getGood() + "");

        holder.nicknameT.setTextColor(ContextCompat.getColor(activity, R.color.black)); //아니라면 색상변경해줘야 리사이클러뷰 재활용할 때 혼동안옴.
        holder.nicknameT.setTypeface(null, Typeface.NORMAL);
        holder.nicknameT.setText(commentInfo.getPublisher());

    }

    @Override
    public int getItemCount() {
        return comments.size();
    }

    public void Toast(String str){
        Toast.makeText(activity,str,Toast.LENGTH_SHORT).show();
    }
}
