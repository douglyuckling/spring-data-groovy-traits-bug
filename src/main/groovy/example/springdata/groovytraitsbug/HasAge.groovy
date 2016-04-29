package example.springdata.groovytraitsbug

import org.springframework.data.mongodb.core.mapping.Field

/**
 * A trait for things that have an age.
 *
 * @author Douglas Paul
 */
trait HasAge {
    @Field('age') // Without this, it's persisted as 'example_springdata_groovytraitsbug_HasAge__age' :-(
    int age;
}
