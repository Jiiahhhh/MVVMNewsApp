package com.ilal.mvvmnewsapp.ui

import androidx.lifecycle.ViewModel
import com.ilal.mvvmnewsapp.repository.NewsRepository

class NewsViewModel(val newsRepository: NewsRepository) : ViewModel() {
}