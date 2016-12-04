package xyz.yurue.nobu.qiitaclient

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import xyz.yurue.nobu.qiitaclient.model.Article
import xyz.yurue.nobu.qiitaclient.model.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listAdapter = ArticleListAdapter(applicationContext)
        listAdapter.articles = listOf(dummyArticle("Kotlin ことはじめ", "konnobu"),
                dummyArticle("Ruby ことはじめ", "azuki"))

        val listView: ListView = findViewById(R.id.list_view) as ListView
        listView.adapter = listAdapter
    }

    private fun dummyArticle(title: String, userName: String): Article =
            Article(id = "",
                    title = title,
                    url = "",
                    user = User(id = "", name = userName, profileImageUrl = ""))
}