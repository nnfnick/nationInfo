package com.nick.nationinfo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recycleListView = findViewById(R.id.nation_list) as RecyclerView

        recycleListView.layoutManager = LinearLayoutManager(this)

        var adapter = NationAdapter(this, listOf(
                NationData(R.drawable.l_flag_belgium, "벨기에","브뤼셀"),
                NationData(R.drawable.l_flag_argentina, "아르헨티나","부에노스아이레스"),
                NationData(R.drawable.l_flag_brazil, "브라질","브라질리아"),
                NationData(R.drawable.l_flag_canada, "캐나다","오타와"),
                NationData(R.drawable.l_flag_china, "중국","베이징")))

        adapter.setOnItemClickListener(this)
        recycleListView.adapter = adapter
    }

    override fun onClick(v: View?) {
        val textView:TextView = v?.findViewById(R.id.text_name) as TextView
        val name = textView.text?:"None"
        val intent = Intent(this,NationDetailActivity::class.java)
        intent.putExtra(this,NationDetailActivity.EXTRA_NATION_NAME, name);
        startActivity(intent)
    }
}
