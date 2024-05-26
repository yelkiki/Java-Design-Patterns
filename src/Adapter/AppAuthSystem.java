package Adapter;

public class AppAuthSystem implements UserAuthentication {
    private UserAuthentication authAdapter;

    public void setAuthAdapter(UserAuthentication authAdapter) {
        this.authAdapter = authAdapter;
    }

    public boolean authenticate(String username, String password) {
        return authAdapter.authenticate(username, password);
    }

    public static void main(String[] args) {
        AppAuthSystem appAuthSystem = new AppAuthSystem();

        // Test Google Authentication
        GoogleAuthSystem googleAuth = new GoogleAuthSystem();
        appAuthSystem.setAuthAdapter(new AuthAdapter(googleAuth));
        System.out.println("Google Auth: " + appAuthSystem.authenticate("user@gmail.com", "password"));

        // Test Facebook Authentication
        FacebookAuthSystem facebookAuth = new FacebookAuthSystem();
        appAuthSystem.setAuthAdapter(new AuthAdapter(facebookAuth));
        System.out.println("Facebook Auth: " + appAuthSystem.authenticate("user@facebook.com", "password"));

        // Test Instagram Authentication
        InstagramAuthSystem instagramAuth = new InstagramAuthSystem();
        appAuthSystem.setAuthAdapter(new AuthAdapter(instagramAuth));
        System.out.println("Instagram Auth: " + appAuthSystem.authenticate("user@instagram.com", "password"));
    }
}
