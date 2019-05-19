package herosapi;

import model.Heroes;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface HeroesAPI {

    @POST("heroes")
    Call<Void> addHero (@Body Heroes heroes);
}
