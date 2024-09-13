import spock.lang.Specification


class Main_1000_plus_TEST extends Specification {

    def "1 + 2 = 3이다"() {
        given:
        int a = 1
        int b = 2

        when:
        def result = a + b

        then:
        if(result == 3){
            log.info("result : " + result)
        }
    }

}