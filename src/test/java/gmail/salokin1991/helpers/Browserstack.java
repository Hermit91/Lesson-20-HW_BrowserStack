package gmail.salokin1991.helpers;

import gmail.salokin1991.config.CredentialConfig;
import org.aeonbits.owner.ConfigFactory;

import static io.restassured.RestAssured.given;

public class Browserstack {

    public static CredentialConfig credentials =
            ConfigFactory.create(CredentialConfig.class);

    static String videoUrl = credentials.videoUrl();


    public static String videoUrl(String sessionId) {

        return given()
                .auth().basic("qaguru_B5xciN", "TzFxj7ss7siMKTxUURLy")
                .when()
                .get(videoUrl + sessionId +".json")
                .then()
                .statusCode(200)
                .log().body()
                .extract()
                .path("automation_session.video_url");

    }
}