package com.androiddevs.mvvmnewsapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.androiddevs.mvvmnewsapp.R
import com.androiddevs.mvvmnewsapp.ui.NewsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SavedNewsFragment:Fragment(R.layout.fragment_saved_news) {
    private val viewModel: NewsViewModel by activityViewModels()

}