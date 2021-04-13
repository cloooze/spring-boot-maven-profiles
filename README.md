# spring-boot-maven-profiles
Progetto che dimostra l'utilizzo dei profili spring boot con maven

Si possono definire vari profili spring dove ognuno ha il suo application-{profile}.properties.

Quindi creare tanti .properties quanti profili si hanno.

Nel pom.xml definire i profili che si vogliono configurare:
```
<profiles>      	
  	<profile>
    		<id>dev</id>
    		<properties>
    			<activatedProperties>dev</activatedProperties>
    			<test.property>dev</test.property>
		</properties> 
		<activation>
    			<activeByDefault>true</activeByDefault>
		</activation>
  	</profile>
</profiles>
```

e sotto il tag <build> il filtering:
```
<resources>
    <resource>
        <directory>src/main/resources</directory>
        <filtering>true</filtering>
    </resource>
</resources>
```

Ora nell'application.properties (solo quello 'local') definire la property:
spring.profiles.active=@activatedProperties@

In questo caso di default se nessun profilo verrà specificato in fase di build verrà caricato il 'dev'.
Questo vuol dire che tutte le property esistenti sia nel .properties 'local' che nel -dev.properties verranno caricate.
Le properties con stessa chiave presenti in entrambi i file verranno sovrascritte con quelle presenti nel -dev.properties.

E' possibile impostare un profilo diverso da quello di default lanciando l'applicazione da riga di comando e passare la property:
mvn spring-boot:run -Dspring-boot.run.profiles=prod
