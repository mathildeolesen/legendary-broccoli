### Software Engineering og testing H2023 - Oblig 3 - git og continuous integration

Prosjektet er laget med Java og Maven.

**For å få Workflow med kjørende tester gjorde jeg følgende:**

Jeg brukte workflow malen "Java with Maven" på Github Actions.  
Jeg la også til en liten del selv, for bedre oversikt og struktur av selve testene:
```
- name: Run tests with Maven
  run: mvn -B test --file pom.xml
```
Men ser også nå i ettertid at man ser testene like fort og greit i "Build with Maven" som i den separate kommando-kjøringen (om ikke helt kliss likt utenom tittelen).
    
For å få testene til å vises/rapporteres i workflowen, måtte jeg legge til _Surefire Plugin_ i **pom.xml** filen til Maven.  
Denne ble lagt til som en plugin for byggeprosessen av prosjektet (build), fordi den har med selve byggeprosessen og hvordan testene i prosjektet blir håndtert for kjøring og rapportering av testene når den er ferdig kompilert, og ikke for selve laging av tester i koden. 
```
 <build>
        <pluginManagement>
            <plugins>
                <plugin>
                    <!-- Surefire plugin necessary in <build> for workflow testing -->
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-surefire-plugin</artifactId>
                    <version>3.1.2</version>
                </plugin>
            </plugins>
        </pluginManagement>
    </build>
```
