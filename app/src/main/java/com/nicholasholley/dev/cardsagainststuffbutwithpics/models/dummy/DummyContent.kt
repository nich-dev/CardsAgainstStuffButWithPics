package com.nicholasholley.dev.cardsagainststuffbutwithpics.models.dummy

import com.nicholasholley.dev.cardsagainststuffbutwithpics.models.AnswerCard
import com.nicholasholley.dev.cardsagainststuffbutwithpics.models.PlayCard
import com.thedeanda.lorem.LoremIpsum
import java.util.*

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<AnswerCard> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<Int, AnswerCard> = HashMap()

    private val COUNT = 25

    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createDummyItem(i, LoremIpsum.getInstance().getWords(6,9)))
        }
    }

    private fun addItem(item: AnswerCard) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createDummyItem(position: Int, text: String): AnswerCard {
        return AnswerCard(text, position)
    }

    /**
     * A dummy item representing a piece of content.
     */
    class DummyItem(val id: String, val content: String, val details: String) {

        override fun toString(): String {
            return content
        }
    }
}
