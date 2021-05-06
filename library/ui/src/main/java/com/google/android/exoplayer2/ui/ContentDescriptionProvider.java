package com.google.android.exoplayer2.ui;

import java.util.Formatter;

public interface ContentDescriptionProvider {
  CharSequence provideContentDescription(ContentDescriptionViewType viewType,StringBuilder builder, Formatter formatter, long timeMs);
}
