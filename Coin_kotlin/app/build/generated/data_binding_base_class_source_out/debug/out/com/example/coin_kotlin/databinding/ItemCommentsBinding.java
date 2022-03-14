// Generated by view binder compiler. Do not edit!
package com.example.coin_kotlin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.balysv.materialripple.MaterialRippleLayout;
import com.example.coin_kotlin.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemCommentsBinding implements ViewBinding {
  @NonNull
  private final MaterialRippleLayout rootView;

  @NonNull
  public final TextView LetterCountT;

  @NonNull
  public final TextView commentCommentT;

  @NonNull
  public final LinearLayout commentGoodLayout;

  @NonNull
  public final ImageButton commentOptBtn;

  @NonNull
  public final LinearLayout commentbodyComments;

  @NonNull
  public final LinearLayout con;

  @NonNull
  public final TextView dateCommentT;

  @NonNull
  public final LinearLayout face;

  @NonNull
  public final LinearLayout goodBtnFrame;

  @NonNull
  public final ImageButton goodCommentBtn;

  @NonNull
  public final TextView goodNumCommentT;

  @NonNull
  public final ImageView imageViewPost;

  @NonNull
  public final TextView nicknameCommentT;

  @NonNull
  public final RecyclerView recommentRecycler;

  private ItemCommentsBinding(@NonNull MaterialRippleLayout rootView,
      @NonNull TextView LetterCountT, @NonNull TextView commentCommentT,
      @NonNull LinearLayout commentGoodLayout, @NonNull ImageButton commentOptBtn,
      @NonNull LinearLayout commentbodyComments, @NonNull LinearLayout con,
      @NonNull TextView dateCommentT, @NonNull LinearLayout face,
      @NonNull LinearLayout goodBtnFrame, @NonNull ImageButton goodCommentBtn,
      @NonNull TextView goodNumCommentT, @NonNull ImageView imageViewPost,
      @NonNull TextView nicknameCommentT, @NonNull RecyclerView recommentRecycler) {
    this.rootView = rootView;
    this.LetterCountT = LetterCountT;
    this.commentCommentT = commentCommentT;
    this.commentGoodLayout = commentGoodLayout;
    this.commentOptBtn = commentOptBtn;
    this.commentbodyComments = commentbodyComments;
    this.con = con;
    this.dateCommentT = dateCommentT;
    this.face = face;
    this.goodBtnFrame = goodBtnFrame;
    this.goodCommentBtn = goodCommentBtn;
    this.goodNumCommentT = goodNumCommentT;
    this.imageViewPost = imageViewPost;
    this.nicknameCommentT = nicknameCommentT;
    this.recommentRecycler = recommentRecycler;
  }

  @Override
  @NonNull
  public MaterialRippleLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemCommentsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemCommentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_comments, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemCommentsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Letter_countT;
      TextView LetterCountT = ViewBindings.findChildViewById(rootView, id);
      if (LetterCountT == null) {
        break missingId;
      }

      id = R.id.comment_commentT;
      TextView commentCommentT = ViewBindings.findChildViewById(rootView, id);
      if (commentCommentT == null) {
        break missingId;
      }

      id = R.id.comment_GoodLayout;
      LinearLayout commentGoodLayout = ViewBindings.findChildViewById(rootView, id);
      if (commentGoodLayout == null) {
        break missingId;
      }

      id = R.id.commentOptBtn;
      ImageButton commentOptBtn = ViewBindings.findChildViewById(rootView, id);
      if (commentOptBtn == null) {
        break missingId;
      }

      id = R.id.commentbody_comments;
      LinearLayout commentbodyComments = ViewBindings.findChildViewById(rootView, id);
      if (commentbodyComments == null) {
        break missingId;
      }

      id = R.id.con;
      LinearLayout con = ViewBindings.findChildViewById(rootView, id);
      if (con == null) {
        break missingId;
      }

      id = R.id.date_commentT;
      TextView dateCommentT = ViewBindings.findChildViewById(rootView, id);
      if (dateCommentT == null) {
        break missingId;
      }

      id = R.id.face;
      LinearLayout face = ViewBindings.findChildViewById(rootView, id);
      if (face == null) {
        break missingId;
      }

      id = R.id.good_btn_Frame;
      LinearLayout goodBtnFrame = ViewBindings.findChildViewById(rootView, id);
      if (goodBtnFrame == null) {
        break missingId;
      }

      id = R.id.goodCommentBtn;
      ImageButton goodCommentBtn = ViewBindings.findChildViewById(rootView, id);
      if (goodCommentBtn == null) {
        break missingId;
      }

      id = R.id.goodNum_commentT;
      TextView goodNumCommentT = ViewBindings.findChildViewById(rootView, id);
      if (goodNumCommentT == null) {
        break missingId;
      }

      id = R.id.imageView_post;
      ImageView imageViewPost = ViewBindings.findChildViewById(rootView, id);
      if (imageViewPost == null) {
        break missingId;
      }

      id = R.id.nickname_commentT;
      TextView nicknameCommentT = ViewBindings.findChildViewById(rootView, id);
      if (nicknameCommentT == null) {
        break missingId;
      }

      id = R.id.recommentRecycler;
      RecyclerView recommentRecycler = ViewBindings.findChildViewById(rootView, id);
      if (recommentRecycler == null) {
        break missingId;
      }

      return new ItemCommentsBinding((MaterialRippleLayout) rootView, LetterCountT, commentCommentT,
          commentGoodLayout, commentOptBtn, commentbodyComments, con, dateCommentT, face,
          goodBtnFrame, goodCommentBtn, goodNumCommentT, imageViewPost, nicknameCommentT,
          recommentRecycler);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}