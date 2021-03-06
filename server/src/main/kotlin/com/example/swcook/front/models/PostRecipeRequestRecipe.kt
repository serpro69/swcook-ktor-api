/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: SWCook API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.example.swcook.front.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property title
 * @property description
 * @property cookingTime
 */
@JsonClass(generateAdapter = true)
data class PostRecipeRequestRecipe(
    @Json(name = "title") @field:Json(name = "title") var title: String,
    @Json(name = "description") @field:Json(name = "description") var description: String,
    @Json(name = "cooking_time") @field:Json(name = "cooking_time") var cookingTime: Int
)
