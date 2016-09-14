## Intoduction
Follow the step-by-step in this blog post -> https://inthecheesefactory.com/blog/how-to-setup-private-maven-repository/en

## Setup

```groovy
artifactory_username=USERNAME
artifactory_password=PASSWORD
artifactory_host=HOST
```
In **Project Level** `gradle.properties` change `username` and `password` to your Artifactory username and password and `HOST` to your Artifactory URL

## Publishing to Artifactory
```
./gradlew assembleRelease generatePomFileForAarPublication artifactoryPublish
```
