// Generated by view binder compiler. Do not edit!
package com.example.clapingo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.clapingo.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AfterLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AutoCompleteTextView autoCompleteTv;

  @NonNull
  public final TextInputLayout inputLayout;

  @NonNull
  public final ImageView ivTeacher;

  @NonNull
  public final ImageView like;

  @NonNull
  public final RelativeLayout relative;

  @NonNull
  public final RecyclerView rv2;

  @NonNull
  public final TextView teacherDesc;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvRating;

  private AfterLayoutBinding(@NonNull LinearLayout rootView,
      @NonNull AutoCompleteTextView autoCompleteTv, @NonNull TextInputLayout inputLayout,
      @NonNull ImageView ivTeacher, @NonNull ImageView like, @NonNull RelativeLayout relative,
      @NonNull RecyclerView rv2, @NonNull TextView teacherDesc, @NonNull TextView tvName,
      @NonNull TextView tvRating) {
    this.rootView = rootView;
    this.autoCompleteTv = autoCompleteTv;
    this.inputLayout = inputLayout;
    this.ivTeacher = ivTeacher;
    this.like = like;
    this.relative = relative;
    this.rv2 = rv2;
    this.teacherDesc = teacherDesc;
    this.tvName = tvName;
    this.tvRating = tvRating;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AfterLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AfterLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.after_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AfterLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.auto_complete_tv;
      AutoCompleteTextView autoCompleteTv = ViewBindings.findChildViewById(rootView, id);
      if (autoCompleteTv == null) {
        break missingId;
      }

      id = R.id.input_layout;
      TextInputLayout inputLayout = ViewBindings.findChildViewById(rootView, id);
      if (inputLayout == null) {
        break missingId;
      }

      id = R.id.iv_teacher;
      ImageView ivTeacher = ViewBindings.findChildViewById(rootView, id);
      if (ivTeacher == null) {
        break missingId;
      }

      id = R.id.like;
      ImageView like = ViewBindings.findChildViewById(rootView, id);
      if (like == null) {
        break missingId;
      }

      id = R.id.relative;
      RelativeLayout relative = ViewBindings.findChildViewById(rootView, id);
      if (relative == null) {
        break missingId;
      }

      id = R.id.rv2;
      RecyclerView rv2 = ViewBindings.findChildViewById(rootView, id);
      if (rv2 == null) {
        break missingId;
      }

      id = R.id.teacher_desc;
      TextView teacherDesc = ViewBindings.findChildViewById(rootView, id);
      if (teacherDesc == null) {
        break missingId;
      }

      id = R.id.tv_name;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tv_rating;
      TextView tvRating = ViewBindings.findChildViewById(rootView, id);
      if (tvRating == null) {
        break missingId;
      }

      return new AfterLayoutBinding((LinearLayout) rootView, autoCompleteTv, inputLayout, ivTeacher,
          like, relative, rv2, teacherDesc, tvName, tvRating);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
