import com.dicoding.submission_satu.data.model.DetailUserResponse
import com.dicoding.submission_satu.data.model.User
import com.dicoding.submission_satu.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getUserDetail(
        @Path("username") username: String?
        ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}
