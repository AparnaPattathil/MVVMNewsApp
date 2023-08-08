package com.androiddevs.mvvmnewsapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.androiddevs.mvvmnewsapp.R
import com.androiddevs.mvvmnewsapp.ui.NewsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ArticleFragment:Fragment(R.layout.fragment_article) {
    private val viewModel: NewsViewModel by activityViewModels()

}