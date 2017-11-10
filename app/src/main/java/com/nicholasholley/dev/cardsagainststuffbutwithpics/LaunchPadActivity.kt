package com.nicholasholley.dev.cardsagainststuffbutwithpics

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.CardView
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.TextView
import com.nicholasholley.dev.cardsagainststuffbutwithpics.models.dummy.DummyContent
import kotlinx.android.synthetic.main.activity_launch_pad.*

class LaunchPadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_pad)
        setSupportActionBar(toolbar)

        val parentViewGroup = findViewById<ViewGroup>(R.id.linearLayout)
        for (card in DummyContent.ITEMS){
            val cardView: CardView = layoutInflater.inflate(R.layout.playcard_base, parentViewGroup) as CardView
            cardView.findViewById<TextView>(R.id.info_text).setText(card.text)
            parentViewGroup.addView(cardView)
        }

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_launch_pad, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings ->
                return true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
