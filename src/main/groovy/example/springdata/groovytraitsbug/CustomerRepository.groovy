package example.springdata.groovytraitsbug

import org.springframework.data.repository.CrudRepository

interface CustomerRepository extends CrudRepository<Customer, String> {

    List<Customer> findByAge(int age)

}
