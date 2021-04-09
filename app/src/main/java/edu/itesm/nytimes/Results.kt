package edu.itesm.nytimes

import com.google.gson.annotations.SerializedName

data class Results(
    @SerializedName("results") var results:ResultsInfo
)

data class ResultsInfo(
    var books: List<Books>
)

data class Books(
    var rank:Double?,
    var description:String?,
    var title:String?,
    var book_image:String?
)
