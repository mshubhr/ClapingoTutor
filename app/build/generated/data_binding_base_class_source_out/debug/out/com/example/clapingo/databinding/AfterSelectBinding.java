// Generated by view binder compiler. Do not edit!
package com.example.clapingo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.clapingo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AfterSelectBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView ts1;

  @NonNull
  public final TextView ts2;

  @NonNull
  public final TextView ts3;

  private AfterSelectBinding(@NonNull LinearLayout rootView, @NonNull TextView ts1,
      @NonNull TextView ts2, @NonNull TextView ts3) {
    this.rootView = rootView;
    this.ts1 = ts1;
    this.ts2 = ts2;
    this.ts3 = ts3;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AfterSelectBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AfterSelectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.after_select, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AfterSelectBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ts_1;
      TextView ts1 = ViewBindings.findChildViewById(rootView, id);
      if (ts1 == null) {
        break missingId;
      }

      id = R.id.ts_2;
      TextView ts2 = ViewBindings.findChildViewById(rootView, id);
      if (ts2 == null) {
        break missingId;
      }

      id = R.id.ts_3;
      TextView ts3 = ViewBindings.findChildViewById(rootView, id);
      if (ts3 == null) {
        break missingId;
      }

      return new AfterSelectBinding((LinearLayout) rootView, ts1, ts2, ts3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
