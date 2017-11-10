package com.nicholasholley.dev.cardsagainststuffbutwithpics.models

import android.media.Image
import com.evernote.android.state.State
import org.parceler.Parcel

/**
 * Documentation
 */
class ImageCard(
        var imageData: MutableList<Byte>,
        id: Int = 0,
        name: String? = null
): PlayCard(id, name) {
}