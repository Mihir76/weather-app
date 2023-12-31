// Generated by view binder compiler. Do not edit!
package com.mihirpatel.forecastapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.mihirpatel.forecastapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView cityName;

  @NonNull
  public final TextView conditions;

  @NonNull
  public final TextView date;

  @NonNull
  public final TextView day;

  @NonNull
  public final Flow flow2;

  @NonNull
  public final FrameLayout frameLayout;

  @NonNull
  public final TextView humidity;

  @NonNull
  public final LinearLayout linearLayout10;

  @NonNull
  public final LinearLayout linearLayout11;

  @NonNull
  public final LinearLayout linearLayout12;

  @NonNull
  public final LinearLayout linearLayout7;

  @NonNull
  public final LinearLayout linearLayout8;

  @NonNull
  public final LinearLayout linearLayout9;

  @NonNull
  public final LottieAnimationView lottieAnimationView;

  @NonNull
  public final TextView maxTemp;

  @NonNull
  public final TextView minTemp;

  @NonNull
  public final TextView sea;

  @NonNull
  public final SearchView searchView;

  @NonNull
  public final TextView sunrise;

  @NonNull
  public final TextView sunset;

  @NonNull
  public final TextView temp;

  @NonNull
  public final TextView textView16;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView weather;

  @NonNull
  public final TextView windspeed;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull TextView cityName,
      @NonNull TextView conditions, @NonNull TextView date, @NonNull TextView day,
      @NonNull Flow flow2, @NonNull FrameLayout frameLayout, @NonNull TextView humidity,
      @NonNull LinearLayout linearLayout10, @NonNull LinearLayout linearLayout11,
      @NonNull LinearLayout linearLayout12, @NonNull LinearLayout linearLayout7,
      @NonNull LinearLayout linearLayout8, @NonNull LinearLayout linearLayout9,
      @NonNull LottieAnimationView lottieAnimationView, @NonNull TextView maxTemp,
      @NonNull TextView minTemp, @NonNull TextView sea, @NonNull SearchView searchView,
      @NonNull TextView sunrise, @NonNull TextView sunset, @NonNull TextView temp,
      @NonNull TextView textView16, @NonNull TextView textView3, @NonNull TextView weather,
      @NonNull TextView windspeed) {
    this.rootView = rootView;
    this.cityName = cityName;
    this.conditions = conditions;
    this.date = date;
    this.day = day;
    this.flow2 = flow2;
    this.frameLayout = frameLayout;
    this.humidity = humidity;
    this.linearLayout10 = linearLayout10;
    this.linearLayout11 = linearLayout11;
    this.linearLayout12 = linearLayout12;
    this.linearLayout7 = linearLayout7;
    this.linearLayout8 = linearLayout8;
    this.linearLayout9 = linearLayout9;
    this.lottieAnimationView = lottieAnimationView;
    this.maxTemp = maxTemp;
    this.minTemp = minTemp;
    this.sea = sea;
    this.searchView = searchView;
    this.sunrise = sunrise;
    this.sunset = sunset;
    this.temp = temp;
    this.textView16 = textView16;
    this.textView3 = textView3;
    this.weather = weather;
    this.windspeed = windspeed;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cityName;
      TextView cityName = ViewBindings.findChildViewById(rootView, id);
      if (cityName == null) {
        break missingId;
      }

      id = R.id.conditions;
      TextView conditions = ViewBindings.findChildViewById(rootView, id);
      if (conditions == null) {
        break missingId;
      }

      id = R.id.date;
      TextView date = ViewBindings.findChildViewById(rootView, id);
      if (date == null) {
        break missingId;
      }

      id = R.id.day;
      TextView day = ViewBindings.findChildViewById(rootView, id);
      if (day == null) {
        break missingId;
      }

      id = R.id.flow2;
      Flow flow2 = ViewBindings.findChildViewById(rootView, id);
      if (flow2 == null) {
        break missingId;
      }

      id = R.id.frameLayout;
      FrameLayout frameLayout = ViewBindings.findChildViewById(rootView, id);
      if (frameLayout == null) {
        break missingId;
      }

      id = R.id.humidity;
      TextView humidity = ViewBindings.findChildViewById(rootView, id);
      if (humidity == null) {
        break missingId;
      }

      id = R.id.linearLayout10;
      LinearLayout linearLayout10 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout10 == null) {
        break missingId;
      }

      id = R.id.linearLayout11;
      LinearLayout linearLayout11 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout11 == null) {
        break missingId;
      }

      id = R.id.linearLayout12;
      LinearLayout linearLayout12 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout12 == null) {
        break missingId;
      }

      id = R.id.linearLayout7;
      LinearLayout linearLayout7 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout7 == null) {
        break missingId;
      }

      id = R.id.linearLayout8;
      LinearLayout linearLayout8 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout8 == null) {
        break missingId;
      }

      id = R.id.linearLayout9;
      LinearLayout linearLayout9 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout9 == null) {
        break missingId;
      }

      id = R.id.lottieAnimationView;
      LottieAnimationView lottieAnimationView = ViewBindings.findChildViewById(rootView, id);
      if (lottieAnimationView == null) {
        break missingId;
      }

      id = R.id.max_temp;
      TextView maxTemp = ViewBindings.findChildViewById(rootView, id);
      if (maxTemp == null) {
        break missingId;
      }

      id = R.id.min_temp;
      TextView minTemp = ViewBindings.findChildViewById(rootView, id);
      if (minTemp == null) {
        break missingId;
      }

      id = R.id.sea;
      TextView sea = ViewBindings.findChildViewById(rootView, id);
      if (sea == null) {
        break missingId;
      }

      id = R.id.searchView;
      SearchView searchView = ViewBindings.findChildViewById(rootView, id);
      if (searchView == null) {
        break missingId;
      }

      id = R.id.sunrise;
      TextView sunrise = ViewBindings.findChildViewById(rootView, id);
      if (sunrise == null) {
        break missingId;
      }

      id = R.id.sunset;
      TextView sunset = ViewBindings.findChildViewById(rootView, id);
      if (sunset == null) {
        break missingId;
      }

      id = R.id.temp;
      TextView temp = ViewBindings.findChildViewById(rootView, id);
      if (temp == null) {
        break missingId;
      }

      id = R.id.textView16;
      TextView textView16 = ViewBindings.findChildViewById(rootView, id);
      if (textView16 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.weather;
      TextView weather = ViewBindings.findChildViewById(rootView, id);
      if (weather == null) {
        break missingId;
      }

      id = R.id.windspeed;
      TextView windspeed = ViewBindings.findChildViewById(rootView, id);
      if (windspeed == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, cityName, conditions, date, day,
          flow2, frameLayout, humidity, linearLayout10, linearLayout11, linearLayout12,
          linearLayout7, linearLayout8, linearLayout9, lottieAnimationView, maxTemp, minTemp, sea,
          searchView, sunrise, sunset, temp, textView16, textView3, weather, windspeed);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
