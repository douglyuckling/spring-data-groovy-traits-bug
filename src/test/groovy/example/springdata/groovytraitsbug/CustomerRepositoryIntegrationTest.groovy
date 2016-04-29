package example.springdata.groovytraitsbug

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.context.annotation.Configuration
import org.springframework.data.mapping.context.InvalidPersistentPropertyPath
import spock.lang.Specification

@SpringApplicationConfiguration(classes = ApplicationConfiguration.class)
class CustomerRepositoryIntegrationTest extends Specification {

    @Configuration
    @EnableAutoConfiguration
    static class ApplicationConfiguration {}

    @Autowired CustomerRepository repository

    def setup() {
        repository.deleteAll()
    }

    def "domain classes using Groovy traits can be saved and retrieved"() {
        given:
        repository.save(new Customer(firstName: 'Dave', lastName: 'Matthews', age: 47))

        when:
        repository.findByAge(47)

        then:
        notThrown InvalidPersistentPropertyPath
    }

}
