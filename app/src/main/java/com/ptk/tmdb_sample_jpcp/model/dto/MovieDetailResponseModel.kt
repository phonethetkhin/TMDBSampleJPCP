package com.ptk.tmdb_sample_jpcp.model.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MovieDetailResponseModel(

    @SerialName("original_language")
    val originalLanguage: String? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("backdrop_path")
    val backdropPath: String? = null,

    @SerialName("revenue")
    val revenue: Int? = null,

    @SerialName("genres")
    val genres: List<GenresItem?>? = null,

    @SerialName("popularity")
    val popularity: Double? = null,

    @SerialName("production_countries")
    val productionCountries: List<ProductionCountriesItem?>? = null,

    @SerialName("id")
    val id: Int? = null,

    @SerialName("vote_count")
    val voteCount: Int? = null,

    @SerialName("budget")
    val budget: Int? = null,

    @SerialName("overview")
    val overview: String? = null,

    @SerialName("original_title")
    val originalTitle: String? = null,

    @SerialName("runtime")
    val runtime: Int? = null,

    @SerialName("poster_path")
    val posterPath: String? = null,

    @SerialName("spoken_languages")
    val spokenLanguages: List<SpokenLanguagesItem?>? = null,

    @SerialName("production_companies")
    val productionCompanies: List<ProductionCompaniesItem?>? = null,

    @SerialName("release_date")
    val releaseDate: String? = null,

    @SerialName("vote_average")
    val voteAverage: Double? = null,

    @SerialName("homepage")
    val homepage: String? = null,

    @SerialName("status")
    val status: String? = null,

    var isFav: Boolean = false,

)

@Serializable
data class SpokenLanguagesItem(

    @SerialName("name")
    val name: String? = null,

    @SerialName("iso_639_1")
    val iso6391: String? = null,

    @SerialName("english_name")
    val englishName: String? = null
)

@Serializable
data class BelongsToCollection(

    @SerialName("backdrop_path")
    val backdropPath: String? = null,

    @SerialName("name")
    val name: String? = null,

    @SerialName("id")
    val id: Int? = null,

    @SerialName("poster_path")
    val posterPath: String? = null
)

@Serializable
data class ProductionCompaniesItem(

    @SerialName("logo_path")
    val logoPath: String? = null,

    @SerialName("name")
    val name: String? = null,

    @SerialName("id")
    val id: Int? = null,

    @SerialName("origin_country")
    val originCountry: String? = null
)

@Serializable
data class ProductionCountriesItem(

    @SerialName("iso_3166_1")
    val iso31661: String? = null,

    @SerialName("name")
    val name: String? = null
)

@Serializable
data class GenresItem(

    @SerialName("name")
    val name: String? = null,

    @SerialName("id")
    val id: Int? = null
)
