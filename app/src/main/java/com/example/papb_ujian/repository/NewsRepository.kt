package com.example.papb_ujian.repository

import com.example.papb_ujian.api.RetrofitInstance
import com.example.papb_ujian.db.ArticleDatabase
import com.example.papb_ujian.models.Article

class NewsRepository(val db: ArticleDatabase) {

    suspend fun getHeadlines(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getHeadlines(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) =
        db.getArticleDao().upsert(article)

    fun getFavouriteNews() =
        db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) =
        db.getArticleDao().deleteArticle(article)
}