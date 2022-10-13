package examples.users;

import com.intuit.karate.junit5.Karate;

import static com.oracle.truffle.js.runtime.java.JavaPackage.getClass;

class UsersRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("users").relativeTo(getClass());
    }    

}
