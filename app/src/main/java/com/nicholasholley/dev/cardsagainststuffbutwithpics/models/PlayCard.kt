package com.nicholasholley.dev.cardsagainststuffbutwithpics.models

import com.evernote.android.state.State
import org.parceler.Parcel
import org.parceler.ParcelConstructor
import org.parceler.ParcelProperty

/**
 * Documentation
 */
@Parcel()
open class PlayCard @ParcelConstructor constructor (
        @ParcelProperty("id") @State var id: Int = 0,
        @ParcelProperty("name") @State var name: String? = null
) {
    open fun play(){

    }
}