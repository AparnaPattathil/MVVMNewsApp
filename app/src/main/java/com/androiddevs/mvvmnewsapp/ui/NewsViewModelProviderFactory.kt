/*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.androiddevs.mvvmnewsapp.repository.NewsRepository

class NewsViewModelFactory(val repository: NewsRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(NewsRepository::class.java)
            .newInstance(repository)
    }
}
*/
