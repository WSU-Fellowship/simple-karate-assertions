package com.KarateReference.simplekarateassertions.courses;

import com.intuit.karate.junit5.Karate;

public class UsersRunner {

    @Karate.Test
    Karate runAllFeaturesInParallel() {
        return Karate.run("karate").relativeTo(getClass());
    }
}
