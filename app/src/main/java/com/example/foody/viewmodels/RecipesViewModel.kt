package com.example.foody.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.foody.utils.Constants
import com.example.foody.utils.Constants.Companion.API_KEY
import com.example.foody.utils.Constants.Companion.QUERY_ADD_RECIPE_INFO
import com.example.foody.utils.Constants.Companion.QUERY_API_KEY
import com.example.foody.utils.Constants.Companion.QUERY_DIET
import com.example.foody.utils.Constants.Companion.QUERY_FILL_INGREDIENTS
import com.example.foody.utils.Constants.Companion.QUERY_NUMBER
import com.example.foody.utils.Constants.Companion.QUERY_TYPE

class RecipesViewModel(application: Application) : AndroidViewModel(application) {

    fun applyQueries(): HashMap<String, String> {
        val queries: HashMap<String, String> = HashMap()

        queries[QUERY_API_KEY] = API_KEY
        queries[QUERY_NUMBER] = "50"
        queries[QUERY_TYPE] = "snack"
        queries[QUERY_DIET] = "vegan"
        queries[QUERY_ADD_RECIPE_INFO] = "true"
        queries[QUERY_FILL_INGREDIENTS] = "true"

        return queries
    }
}