package ge.george.btu_exercise_8.model

import com.google.gson.annotations.SerializedName

data class User(
    val id: Int,
    val email: String,
    val avatar: String,
    @SerializedName("first_name") val firstName: String,
    @SerializedName("last_name") val lastName: String
)
