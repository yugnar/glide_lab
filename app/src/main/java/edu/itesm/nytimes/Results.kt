package edu.itesm.nytimes

import com.google.gson.annotations.SerializedName

data class Results(
    @SerializedName("results") var results:ResultsInfo
)

data class ResultsInfo(
    var books: List<Book>
)

data class Book(val rank: Int,
                val title: String,
                val description: String,
                val book_image: String)
