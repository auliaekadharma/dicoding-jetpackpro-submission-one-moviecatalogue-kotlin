package com.dicoding.akromatopsia.moviecatalogue.ui.detail

import androidx.lifecycle.ViewModel
import com.dicoding.akromatopsia.moviecatalogue.data.MovieEntity
import com.dicoding.akromatopsia.moviecatalogue.utils.DataDummy

class DetailMovieViewModel : ViewModel() {
    private lateinit var movieId: String

    fun setSelectedMovie(movieId: String) {
        this.movieId = movieId
    }

    fun getMovie(): MovieEntity {
        lateinit var movie: MovieEntity
        val moviesEntities = DataDummy.generateDummyMovies()
        for (movieEntity in moviesEntities) {
            if (movieEntity.movieId == movieId) {
                movie = movieEntity
            }
        }
        return movie
    }

}