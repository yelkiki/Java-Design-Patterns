package Adapter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppAuthSystemTest {

    @Test
    public void testGoogleAuth() {
        AppAuthSystem appAuthSystem = new AppAuthSystem();
        GoogleAuthSystem googleAuth = new GoogleAuthSystem();
        appAuthSystem.setAuthAdapter(new AuthAdapter(googleAuth));
        assertTrue(appAuthSystem.authenticate("user@gmail.com", "password"));
    }

    @Test
    public void testFacebookAuth() {
        AppAuthSystem appAuthSystem = new AppAuthSystem();
        FacebookAuthSystem facebookAuth = new FacebookAuthSystem();
        appAuthSystem.setAuthAdapter(new AuthAdapter(facebookAuth));
        assertTrue(appAuthSystem.authenticate("user@facebook.com", "password"));
    }

    @Test
    public void testInstagramAuth() {
        AppAuthSystem appAuthSystem = new AppAuthSystem();
        InstagramAuthSystem instagramAuth = new InstagramAuthSystem();
        appAuthSystem.setAuthAdapter(new AuthAdapter(instagramAuth));
        assertTrue(appAuthSystem.authenticate("user@instagram.com", "password"));
    }
}