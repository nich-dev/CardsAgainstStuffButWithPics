package com.nicholasholley.dev.cardsagainststuffbutwithpics.models

import com.evernote.android.state.State
import org.parceler.Parcel
import org.parceler.ParcelConstructor
import org.parceler.ParcelProperty

/**
 * Documentation
 */
@Parcel()
class AnswerCard @ParcelConstructor constructor(
        @ParcelProperty("text") @State var text: String,
        id: Int = 0,
        name: String? = null
): PlayCard(id, name) {
}