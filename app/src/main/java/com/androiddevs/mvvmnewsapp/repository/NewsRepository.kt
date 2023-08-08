package com.androiddevs.mvvmnewsapp.repository

import com.androiddevs.mvvmnewsapp.api.NewsApi
import com.androiddevs.mvvmnewsapp.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.db.ArticleDatabase
import javax.inject.Inject

class NewsRepository @Inject constructor(val db: ArticleDatabase, private val api: NewsApi) {

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        api.getBreakingNews(countryCode, pageNumber)
}