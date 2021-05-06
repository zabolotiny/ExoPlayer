package com.google.android.exoplayer2.ui;

import com.google.android.exoplayer2.util.Util;
import java.util.Formatter;

class DefaultContentDescriptionProvider implements ContentDescriptionProvider {

  @Override
  public CharSequence provideContentDescription(ContentDescriptionViewType viewType,
      StringBuilder builder, Formatter formatter, long timeMs) {
    return Util.getStringForTime(builder, formatter, timeMs);
  }
}