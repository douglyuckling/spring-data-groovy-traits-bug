package example.springdata.groovytraitsbug

import org.springframework.data.mongodb.core.mapping.Document

@Document
class Customer implements HasAge {

    String id
    String firstName
    String lastName
}
