package Adapter;

//Adapter Class
public class AuthAdapter implements UserAuthentication {
 private Object adaptee;

 public AuthAdapter(Object adaptee) {
     this.adaptee = adaptee;
 }

 public boolean authenticate(String username, String password) {
     if (adaptee instanceof GoogleAuthSystem) {
         return ((GoogleAuthSystem) adaptee).signIn(username, password);
     } else if (adaptee instanceof FacebookAuthSystem) {
         return ((FacebookAuthSystem) adaptee).signIn(username, password);
     } else if (adaptee instanceof InstagramAuthSystem) {
         return ((InstagramAuthSystem) adaptee).signIn(username, password);
     }
     return false;
 }
}
