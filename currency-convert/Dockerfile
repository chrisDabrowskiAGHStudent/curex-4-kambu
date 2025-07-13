FROM eclipse-temurin:17-jdk

WORKDIR /app

# Skopiuj zbudowany JAR z katalogu Gradle
COPY build/libs/currency-convert-*.jar app.jar

# Uruchom aplikację
ENTRYPOINT ["java", "-jar", "app.jar"]
