package Adapter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuthAdapterTest {

    @Test
    public void testGoogleAuth() {
        GoogleAuthSystem googleAuth = new GoogleAuthSystem();
        UserAuthentication authAdapter = new AuthAdapter(googleAuth);
        assertTrue(authAdapter.authenticate("user@gmail.com", "password"));
    }

    @Test
    public void testFacebookAuth() {
        FacebookAuthSystem facebookAuth = new FacebookAuthSystem();
        UserAuthentication authAdapter = new AuthAdapter(facebookAuth);
        assertTrue(authAdapter.authenticate("user@facebook.com", "password"));
    }

    @Test
    public void testInstagramAuth() {
        InstagramAuthSystem instagramAuth = new InstagramAuthSystem();
        UserAuthentication authAdapter = new AuthAdapter(instagramAuth);
        assertTrue(authAdapter.authenticate("user@instagram.com", "password"));
    }
}