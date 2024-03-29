package com.example.gaurav.movieapp.ViewModel;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.example.gaurav.movieapp.Database.MovieRepository;
import com.example.gaurav.movieapp.MyMovie;
import com.example.gaurav.movieapp.Utility;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.example.gaurav.movieapp.MainActivity.API_COMPLETE_URL;
import static com.example.gaurav.movieapp.MainActivity.convertDbMovie;

public class MainActivityViewModel extends AndroidViewModel {


    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<List<MyMovie>> getMovieList() {
        return movieList;
    }

    MutableLiveData<List<MyMovie>> movieList =  new MutableLiveData<>();

    MovieRepository movieRepository = new MovieRepository(getApplication());


    //API Call if Internet is available
    public void loadFromServer() {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(new Runnable() {
            @Override
            public void run() {
                String utility_response = Utility.apiCall(API_COMPLETE_URL);
                if (utility_response != null) {
                    movieList.postValue(Utility.formatMovieJson(utility_response));
                }
            }
        });
    }

    // Offline Data if Internet is not available
    public void loadFromDB() {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(new Runnable() {
            @Override
            public void run() {
                movieList.postValue(convertDbMovie(movieRepository.getAllMovies()));
            }
        });
    }
}
